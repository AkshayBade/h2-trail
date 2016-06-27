package Temporal.ktLib.mapper;

import org.apache.ibatis.annotations.Select;

import Temporal.ktLib.domain.Person;

public interface PersonMapper {

	public void insert(Person person);
	
	@Select("get")
	public Person get();
}
