package com.event.finder.service;

import com.event.finder.dto.ThirdPartyApiDto;
import com.event.finder.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DataFetchServiceImpl implements DataFetchService{
    @Autowired
    EventFinderService eventFinderService;

    @Value("${event.api.url}")
    private String apiUrl;

    @Override
    public void fetchEvents() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ThirdPartyApiDto> responseEntity = restTemplate.getForEntity(apiUrl, ThirdPartyApiDto.class);
        List<Event> datas = Arrays.stream(responseEntity.getBody().getData()).collect(Collectors.toList());
        datas.forEach(event -> {
            System.out.println(event.getId()+" --> "+event.getName());
            eventFinderService.saveFetchedData(event);
        });
    }
}
