package org.example.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Patient implements Subscriber{

	private String name;
	private LocalDate dob;

	@Override
	public void receiveNotification(String value) {
		System.out.println("Patient " + name + " received: " + value);
	}
}
