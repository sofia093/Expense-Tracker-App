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
}
