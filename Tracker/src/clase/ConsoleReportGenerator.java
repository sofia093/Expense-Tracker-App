package clase;

import java.util.List;

public class ConsoleReportGenerator implements IReportGenerator {

    @Override
    public void generateReport(List<Expense> expenses) {
        System.out.println("==== Expense Report ====");
        for (Expense e : expenses) {
            System.out.println(e);
        }
        System.out.println("========================" + "\n");
    }
}
