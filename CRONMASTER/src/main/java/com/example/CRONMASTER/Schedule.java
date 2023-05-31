package com.example.CRONMASTER;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Scheduled(cron = "*/30 * 15,L * *")



    public void SchedulerTask() {
        System.out.println("Hello Codeline");

    }
}