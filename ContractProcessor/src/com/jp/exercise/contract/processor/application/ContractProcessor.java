package com.jp.exercise.contract.processor.application;

import com.jp.exercise.contract.processor.validator.InputValidator;
import com.jp.exercise.contract.processor.validator.InputValidatorImpl;

public class ContractProcessor {

	public static void main(String[] args) {
		
		InputValidator validator = new InputValidatorImpl();
		ProcessContract processor = new ProcessContractImpl();
		

	}

}
