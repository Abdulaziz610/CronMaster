package com.example.CRONMASTER;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Scheduled(cron = "*/15 14-22 * * 6-7")



    public void SchedulerTask() {
        System.out.println("Hello Codeline");

    }
}