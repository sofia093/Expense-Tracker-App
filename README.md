# Expense Tracker App

A simple Java console app to track daily expenses and generate reports using **Java Streams**.

## Features
- Add expenses: description, amount, category, date  
- List all expenses  
- Calculate total expenses  
- Filter by category or date range  
- Weekly and monthly reports  

## Usage
```java
ExpenseManager manager = new ExpenseManager();
manager.addExpense(new Expense("Coffee", 15, "Food", LocalDate.of(2025, 9, 1)));
manager.addExpense(new Expense("Groceries", 120, "Food", LocalDate.of(2025, 9, 3)));

System.out.println(manager.getTotalExpenses());
manager.getExpensesByCategory("Food").forEach(e -> System.out.println(e.getDescription()));
manager.getExpensesByDateRange(LocalDate.of(2025,9,1), LocalDate.of(2025,9,3))
       .forEach(e -> System.out.println(e.getDescription()));
