package com.jp.exercise.contract.processor.model;

public class ContractResponse {

	Trade trades;
	Contract contract;
	
	int contractTime;

	public Trade getTrades() {
		return trades;
	}

	public void setTrades(Trade trades) {
		this.trades = trades;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public int getContractTime() {
		return contractTime;
	}

	public void setContractTime(int contractTime) {
		this.contractTime = contractTime;
	}
	
	
	
}
