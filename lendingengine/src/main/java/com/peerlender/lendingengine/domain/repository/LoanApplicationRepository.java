package com.peerlender.lendingengine.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peerlender.lendingengine.domain.model.LoanApplication;
import com.peerlender.lendingengine.domain.model.Status;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Long> {

	List<LoanApplication> findAllByStatusEquals(Status status );
	
}
