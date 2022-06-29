package com.chadvest.savetravels.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chadvest.savetravels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>
{

}
