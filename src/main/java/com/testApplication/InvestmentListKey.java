package com.testApplication;

public class InvestmentListKey {
	private String portfolioId;
	private String holdSubType;
	private String holdSubId;
	private String holdType;
	private String side;
	private String controlType;;
	

	public String getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}
	public String getHoldSubType() {
		return holdSubType;
	}
	public void setHoldSubType(String holdSubType) {
		this.holdSubType = holdSubType;
	}
	public String getHoldSubId() {
		return holdSubId;
	}
	public void setHoldSubId(String holdSubId) {
		this.holdSubId = holdSubId;
	}
	public String getHoldType() {
		return holdType;
	}
	public void setHoldType(String holdType) {
		this.holdType = holdType;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getControlType() {
		return controlType;
	}
	public void setControlType(String controlType) {
		this.controlType = controlType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((controlType == null) ? 0 : controlType.hashCode());
		result = prime * result + ((holdSubId == null) ? 0 : holdSubId.hashCode());
		result = prime * result + ((holdSubType == null) ? 0 : holdSubType.hashCode());
		result = prime * result + ((holdType == null) ? 0 : holdType.hashCode());
		result = prime * result + ((portfolioId == null) ? 0 : portfolioId.hashCode());
		result = prime * result + ((side == null) ? 0 : side.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvestmentListKey other = (InvestmentListKey) obj;
		if (controlType == null) {
			if (other.controlType != null)
				return false;
		} else if (!controlType.equals(other.controlType))
			return false;
		if (holdSubId == null) {
			if (other.holdSubId != null)
				return false;
		} else if (!holdSubId.equals(other.holdSubId))
			return false;
		if (holdSubType == null) {
			if (other.holdSubType != null)
				return false;
		} else if (!holdSubType.equals(other.holdSubType))
			return false;
		if (holdType == null) {
			if (other.holdType != null)
				return false;
		} else if (!holdType.equals(other.holdType))
			return false;
		if (portfolioId == null) {
			if (other.portfolioId != null)
				return false;
		} else if (!portfolioId.equals(other.portfolioId))
			return false;
		if (side == null) {
			if (other.side != null)
				return false;
		} else if (!side.equals(other.side))
			return false;
		return true;
	}

	

}
