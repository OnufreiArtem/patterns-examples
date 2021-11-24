package org.example.template;

public class JsonReservationExporter extends ReservationExporter {

    public JsonReservationExporter() {
        super.setBeginning("[\n")
                .setEnding("\n]\n")
                .setElementSeparator(",\n");
    }

    @Override
    public String serialize(Reservation reservation) {
        StringBuilder reservationContent = new StringBuilder();
        Doctor doctor = reservation.getDoctor();
        Patient patient = reservation.getPatient();

        String doctorSerializedName = "UNKNOWN";
        String doctorSerializedSpecification = "UNKNOWN";
        String patientSerializedName = "UNKNOWN";
        String patientSerializedDob = "UNKNOWN";

        if (doctor != null) {
            doctorSerializedName = doctor.getName();
            doctorSerializedSpecification = doctor.getSpecification();
        }

        if (patient != null) {
            patientSerializedName = patient.getName();
            patientSerializedDob = patient.getDob().toString();
        }

        reservationContent.append("\t{\n");
        reservationContent.append("\t\t").append(wrapWithQuotes("doctorName")).append(": ")
                .append(wrapWithQuotes(doctorSerializedName)).append(",\n");
        reservationContent.append("\t\t").append(wrapWithQuotes("doctorSpecification")).append(": ")
                .append(wrapWithQuotes(doctorSerializedSpecification)).append(",\n");
        reservationContent.append("\t\t").append(wrapWithQuotes("patientName")).append(": ")
                .append(wrapWithQuotes(patientSerializedName)).append(",\n");
        reservationContent.append("\t\t").append(wrapWithQuotes("patientDob")).append(": ")
                .append(wrapWithQuotes(patientSerializedDob));
        reservationContent.append("\n\t}");

        return reservationContent.toString();
    }

    private String wrapWithQuotes(String value) {
        return "\""  + value + "\"";
    }

    @Override
    public void output(String content) {
        System.out.println(content);
    }
}
