package com.testApplication;

import java.util.Map;

public class AxiomaResponseTo 
{
	private String id;
	private String description;
	private LFUnit unit;
	private Map<String,Number> data;
	private Warnings warningsList;
//	private List<String> warnings;

	public Warnings getWarningsList() {
		return warningsList;
	}
	public void setWarningsList(Warnings warningsList) {
		this.warningsList = warningsList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LFUnit getUnit() {
		return unit;
	}
	public void setUnit(LFUnit unit) {
		this.unit = unit;
	}
	public Map<String, Number> getData() {
		return data;
	}
	public void setData(Map<String, Number> data) {
		this.data = data;
	}
}