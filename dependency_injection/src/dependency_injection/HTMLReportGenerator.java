package dependency_injection;

public class HTMLReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating an HTML report.");
    }
}