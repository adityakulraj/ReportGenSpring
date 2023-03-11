package com.example.reportgenspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    ReportService reportService;



    @GetMapping("/genReport")
    public String generateReport() {

        return  reportService.startReportProcessing();
    }


    @GetMapping("/getReport/{id}")
    public String getReportStatus(@PathVariable String id) {
        return reportService.getReport(id);
    }










}
