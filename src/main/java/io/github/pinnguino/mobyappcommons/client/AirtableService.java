package io.github.pinnguino.mobyappcommons.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AirtableService {

    @Autowired
    private RestTemplate restTemplate;

}
