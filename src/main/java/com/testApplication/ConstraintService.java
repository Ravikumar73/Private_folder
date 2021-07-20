package com.testApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public interface ConstraintService {

	public List<InvestmentListTo> constructInvestementLists(String accountId,LocalDate effectiveDate,ControlType controlType) throws JsonParseException, JsonMappingException, IOException;
}
