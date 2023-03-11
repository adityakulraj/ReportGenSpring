package com.example.reportgenspring;

import java.util.HashMap;
import java.util.Map;


public class ReportProcessor extends Thread {

    Map<String, String> statusOfReport;

    String currId ;



    public ReportProcessor(Map<String,String> statusOfReport, String currId) {
        super();
        this.statusOfReport = statusOfReport;
        this.currId = currId;
    }

    public void setCurrId(String id) {
        currId = id;
    }



    @Override
    public void run() {
        try {
            //report proccessing would take place here. Mocking that with Thread.sleep
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setVal(currId);
    }


    public void setVal(String id) {
        statusOfReport.put(id, "done");
    }












}
