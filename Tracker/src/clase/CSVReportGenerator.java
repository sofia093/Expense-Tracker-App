package clase;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(List<Expense> expenses) {
        try{
            FileWriter fileWriter = new FileWriter("expenses.csv");
            fileWriter.write("Description, Amount, Category, Date\n");
            for (Expense expense : expenses) {
                fileWriter.write(expense.toString() + "\n");
            }
            System.out.println("CSV generated successfully!");

        } catch (IOException e){
            System.out.println("Error writing CSV: " + e.getMessage());
        }
    }
}
