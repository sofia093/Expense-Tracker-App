package clase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExpenseManager {
    private List<Expense> expenses  = new ArrayList<>();

    public void addExpense(Expense e){
        expenses.add(e);
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public double getTotalExpenses() {
        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public List<Expense> getExpensesByCategory(String category) {
        return expenses.stream()
                .filter(e -> e.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<Expense> getExpensesByDateRange(LocalDate start, LocalDate end) {
        return expenses.stream()
                .filter(e -> !e.getDate().isAfter(end) && !e.getDate().isBefore(start))
                .collect(Collectors.toList());
    }

    public double getWeeklyTotalExpenses(LocalDate weekStart) {
        LocalDate weekEnd = weekStart.plusDays(6);
        return getExpensesByDateRange(weekStart, weekEnd).stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public List<Expense> getMonthlyReport(int year, int month) {
        return expenses.stream()
                .filter(e -> e.getDate().getYear() == year && e.getDate().getMonthValue() == month)
                .collect(Collectors.toList());
    }

}
