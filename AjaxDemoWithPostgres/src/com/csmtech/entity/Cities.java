package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cities implements Serializable {
	@Id
	@Column(name="city_id")
	private Integer cityId;
	@Column(name="state_id")
	private Integer stateId;
	private String name;
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cities [cityId=" + cityId + ", stateId=" + stateId + ", name=" + name + "]";
	}
	
}
