package Temporal.ktLib.service;

import org.springframework.stereotype.Component;

import Temporal.ktLib.domain.Person;

public interface PersonService {

	public Person getAll(Integer id);

	public void insert(Person person);
}
