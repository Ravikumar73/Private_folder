package com.testApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class AxiomaHoldsAndRestictsServiceImpl implements AxiomaHoldsAndRestictsService{
	private ConstraintService constraintservice;
	public AxiomaHoldsAndRestictsServiceImpl(ConstraintService constraintService) {
		this.constraintservice = constraintService;
	}

	private String getAxiomGroupNameSuffix(ControlType controlType,String accountId) {
		String suffix = "";
		switch(controlType.name()) {
		case "HOLD":
			suffix="Holds";
			break;
		case "RESTRICT":
			suffix="Restricts";
			break;
		default:
			break;
		}
		return "_"+suffix+"_"+accountId;
	}
	@Override
	public List<AxiomaResponseTo> getAxiomaControlData(String accountId, LocalDate effectiveDate,ControlType controlType) throws JsonParseException, JsonMappingException, IOException{
		List<InvestmentListTo> controlData = constraintservice.constructInvestementLists(accountId,effectiveDate,controlType);
		List<AxiomaResponseTo> axiomaResponseToList = new ArrayList<AxiomaResponseTo>();
		
		if(controlData == null) {
			return null;
		}else {

			Map<String,Number> sellControlData = new HashMap<String, Number>();
			Map<String,Number> buyControlData = new HashMap<String, Number>();
			Map<String,Number> buyAndSellControlData = new HashMap<String, Number>();
			Map<String,Number> shortControlData = new HashMap<String, Number>();
			Map<String,Number> coverControlData = new HashMap<String, Number>();
			controlData.forEach(cd ->{
				
				if(InvestmentListSide.NO_BUY.equals(cd.getHoldIndicator())){
					buyControlData.put(cd.getMemberId(), 1.0);
					buyAndSellControlData.put(cd.getMemberId(), 1.0);
				}
				else 
					if(InvestmentListSide.NO_SELL.equals(cd.getHoldIndicator())){
						sellControlData.put(cd.getMemberId(), 1.0);
						buyAndSellControlData.put(cd.getMemberId(), 1.0);
					
					}
					else 
						if(InvestmentListSide.NO_SHORT.equals(cd.getHoldIndicator())){
							shortControlData.put(cd.getMemberId(), 1.0);
						}
						else 
							if(InvestmentListSide.NO_COVER.equals(cd.getHoldIndicator())){
								coverControlData.put(cd.getMemberId(), 1.0);
							}

			});
			
			String groupNameSuffix = null;
				InvestmentListTo ivLst = controlData.stream().filter(a->a.getPortfolioId().equalsIgnoreCase(accountId)).findAny().orElse(null);
				if(ivLst != null)
			 groupNameSuffix = getAxiomGroupNameSuffix(controlType, ivLst.getPortfolioId());
			
			
				if(groupNameSuffix != null) {
			
			AxiomaResponseTo sellAxiomoRes = new AxiomaResponseTo();
			sellAxiomoRes.setId("SYS.SELL"+groupNameSuffix);
			sellAxiomoRes.setDescription("All holds that have sell restrictions ; effectiveDate="+effectiveDate);
			sellAxiomoRes.setUnit(LFUnit.NUMBER);
			sellAxiomoRes.setData(buyAndSellControlData);
			Warnings war = new Warnings();
			Map<String,String> warMap = new HashMap<String, String>();
			war.setWarnings(warMap);
			sellAxiomoRes.setWarningsList(war);
			
			AxiomaResponseTo buyAxiomoRes = new AxiomaResponseTo();
			buyAxiomoRes.setId("SYS.SELL"+groupNameSuffix);
			buyAxiomoRes.setDescription("All holds that have sell restrictions ; effectiveDate="+effectiveDate);
			buyAxiomoRes.setUnit(LFUnit.NUMBER);
			sellAxiomoRes.setData(buyAndSellControlData);
			Warnings buywar = new Warnings();
			Map<String,String> buywarMap = new HashMap<String, String>();
			war.setWarnings(buywarMap);
			buyAxiomoRes.setWarningsList(buywar);
			
			AxiomaResponseTo buyAndSellAxiomoRes = new AxiomaResponseTo();
			buyAndSellAxiomoRes.setId("SYS.SELL"+groupNameSuffix);
			buyAndSellAxiomoRes.setDescription("All holds that have sell restrictions ; effectiveDate="+effectiveDate);
			buyAndSellAxiomoRes.setUnit(LFUnit.NUMBER);
			buyAndSellAxiomoRes.setData(buyAndSellControlData);
			Warnings buyAndSellwar = new Warnings();
			Map<String,String> buyAndSellwarMap = new HashMap<String, String>();
			war.setWarnings(buyAndSellwarMap);
			buyAndSellAxiomoRes.setWarningsList(buyAndSellwar);
			
			AxiomaResponseTo shortAxiomoRes = new AxiomaResponseTo();
			shortAxiomoRes.setId("SYS.SELL"+groupNameSuffix);
			shortAxiomoRes.setDescription("All holds that have sell restrictions ; effectiveDate="+effectiveDate);
			shortAxiomoRes.setUnit(LFUnit.NUMBER);
			shortAxiomoRes.setData(buyAndSellControlData);
			Warnings shortwar = new Warnings();
			Map<String,String> shortwarMap = new HashMap<String, String>();
			war.setWarnings(shortwarMap);
			shortAxiomoRes.setWarningsList(shortwar);
			
			AxiomaResponseTo coverAxiomoRes = new AxiomaResponseTo();
			coverAxiomoRes.setId("SYS.SELL"+groupNameSuffix);
			coverAxiomoRes.setDescription("All holds that have sell restrictions ; effectiveDate="+effectiveDate);
			coverAxiomoRes.setUnit(LFUnit.NUMBER);
			coverAxiomoRes.setData(buyAndSellControlData);
			Warnings coverwar = new Warnings();
			Map<String,String> coverwarMap = new HashMap<String, String>();
			war.setWarnings(coverwarMap);
			coverAxiomoRes.setWarningsList(coverwar);
			

			axiomaResponseToList.addAll(Arrays.asList(sellAxiomoRes,buyAxiomoRes,buyAndSellAxiomoRes,shortAxiomoRes,coverAxiomoRes));
				}
				}
		return axiomaResponseToList;
		}
	}
