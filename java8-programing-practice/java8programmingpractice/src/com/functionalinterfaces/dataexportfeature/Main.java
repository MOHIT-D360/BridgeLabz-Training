package com.functionalinterfaces.dataexportfeature;

public class Main {
    public static void main(String[] args) {

        ReportExporter r1 = new CSVExporter();
        ReportExporter r2 = new PDFExporter();

        r1.export();
        r1.exportToJSON();

        r2.export();
        r2.exportToJSON();
    }
}
