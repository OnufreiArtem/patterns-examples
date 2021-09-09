package org.example.singleton;

import org.example.singleton.model.Doctor;
import org.example.singleton.repo.FakeDoctorDatasource;

import java.util.UUID;

public class TestMultiThread {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new TestThread("THREAD 1"));
		Thread thread2 = new Thread(new TestThread("THREAD 2"));
		Thread thread3 = new Thread(new TestThread("THREAD 3"));
		Thread thread4 = new Thread(new TestThread("THREAD 4"));
		Thread thread5 = new Thread(new TestThread("THREAD 5"));
		Thread thread6 = new Thread(new TestThread("THREAD 6"));

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			thread6.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}

		FakeDoctorDatasource.getInstance().getAll().forEach(System.out::println);

	}



	static class TestThread implements Runnable {

		private final String name;

		public TestThread(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			for(int i = 0; i < 50; i++) {
				FakeDoctorDatasource.getInstance().add(new Doctor(name + ":" + UUID.randomUUID().toString(), "PHD"));
			}
		}
	}
}
