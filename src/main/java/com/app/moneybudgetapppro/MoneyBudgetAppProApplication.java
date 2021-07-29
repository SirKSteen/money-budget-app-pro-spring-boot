package com.app.moneybudgetapppro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.moneybudgetapppro.expense.ExpenseJPARepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = ExpenseJPARepository.class)
public class MoneyBudgetAppProApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyBudgetAppProApplication.class, args);
	}

}
