package Temporal.ktLib;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Temporal.ktLib.domain.Person;
import Temporal.ktLib.service.PersonService;

public class ktLib {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ktlib-context.xml");
		ctx.refresh();

		PersonService personService = ctx.getBean("personService", PersonService.class);
		
		Person person = personService.getAll(1);
		System.out.println(person);
		System.out.println("Hello H2!");
	}
}
