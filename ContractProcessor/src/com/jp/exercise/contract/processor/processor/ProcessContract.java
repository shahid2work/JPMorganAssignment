package com.jp.exercise.contract.processor.processor;

import com.jp.exercise.contract.processor.model.Contract;
import com.jp.exercise.contract.processor.model.ContractResponse;
import com.jp.exercise.contract.processor.model.Trade;

public interface ProcessContract {

	public ContractResponse process(Trade trades,Contract contracts,int time);
	
}
