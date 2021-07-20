package com.testApplication;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Component
public class ConstraintServiceImpl implements ConstraintService{

	@Override
	public List<InvestmentListTo> constructInvestementLists(String accountId, LocalDate effectiveDate,
			ControlType controlType) throws JsonParseException, JsonMappingException, IOException {

//		List<InvestmentListTo> InvestmentListToList = new ArrayList<InvestmentListTo>();
//		
//		InvestmentListTo inv = new InvestmentListTo();
		
		ObjectMapper objectMapper = new ObjectMapper();
        //Set pretty printing of json
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
 
		TypeReference<List<InvestmentListTo>> mapType = new TypeReference<List<InvestmentListTo>>() {};
        List<InvestmentListTo> jsonToPersonList = objectMapper.readValue(
        		new File("C:\\Users\\RavikumarTamada\\git\\repository\\spring-boot-rest-example\\target\\JSON.json"), 
        		mapType);
        System.out.println(jsonToPersonList);
        
		 return jsonToPersonList;
	}

}
