package com.uni.expensetracker.services;

import com.uni.expensetracker.entities.Expense;
import com.uni.expensetracker.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Service
public class ExpenseServiceImplementation implements ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return new List<Expense>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Expense> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Expense expense) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Expense> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Expense> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Expense get(int index) {
                return null;
            }

            @Override
            public Expense set(int index, Expense element) {
                return null;
            }

            @Override
            public void add(int index, Expense element) {

            }

            @Override
            public Expense remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Expense> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Expense> listIterator(int index) {
                return null;
            }

            @Override
            public List<Expense> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
//        return expenseRepository.findAll();
    }
}
