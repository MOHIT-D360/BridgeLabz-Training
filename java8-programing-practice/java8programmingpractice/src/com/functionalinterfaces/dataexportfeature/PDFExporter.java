package com.functionalinterfaces.dataexportfeature;

class PDFExporter implements ReportExporter {
    public void export() {
        System.out.println("Exporting report to PDF");
    }
}
