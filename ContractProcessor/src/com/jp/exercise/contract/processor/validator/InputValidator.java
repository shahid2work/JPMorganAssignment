package com.jp.exercise.contract.processor.validator;

import com.jp.exercise.contract.processor.model.Contract;
import com.jp.exercise.contract.processor.model.Trade;

public interface InputValidator {
	
	public boolean validateContract(Contract contract);
	
	public boolean validateTrade(Trade trade);

}
