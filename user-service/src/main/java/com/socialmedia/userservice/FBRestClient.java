package com.socialmedia.userservice;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FBRestClient {
    @Autowired
    private RestTemplate restTemplate;
    public <T> List<T> getApi(final String path, final HttpMethod method) {
        final ResponseEntity<List<T>> response = restTemplate.exchange(
                path,
                method,
                null,
                new ParameterizedTypeReference<List<T>>(){});
        List<T> list = response.getBody();
        return list;
    }
}
