package clase;

public class Notifier implements IBudgetObserver {
    @Override
    public void receiveNotification(String notification) {
        System.out.println(notification);
    }
}
