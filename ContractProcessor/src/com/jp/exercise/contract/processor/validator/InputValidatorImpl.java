package com.jp.exercise.contract.processor.validator;

import com.jp.exercise.contract.processor.model.Contract;
import com.jp.exercise.contract.processor.model.Trade;

public class InputValidatorImpl implements InputValidator  {

	@Override
	public boolean validateContract(Contract contract) {
		if(contract==null || contract.getDescription()==null) {
		return false;
		}
		else return true;
	}

	@Override
	public boolean validateTrade(Trade trade) {

		if(trade==null || trade.getSlaData()==null ) {
			return false;
		}
		
		return true;
	}

}
