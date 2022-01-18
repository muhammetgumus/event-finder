package com.event.finder.scheduler;

import com.event.finder.service.DataFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.logging.Logger;

@EnableScheduling
public class FetchDataScheduler implements Scheduler{

    @Autowired
    DataFetchService dataFetchService;

    @Scheduled(fixedDelay = 60*1000L )
    @Override
    public void schedule() {
        Logger.getLogger(FetchDataScheduler.class.getName())
                .info("Fetch Data Scheduler started!");
        dataFetchService.fetchEvents();
    }
}
