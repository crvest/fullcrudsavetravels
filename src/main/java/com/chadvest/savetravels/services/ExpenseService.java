package com.chadvest.savetravels.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chadvest.savetravels.models.Expense;
import com.chadvest.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService 
{
	@Autowired
	private ExpenseRepository expenseRepository;
	

	// create
	public void create(Expense expense)
	{
		expenseRepository.save(expense);
	}
	
	// select * from expense
	public ArrayList<Expense> findAll()
	{
		return (ArrayList<Expense>) expenseRepository.findAll();
	}
	
	// find one by id
	public Expense findOne(Long id)
	{
		Optional<Expense> expense=expenseRepository.findById(id);
		return expense.isPresent()?expense.get():null;
	}
	
	// update
	public void update(Expense expense)
	{
		expenseRepository.save(expense);
	}
	
	// delete
	public void deleteExpense(Long id)
	{
		expenseRepository.deleteById(id);
	}

}
