package org.ej.springbootstarter.topic.test;

import static org.junit.jupiter.api.Assertions.*;

import org.ej.sprinbootstarter.CourseApiApp;
import org.ej.sprinbootstarter.topic.Topic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = CourseApiApp.class)
public class TopicControllerTest {

    // bind the above RANDOM_PORT
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getHello() throws Exception {

    	String expectedTopics="[{\"id\":\"T1\",\"name\":\"Topic1\",\"description\":\"Topic1 Desc\"},{\"id\":\"T2\",\"name\":\"Topic2\",\"description\":\"Topic2 Desc\"},{\"id\":\"T3\",\"name\":\"Topic3\",\"description\":\"Topic3 Desc\"}]";
    	
        ResponseEntity<String> response = restTemplate.getForEntity(
			new URL("http://localhost:" + port + "/topics").toString(), String.class);
        assertEquals(expectedTopics, response.getBody());

    }

}
