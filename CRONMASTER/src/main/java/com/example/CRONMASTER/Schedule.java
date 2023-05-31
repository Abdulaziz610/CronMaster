package com.example.CRONMASTER;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Scheduled(cron = "0,30 18-23 * * 1-5")

    public void SchedulerTask() {
        System.out.println("Hello Codeline");

    }
}