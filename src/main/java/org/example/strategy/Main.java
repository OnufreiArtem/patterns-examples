package org.example.strategy;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Doctor doctor0 = new Doctor("John", "Therapist");
        Doctor doctor1 = new Doctor("Jill", "Therapist");
        Doctor doctor2 = new Doctor("Carl", "Therapist");

        Patient patient0 = new Patient("Bill", LocalDate.now().minusYears(19));
        Patient patient1 = new Patient("Barbara", LocalDate.now().minusYears(21));
        Patient patient2 = new Patient("Alice", LocalDate.now().minusYears(20));
        Patient patient3 = new Patient("Artem", LocalDate.now().minusYears(25));
        Patient patient4 = new Patient("Elizabeth", LocalDate.now().minusYears(30));
        Patient patient5 = new Patient("Oliver", LocalDate.now().minusYears(27));

        VaccinationController.getInstance().setVaccinationLoadBalancer(new AgeVaccinationLoadBalancer());

        VaccinationController.getInstance()
                .addDoctor(doctor0)
                .addDoctor(doctor1)
                .addDoctor(doctor2)
                .addPatient(patient0, LocalDateTime.now())
                .addPatient(patient1, LocalDateTime.now().minusMinutes(30))
                .addPatient(patient2, LocalDateTime.now().minusMinutes(60))
                .addPatient(patient3, LocalDateTime.now().minusMinutes(90))
                .addPatient(patient4, LocalDateTime.now().minusMinutes(120))
                .addPatient(patient5, LocalDateTime.now().minusMinutes(150));

        VaccinationController.getInstance().vaccinate();
        VaccinationController.getInstance().vaccinate();
        VaccinationController.getInstance().vaccinate();
        VaccinationController.getInstance().vaccinate();
        VaccinationController.getInstance().vaccinate();
        VaccinationController.getInstance().vaccinate();
    }

}
