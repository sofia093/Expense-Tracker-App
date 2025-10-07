# Expense Tracker

A Java console application to manage daily expenses with **Streams**, **I/O**, and **Design Patterns**.

## Features
- Add expenses: description, amount, category, date  
- List all expenses  
- Calculate total expenses using **Streams**  
- Filter by category or date range with **Streams**  
- Weekly and monthly reports  
- Export reports using **Strategy Pattern** (Console, CSV)  
- Optional budget notifications using **Observer Pattern**  
- Configuration management with **Singleton Pattern**  

## Usage
```java
ExpenseManager manager = new ExpenseManager();
manager.addExpense(new Expense("Coffee", 15, "Food", LocalDate.of(2025, 9, 1)));
manager.addExpense(new Expense("Groceries", 120, "Food", LocalDate.of(2025, 9, 3)));

// Total expenses
System.out.println(manager.getTotalExpenses());

// Filter by category
manager.getExpensesByCategory("Food").forEach(e -> System.out.println(e.getDescription()));

// Filter by date range
manager.getExpensesByDateRange(LocalDate.of(2025,9,1), LocalDate.of(2025,9,3))
       .forEach(e -> System.out.println(e.getDescription()));

// Generate report (Strategy Pattern)
IReportGenerator generator = ReportFactory.getReportGenerator(); // e.g., Console or CSV
generator.generateReport(manager.getAllExpenses());
