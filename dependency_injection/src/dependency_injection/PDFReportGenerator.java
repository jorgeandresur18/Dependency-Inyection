package dependency_injection;

public class PDFReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating a PDF report.");
    }
}

