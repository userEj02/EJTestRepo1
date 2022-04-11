package org.ej.sprinbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("T1","Topic1","Topic1 Desc"),
			new Topic("T2","Topic2","Topic2 Desc"),
			new Topic("T3","Topic3","Topic3 Desc")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String topicId) {
		return topics.stream().filter(t->t.getId().equals(topicId)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic,String id) {
		
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}
	
	public void deleteTopic(String id) {
		
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(i);
				return;
			}
		}
		
	}
}
