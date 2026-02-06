package com.functionalinterfaces.dataexportfeature;

interface ReportExporter {

    void export();

    
    default void exportToJSON() {
        System.out.println("Exporting report to JSON format");
    }
}
