package com.functionalinterfaces.dataexportfeature;

class CSVExporter implements ReportExporter {
    public void export() {
        System.out.println("Exporting report to CSV");
    }
}
