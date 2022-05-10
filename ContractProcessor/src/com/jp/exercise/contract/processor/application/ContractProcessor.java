package com.jp.exercise.contract.processor.application;

import com.jp.exercise.contract.processor.model.Contract;
import com.jp.exercise.contract.processor.model.ContractResponse;
import com.jp.exercise.contract.processor.model.Trade;
import com.jp.exercise.contract.processor.processor.ProcessContract;
import com.jp.exercise.contract.processor.processor.ProcessContractImpl;
import com.jp.exercise.contract.processor.validator.InputValidator;
import com.jp.exercise.contract.processor.validator.InputValidatorImpl;

public class ContractProcessor {

/**
 * Assuming that the input is single entry 
 * 
 * for Multiple entries the Process method params can be modified to List
 * 
 * Assuming that the inputs for the Trade and Contract object are read from CSV using the FileUtil method
 * 	
 * @param args
 */
	
	public static void main(String[] args) {
		
		InputValidator validator = new InputValidatorImpl();
		ProcessContract processor = new ProcessContractImpl();
		ContractResponse response = new ContractResponse();
		
		int timeLine = 5000; //ms
		
		Trade trades = new Trade(1,50,null);
		
		Contract contracts = new Contract(1,"ThisIsAContract");
		
		if(validator.validateContract(contracts) && validator.validateTrade(trades)) {
			response = processor.process(trades, contracts, timeLine);
		}
		
		System.out.println("Contracts and Trades: \n"+response.toString());
	}

}
