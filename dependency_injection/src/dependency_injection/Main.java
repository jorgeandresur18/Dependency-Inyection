package dependency_injection;

public class Main {
    public static void main(String[] args) {
        ReportServiceConfiguration config = new ReportServiceConfiguration();
        ReportGenerator generator = config.reportGenerator();

        ReportService reportService = new ReportService(generator);

        reportService.generateReport(); // Genera un informe en PDF o HTML según la configuración.
    }
}