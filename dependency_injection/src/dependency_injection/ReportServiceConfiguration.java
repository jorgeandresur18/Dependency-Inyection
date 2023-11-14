package dependency_injection;

public class ReportServiceConfiguration {
    public ReportGenerator reportGenerator() {
   
        return new PDFReportGenerator();
    }
}