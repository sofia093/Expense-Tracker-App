package clase;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses  = new ArrayList<>();

    public void addExpense(Expense e){
        expenses.add(e);
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public double getTotalExpenses() {
        double sum = 0;
        for (Expense expense : expenses) {
            sum+=expense.getAmount();
        }
        return sum;
    }
}
