package com.event.finder.scheduler;

import com.event.finder.service.DataFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@EnableScheduling
@Component
public class FetchDataScheduler implements Scheduler{

    @Autowired
    DataFetchService dataFetchService;

    @Scheduled(cron="0 0 * * * *")
    @Override
    public void schedule() {
        Logger.getLogger(FetchDataScheduler.class.getName())
                .info("Fetch Data Scheduler started!");
        System.out.println("Fetch Data Scheduler started");
        dataFetchService.fetchEvents();
    }
}
