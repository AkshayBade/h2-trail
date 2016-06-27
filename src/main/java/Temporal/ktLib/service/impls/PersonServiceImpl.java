package Temporal.ktLib.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Temporal.ktLib.domain.Person;
import Temporal.ktLib.mapper.PersonMapper;
import Temporal.ktLib.service.PersonService;

@Service
@Repository("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonMapper personMapper;

	@Override
	public Person getAll(Integer id) {
		Person person = personMapper.get();
		return person;
	}

	@Override
	public void insert(Person person) {
		try {
			personMapper.insert(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
