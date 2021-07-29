package com.app.moneybudgetapppro.expense;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins="http://localhost:4400")
public class ExpenseJPAResource {

	
	@Autowired
	private ExpenseJPARepository expenseJPARepository;

	/*
	 * Retrieve All Expenses for a User
	 * GET /api/users/{username}/expenses
	 * 
	 * Delete an Expense 
	 * DELETE /api/users/{username}/expenses/{id}
	 * 
	 * Create an Expense
	 * POST /api/users/{username}/expenses/
	 * 
	 */
	
	@GetMapping("/api/users/{username}/expenses")
	public List <Expense> getAllExpenses(@PathVariable 
			String username){
		return expenseJPARepository.findByUsername(username);
	}
	
		
	@DeleteMapping("/api/users/{username}/expenses/{id}")
	public ResponseEntity <String> deleteExpense (@PathVariable String username, 
			@PathVariable long id){
		expenseJPARepository.deleteById(id);
		String response = "Expense successfully deleted!";
		return ResponseEntity.ok(response);
	}
	
	
	@PostMapping("/api/users/{username}/expenses")
	public ResponseEntity <String> createExpense (@PathVariable String username,
			@RequestBody Expense expense){
		
		expense.setUsername(username);
		
		Expense createdExpense = expenseJPARepository.save(expense);
		/*
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				   .buildAndExpand(createdExpense.getId()).toUri();
		
		
		return ResponseEntity.created(uri).build();
		*/
		
		String response = "Expense successfully created";
		return ResponseEntity.ok(response);
	}
	
	
	
	
	
	
	
	
	
}
