package com.underdog.jersey.jersey_getting_started.repository;

import java.util.List;

import com.underdog.jersey.jersey_getting_started.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();

}