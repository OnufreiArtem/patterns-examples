package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

	List<Subscriber> subscribers = new ArrayList<>();

	void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	abstract void notifySubscribers();

}
