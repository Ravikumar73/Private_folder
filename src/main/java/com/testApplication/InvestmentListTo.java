package com.testApplication;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InvestmentListTo 
{
	private String reason;
	private String memberComment;
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date memberLastModifiedDateTime;
	private String memberName;
	private String investmentLastMemberId;
	private Date dateFrom;
	private String listType;
	private String memberLastModifiedBy;
	private String portfolioId;
	private Date dateTo;
	private String listName;
	private String memberType;
	private String memberSubType;
	private boolean memberActiveFlag;
	private String holdIndicator;
	private String memberId;
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getMemberComment() {
		return memberComment;
	}
	public void setMemberComment(String memberComment) {
		this.memberComment = memberComment;
	}
	public Date getMemberLastModifiedDateTime() {
		return memberLastModifiedDateTime;
	}
	public void setMemberLastModifiedDateTime(Date memberLastModifiedDateTime) {
		this.memberLastModifiedDateTime = memberLastModifiedDateTime;
	}
	public String getmemberName() {
		return memberName;
	}
	public void setmemberName(String memberName) {
		memberName = memberName;
	}
	public String getInvestmentLastMemberId() {
		return investmentLastMemberId;
	}
	public void setInvestmentLastMemberId(String investmentLastMemberId) {
		this.investmentLastMemberId = investmentLastMemberId;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getListType() {
		return listType;
	}
	public void setListType(String listType) {
		this.listType = listType;
	}
	public String getMemberLastModifiedBy() {
		return memberLastModifiedBy;
	}
	public void setMemberLastModifiedBy(String memberLastModifiedBy) {
		this.memberLastModifiedBy = memberLastModifiedBy;
	}
	public String getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getMemberSubType() {
		return memberSubType;
	}
	public void setMemberSubType(String memberSubType) {
		this.memberSubType = memberSubType;
	}
	public boolean isMemberActiveFlag() {
		return memberActiveFlag;
	}
	public void setMemberActiveFlag(boolean memberActiveFlag) {
		this.memberActiveFlag = memberActiveFlag;
	}
	public String getHoldIndicator() {
		return holdIndicator;
	}
	public void setHoldIndicator(String holdIndicator) {
		this.holdIndicator = holdIndicator;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((dateFrom == null) ? 0 : dateFrom.hashCode());
		result = prime * result + ((dateTo == null) ? 0 : dateTo.hashCode());
		result = prime * result + ((holdIndicator == null) ? 0 : holdIndicator.hashCode());
		result = prime * result + ((investmentLastMemberId == null) ? 0 : investmentLastMemberId.hashCode());
		result = prime * result + ((listName == null) ? 0 : listName.hashCode());
		result = prime * result + ((listType == null) ? 0 : listType.hashCode());
		result = prime * result + (memberActiveFlag ? 1231 : 1237);
		result = prime * result + ((memberComment == null) ? 0 : memberComment.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberLastModifiedBy == null) ? 0 : memberLastModifiedBy.hashCode());
		result = prime * result + ((memberLastModifiedDateTime == null) ? 0 : memberLastModifiedDateTime.hashCode());
		result = prime * result + ((memberSubType == null) ? 0 : memberSubType.hashCode());
		result = prime * result + ((memberType == null) ? 0 : memberType.hashCode());
		result = prime * result + ((portfolioId == null) ? 0 : portfolioId.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
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
		InvestmentListTo other = (InvestmentListTo) obj;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (dateFrom == null) {
			if (other.dateFrom != null)
				return false;
		} else if (!dateFrom.equals(other.dateFrom))
			return false;
		if (dateTo == null) {
			if (other.dateTo != null)
				return false;
		} else if (!dateTo.equals(other.dateTo))
			return false;
		if (holdIndicator == null) {
			if (other.holdIndicator != null)
				return false;
		} else if (!holdIndicator.equals(other.holdIndicator))
			return false;
		if (investmentLastMemberId == null) {
			if (other.investmentLastMemberId != null)
				return false;
		} else if (!investmentLastMemberId.equals(other.investmentLastMemberId))
			return false;
		if (listName == null) {
			if (other.listName != null)
				return false;
		} else if (!listName.equals(other.listName))
			return false;
		if (listType == null) {
			if (other.listType != null)
				return false;
		} else if (!listType.equals(other.listType))
			return false;
		if (memberActiveFlag != other.memberActiveFlag)
			return false;
		if (memberComment == null) {
			if (other.memberComment != null)
				return false;
		} else if (!memberComment.equals(other.memberComment))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (memberLastModifiedBy == null) {
			if (other.memberLastModifiedBy != null)
				return false;
		} else if (!memberLastModifiedBy.equals(other.memberLastModifiedBy))
			return false;
		if (memberLastModifiedDateTime == null) {
			if (other.memberLastModifiedDateTime != null)
				return false;
		} else if (!memberLastModifiedDateTime.equals(other.memberLastModifiedDateTime))
			return false;
		if (memberSubType == null) {
			if (other.memberSubType != null)
				return false;
		} else if (!memberSubType.equals(other.memberSubType))
			return false;
		if (memberType == null) {
			if (other.memberType != null)
				return false;
		} else if (!memberType.equals(other.memberType))
			return false;
		if (portfolioId == null) {
			if (other.portfolioId != null)
				return false;
		} else if (!portfolioId.equals(other.portfolioId))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InvestmentListTo [reason=" + reason + ", memberComment=" + memberComment
				+ ", memberLastModifiedDateTime=" + memberLastModifiedDateTime + ", memberName=" + memberName
				+ ", investmentLastMemberId=" + investmentLastMemberId + ", dateFrom=" + dateFrom + ", listType="
				+ listType + ", memberLastModifiedBy=" + memberLastModifiedBy + ", portfolioId=" + portfolioId
				+ ", dateTo=" + dateTo + ", listName=" + listName + ", memberType=" + memberType + ", memberSubType="
				+ memberSubType + ", memberActiveFlag=" + memberActiveFlag + ", holdIndicator=" + holdIndicator
				+ ", memberId=" + memberId + "]";
	}
	

}
//	{
////		private String listName;
////		private String listType;
////		private String holdIndicator;
////		private String memberType;
////		private String side;
//
//		private ControlType controlType;
//		private ReferenceTo reference;
//		private InvestmentListSide side;
//		private InvestmentListKey invesListKey;
//		
//		
//		public InvestmentListKey getInvesListKey() {
//			return invesListKey;
//		}
//		public void setInvesListKey(InvestmentListKey invesListKey) {
//			this.invesListKey = invesListKey;
//		}
//		public InvestmentListSide getSide() {
//			return side;
//		}
//		public void setSide(InvestmentListSide side) {
//			this.side = side;
//		}
//		public ControlType getControlType() {
//			return controlType;
//		}
//		public void setControlType(ControlType controlType) {
//			this.controlType = controlType;
//		}
//		public ReferenceTo getreference() {
//			return reference;
//		}
//		public void setreference(ReferenceTo reference) {
//			this.reference = reference;
//		}
////		public InvestementListSide getInvestementListSide() {
////			return investementListSide;
////		}
////		public void setInvestementListSide(InvestementListSide investementListSide) {
////			this.investementListSide = investementListSide;
////		}
//	public String getListName() {
//			return listName;
//		}
//		public void setListName(String listName) {
//			this.listName = listName;
//		}
//		public String getListType() {
//			return listType;
//		}
//		public void setListType(String listType) {
//			this.listType = listType;
//		}
//		public String getHoldIndicator() {
//			return holdIndicator;
//		}
//		public void setHoldIndicator(String holdIndicator) {
//			this.holdIndicator = holdIndicator;
//		}
//		public String getMemberType() {
//			return memberType;
//		}
//		public void setMemberType(String memberType) {
//			this.memberType = memberType;
//		}
//
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + ((controlType == null) ? 0 : controlType.hashCode());
//			result = prime * result + ((holdIndicator == null) ? 0 : holdIndicator.hashCode());
//			result = prime * result + ((invesListKey == null) ? 0 : invesListKey.hashCode());
//			result = prime * result + ((listName == null) ? 0 : listName.hashCode());
//			result = prime * result + ((listType == null) ? 0 : listType.hashCode());
//			result = prime * result + ((memberType == null) ? 0 : memberType.hashCode());
//			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
//			result = prime * result + ((side == null) ? 0 : side.hashCode());
//			return result;
//		}
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			InvestmentListTo other = (InvestmentListTo) obj;
//			if (controlType != other.controlType)
//				return false;
//			if (holdIndicator == null) {
//				if (other.holdIndicator != null)
//					return false;
//			} else if (!holdIndicator.equals(other.holdIndicator))
//				return false;
//			if (invesListKey == null) {
//				if (other.invesListKey != null)
//					return false;
//			} else if (!invesListKey.equals(other.invesListKey))
//				return false;
//			if (listName == null) {
//				if (other.listName != null)
//					return false;
//			} else if (!listName.equals(other.listName))
//				return false;
//			if (listType == null) {
//				if (other.listType != null)
//					return false;
//			} else if (!listType.equals(other.listType))
//				return false;
//			if (memberType == null) {
//				if (other.memberType != null)
//					return false;
//			} else if (!memberType.equals(other.memberType))
//				return false;
//			if (reference == null) {
//				if (other.reference != null)
//					return false;
//			} else if (!reference.equals(other.reference))
//				return false;
//			if (side != other.side)
//				return false;
//			return true;
//		}
//		@Override
//		public String toString() {
//			return "InvestmentListTo [listName=" + listName + ", listType=" + listType + ", holdIndicator="
//					+ holdIndicator + ", memberType=" + memberType + ", controlType=" + controlType + ", reference="
//					+ reference + ", side=" + side + ", invesListKey=" + invesListKey + "]";
//		}
//		public ReferenceTo getReference() {
//			return reference;
//		}
//		public void setReference(ReferenceTo reference) {
//			this.reference = reference;
//		}
//		
//
//	}
