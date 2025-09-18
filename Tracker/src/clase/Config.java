package clase;

public class Config {
    private double budget;
    private String reportFormat;

    private Config(double budget, String reportFormat) {
        this.budget = budget;
        this.reportFormat = reportFormat;
    }

    private static Config instance = null;

    public static synchronized Config getInstance() {
        if (instance == null) {
            instance =new Config(200, "Console");
        }
        return instance;
    }

    public double getBudget() {
        return budget;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }
}
