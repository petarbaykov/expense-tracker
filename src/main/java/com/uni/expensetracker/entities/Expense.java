package com.uni.expensetracker.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="expenses")
@Setter
@Getter
@ToString
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal amount;
    private String note;
    private Long createdAt;
}
