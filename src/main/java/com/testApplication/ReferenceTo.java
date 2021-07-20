package com.testApplication;

import java.io.Serializable;

import com.fasterxml.jackson.databind.type.ReferenceType;

public class ReferenceTo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -114562304443449175L;
	private String name;
	private ReferenceType referencetType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ReferenceType getReferencetType() {
		return referencetType;
	}
	public void setReferencetType(ReferenceType referencetType) {
		this.referencetType = referencetType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((referencetType == null) ? 0 : referencetType.hashCode());
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
		ReferenceTo other = (ReferenceTo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (referencetType == null) {
			if (other.referencetType != null)
				return false;
		} else if (!referencetType.equals(other.referencetType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ReferenceTo [name=" + name + ", referencetType=" + referencetType + "]";
	}
	

}
