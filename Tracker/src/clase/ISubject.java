package clase;

public interface ISubject {
    public void addObserver(IBudgetObserver observer);
    public void removeObserver(IBudgetObserver observer);
    public void notifyObservers(String notification);
}
