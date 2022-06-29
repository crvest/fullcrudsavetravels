package com.chadvest.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chadvest.savetravels.models.Expense;
import com.chadvest.savetravels.services.ExpenseService;

@Controller
@RequestMapping("/expenses")
public class RootController
{
	
	@Autowired
	private ExpenseService expenseService;
	

	@GetMapping("")
	public String index(Model model)
	{
		model.addAttribute("expense", new Expense());
		model.addAttribute("expenses", expenseService.findAll());
		return "index";
	}
	
	@PostMapping("")
	public String createExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult res)
	{
		if(res.hasErrors())
		{
			return "index";
		}
		expenseService.create(expense);
		return "redirect:/expenses";
	}
	
	@PostMapping("/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long expenseId)
	{
		expenseService.deleteExpense(expenseId);
		return "redirect:/expenses";
	}
	
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long expenseId, Model model)
	{
		model.addAttribute("expense", expenseService.findOne(expenseId));
		return "show";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long expenseId, Model model)
	{
		model.addAttribute("expense", expenseService.findOne(expenseId));
		return "edit";
	}
	
	@PostMapping("/edit/{id}")
	public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult res)
	{
		if(res.hasErrors())
		{
			return "edit";
		}
		expenseService.update(expense);
		return "redirect:/expenses";
	}
	
	
};