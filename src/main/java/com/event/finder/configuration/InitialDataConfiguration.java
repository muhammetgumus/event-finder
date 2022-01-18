package com.event.finder.configuration;

import com.event.finder.service.DataFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialDataConfiguration implements CommandLineRunner {

    @Autowired
    DataFetchService dataFetchService;

    @Override
    public void run(String... args) throws Exception {
        dataFetchService.fetchEvents();
    }
}
