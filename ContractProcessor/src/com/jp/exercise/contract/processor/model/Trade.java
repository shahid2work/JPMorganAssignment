package com.jp.exercise.contract.processor.model;

public class Trade {

	int uniqueID;
	int valueInPounds;
	SLA slaData;
	
	public int getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	public int getValueInPounds() {
		return valueInPounds;
	}
	public void setValueInPounds(int valueInPounds) {
		this.valueInPounds = valueInPounds;
	}
	public SLA getSlaData() {
		return slaData;
	}
	public void setSlaData(SLA slaData) {
		this.slaData = slaData;
	}
	
	
	
}
