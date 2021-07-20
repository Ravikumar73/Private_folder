package com.testApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
@RestController
public class AxiomaHoldsAndRestrictionsController 
{
	private AxiomaHoldsAndRestictsService axiomaHoldsAndRestictsService;
	public AxiomaHoldsAndRestrictionsController(AxiomaHoldsAndRestictsService axiomaHoldsAndRestictsService) {
		this.axiomaHoldsAndRestictsService = axiomaHoldsAndRestictsService;
	}
	@RequestMapping(value = "/{accountId}/axiomaResticts", method = RequestMethod.GET)
	@ApiOperation(value = "Returns a list of all OIDC users") 
	@ApiImplicitParams({
		@ApiImplicitParam(name="accountId",value="Account Id ",example="CG19",dataType="String",paramType="path",required=true),
		@ApiImplicitParam(name="effectiveDate",value="Effective Date",example="2019-88-39",dataType="String",paramType="query",required=false)
	})
	public ResponseEntity<List<AxiomaResponseTo>> getAxiomaRestricts(@PathVariable (value="accountId") String accountId,
			@RequestParam(value="effectiveDate" ,required = false)  @DateTimeFormat(iso = ISO.DATE) LocalDate effectiveDate) throws JsonParseException, JsonMappingException, IOException
	{
		List<AxiomaResponseTo> holds = axiomaHoldsAndRestictsService.getAxiomaControlData(accountId, effectiveDate, ControlType.RESTRICT);
		ResponseEntity<List<AxiomaResponseTo>> res = null;
		if(holds != null && !holds.isEmpty()) {
			res = ResponseEntity.ok(holds);
		}else {
			res = ResponseEntity.noContent().build();
		}

		return res;
	}
}
