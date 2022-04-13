package org.ej.springbootstarter.topic.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ej.sprinbootstarter.CourseApiApp;
import org.ej.sprinbootstarter.topic.Topic;
import org.ej.sprinbootstarter.topic.TopicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes=CourseApiApp.class)
class TopicServiceTest {

	@Autowired
	TopicService topicService;
	
	@Test
	void test() {
		
		List<Topic> expectedTopics=new ArrayList<>(Arrays.asList(
				new Topic("T1","Topic1","Topic1 Desc"),
				new Topic("T2","Topic2","Topic2 Desc"),
				new Topic("T3","Topic3","Topic3 Desc")
				));
		//fail("Not yet implemented");
		assertEquals(expectedTopics, topicService.getAllTopics());
	}

}
