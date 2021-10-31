package com.peerlender.lendingengine.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peerlender.lendingengine.domain.model.Loan;
import com.peerlender.lendingengine.domain.model.Status;
import com.peerlender.lendingengine.domain.model.User;

public interface LoanRepository extends JpaRepository<Loan,Long> {

	
	List<Loan> findAllByBorrowerAndStatus(User borrower,Status status);
	List<Loan> findAllByLenderAndStatus(User lender,Status status);
	Optional<Loan> findOneByIdAndBorrower(long id, User borrower);
	
}
