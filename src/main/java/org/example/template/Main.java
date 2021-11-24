package org.example.template;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Reservation r1 = new Reservation(
                Doctor.builder().name("Doctor 1").specification("Therapist").build(),
                Patient.builder().name("Patient 1").dob(LocalDate.now().minusYears(22)).build(),
                LocalDateTime.now(),
                false);
        Reservation r2 = new Reservation(
                Doctor.builder().name("Doctor 2").specification("Therapist").build(),
                Patient.builder().name("Patient 2").dob(LocalDate.now().minusYears(24)).build(),
                LocalDateTime.now(),
                false);

        ReservationExporter csvExporter = new CsvReservationExporter();
        ReservationExporter jsonExporter = new JsonReservationExporter();
        ReservationExporter xmlExporter = new XmlReservationExporter();
        ReservationExporter xmlFileExporter = new XmlFileReservationExporter();

        csvExporter.addReservation(r1)
                .addReservation(r2);
        jsonExporter.addReservation(r1)
                .addReservation(r2);
        xmlExporter.addReservation(r1)
                .addReservation(r2);
        xmlFileExporter.addReservation(r1)
                .addReservation(r2);

        csvExporter.export();
        System.out.println();
        jsonExporter.export();
        System.out.println();
        xmlExporter.export();
        System.out.println();
        xmlFileExporter.export();
    }
}
