package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class States implements Serializable {
	@Id
	@Column(name="state_Id")
	private Integer stateId;
	
	@Column(name="country_Id")
	private Integer countryId;
	private String name;
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", countryId=" + countryId + ", name=" + name + "]";
	}
	
}
