package com.example.restservice;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import com.example.restservice.Models.Address;
import com.example.restservice.Models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	private final Address[] addresses = {
			new Address("Godsweerdersignel",40, "6041GK", "Roermond"),
			new Address("Kelvinstraat", 30, "6227VD", "Maastricht"),
	};

	private final Person[] persons = {
			new Person(0,"Chris","Akubo", LocalDate.of(1999, 7, 11), addresses [0]),
			new Person(1,"Manu","King", LocalDate.of(1996, 7, 5), addresses [0]),
			new Person(2,"Bako","Mandundu", LocalDate.of(1995, 3, 21), addresses [1])
	};

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/persons")
	public Person person(@RequestParam(value = "id", defaultValue = "") String id) {
		int parsedId = Integer.parseInt(id);
		for (Person person : persons) {
			return person;
		}
		return null;
	}

	@GetMapping("/persons")
	public Person[] persons(){
		return persons;
	}
}
