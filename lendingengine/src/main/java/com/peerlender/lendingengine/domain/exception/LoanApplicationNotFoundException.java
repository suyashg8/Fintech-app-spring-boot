package com.peerlender.lendingengine.domain.exception;

public class LoanApplicationNotFoundException extends RuntimeException {

	public LoanApplicationNotFoundException(long loanApplicationId) {
		super("Loan Application with ID:" + loanApplicationId + "was not found");
	}
}
