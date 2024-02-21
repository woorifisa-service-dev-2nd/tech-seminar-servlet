package dev.fisa.test.simpleapi.model;

import lombok.Getter;

import java.util.Date;
@Getter
public class Status {
    private final String currentDate;
    private final String status;

    public Status(){
        this.currentDate = new Date().toString();
        this.status = "Service is Running";
    }
}
