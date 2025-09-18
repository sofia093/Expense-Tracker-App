package clase;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager implements ISubject {
    private List<IBudgetObserver> observers = new ArrayList<>();
    private double budget;

    public BudgetManager() {
        this.budget = Config.getInstance().getBudget();
    }

    @Override
    public void addObserver(IBudgetObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IBudgetObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String notification) {
        for(IBudgetObserver observer : observers) {
            observer.receiveNotification(notification);
        }
    }

    public void checkBudget(double expenses) {
        if(budget <= expenses) {
            notifyObservers("Budget exceeded by:  " + (expenses-budget) + " lei");
        }
        else {
            notifyObservers("Total expenses: " + expenses + " lei" + "\n" +
                    "Total saved: " + (budget-expenses) + " lei");
        }
    }


}
