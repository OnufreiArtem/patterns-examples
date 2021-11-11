package org.example.observer;

public class DoctorVaccinationPublisher extends Publisher {

	private Doctor sender;
	private String message;

	public DoctorVaccinationPublisher(Doctor sender) {
		this.sender = sender;
	}

	public Doctor getSender() {
		return sender;
	}

	public void setSender(Doctor sender) {
		this.sender = sender;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	void notifySubscribers() {
		subscribers.forEach(it -> it.receiveNotification("[ From " + sender.getName() + " : " + message + " ]"));
	}
}
