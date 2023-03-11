package com.example.reportgenspring;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ReportService {

    Map<String, String> statusOfReport;

    public ReportService() {
        statusOfReport = new HashMap<>();
    }


    public String startReportProcessing() {

         String id = UUID.randomUUID().toString();

         statusOfReport.put(id, "processing");

         //new Thread for parallel report processing
         Thread reportProcessor = new ReportProcessor(statusOfReport, id);
         reportProcessor.start();


        return id;
    }


    public String getReport(String id) {

        if(statusOfReport.containsKey(id)) {
            return statusOfReport.get(id);
        }

        return "NOT Found";

    }







}
