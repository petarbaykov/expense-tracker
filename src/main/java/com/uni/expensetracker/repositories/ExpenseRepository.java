package com.uni.expensetracker.repositories;

import com.uni.expensetracker.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
//public interface ExpenseRepository extends JpaRepository<Expense, Long> {
//
//}
@RepositoryRestResource(collectionResourceRel = "expenses", path = "expenses")
public interface ExpenseRepository extends PagingAndSortingRepository<Expense, Long> {

}
