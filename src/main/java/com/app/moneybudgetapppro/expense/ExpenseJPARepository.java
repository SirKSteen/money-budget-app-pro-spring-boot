package com.app.moneybudgetapppro.expense;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseJPARepository extends JpaRepository <Expense, Long>{
	List <Expense> findByUsername(String username);
}
