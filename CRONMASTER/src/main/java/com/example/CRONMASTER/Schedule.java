package com.example.CRONMASTER;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Scheduled(cron = "15 8 * * 1-4,6")

    public void SchedulerTask() {
        System.out.println("Hello Codeline");

    }
}