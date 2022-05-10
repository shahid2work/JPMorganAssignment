package com.jp.exercise.contract.processor.processor;

import com.jp.exercise.contract.processor.model.Contract;
import com.jp.exercise.contract.processor.model.ContractResponse;
import com.jp.exercise.contract.processor.model.Trade;

public class ProcessContractImpl implements ProcessContract{

	@Override
	public ContractResponse process(Trade trades, Contract contracts, int time) {
		
		ContractResponse reponseObject = new ContractResponse();
		
		if(trades.getUniqueID()==contracts.getUniqueID()) {
			reponseObject.setContract(contracts);
			reponseObject.setTrades(trades);
			reponseObject.setTrades(trades);
		}
		
		return null;
	}

}
