package org.example.template;

public class CsvReservationExporter extends ReservationExporter {

    private final String VARIABLES_SEPARATOR = ",";

    public CsvReservationExporter() {
        super.setElementSeparator("\n");
    }

    @Override
    public String serialize(Reservation reservation) {
        StringBuilder reservationContent = new StringBuilder();
        Doctor doctor = reservation.getDoctor();
        Patient patient = reservation.getPatient();
        reservationContent.append(doctor == null ? "" : doctor.getName()).append(VARIABLES_SEPARATOR);
        reservationContent.append(doctor == null ? "" : doctor.getSpecification()).append(VARIABLES_SEPARATOR);
        reservationContent.append(patient == null ? "" : patient.getName()).append(VARIABLES_SEPARATOR);
        reservationContent.append(patient == null ? "" : patient.getDob());
        return reservationContent.toString();
    }

    @Override
    public void output(String content) {
        System.out.println(content);
    }
}
