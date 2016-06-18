package com.underdog.jersey.jersey_getting_started.model;

import javax.xml.bind.annotation.XmlRootElement;

// adding the type translation to let Jersey know it needs to translate this class into proper return type when calling the service.
@XmlRootElement
public class Activity {

	private String description;
	private int duration;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	
//	public Activity(String desc, int dur) {
//		// TODO Auto-generated constructor stub
//		this.setDescription(desc);
//		this.setDuration(dur);
//	}
}
