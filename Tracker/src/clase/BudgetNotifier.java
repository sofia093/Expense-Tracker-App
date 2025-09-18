package clase;

public class BudgetNotifier implements IBudgetObserver {
    @Override
    public void receiveNotification(String notification) {
        System.out.println(notification);
    }
}
