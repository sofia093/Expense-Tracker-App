package clase;

import java.util.Locale;

public class ReportFactory {
    public static IReportGenerator getReportGenerator() {
        String format = Config.getInstance().getReportFormat();

        switch (format.toLowerCase()){
            case "console":
                return new ConsoleReportGenerator();
            case "csv":
                return new CSVReportGenerator();
            default:
                throw new IllegalArgumentException("Unknown report format: " + format);

        }
    }
}
