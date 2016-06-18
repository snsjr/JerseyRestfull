package com.underdog.jersey.jersey_getting_started;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.underdog.jersey.jersey_getting_started.model.Activity;
import com.underdog.jersey.jersey_getting_started.repository.ActivityRepository;
import com.underdog.jersey.jersey_getting_started.repository.ActivityRepositoryStub;

@Path("Activities")
public class ActivityResource {

	private ActivityRepository repo = new ActivityRepositoryStub();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Activity> getListOfActivities() {
		System.out.println(repo.findAllActivities());
		
		return repo.findAllActivities();
	}
}
