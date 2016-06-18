package com.underdog.jersey.jersey_getting_started.repository;

import java.util.ArrayList;
import java.util.List;

import com.underdog.jersey.jersey_getting_started.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {
	
	/* (non-Javadoc)
	 * @see com.underdog.jersey.jersey_getting_started.repository.ActivityResource#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities(){
		
		
		List<Activity> list = new ArrayList<Activity>();
		Activity ac1 = new Activity();
		ac1.setDescription("Walk");
		ac1.setDuration(12);
		list.add(ac1);
		
		ac1 =  new Activity();
		ac1.setDescription("Jogging");
		ac1.setDuration(10);
		list.add(ac1);
		
		ac1 =  new Activity();
		ac1.setDescription("Running");
		ac1.setDuration(25);
		list.add(ac1);
		
		
		return list;
		
	}

}
