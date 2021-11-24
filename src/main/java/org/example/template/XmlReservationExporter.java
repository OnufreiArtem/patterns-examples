package org.example.template;

public class XmlReservationExporter extends ReservationExporter {

    public XmlReservationExporter() {
        super.setBeginning("<Reservations>")
                .setEnding("\n</Reservations>")
                .setElementSeparator("");
    }

    @Override
	public String serialize(Reservation reservation) {
		StringBuilder content = new StringBuilder();
		Doctor doctor = reservation.getDoctor();
		Patient patient = reservation.getPatient();

        String doctorName = "";
        String doctorSpecification = "";
        String patientName = "";
        String patientDob = "";

        if (doctor != null) {
            doctorName = doctor.getName();
            doctorSpecification = doctor.getSpecification();
        }

        if (patient != null) {
            patientName = patient.getName();
            patientDob = patient.getDob().toString();
        }

		content.append("\n\t<Reservation>");
		content.append("\n\t\t").append("<doctorName>").append(doctorName).append("</doctorName>");
		content.append("\n\t\t").append("<doctorSpecification>").append(doctorSpecification).append("</doctorSpecification>");
		content.append("\n\t\t").append("<patientName>").append(patientName).append("</patientName>");
		content.append("\n\t\t").append("<patientDob>").append(patientDob).append("</patientDob>");
		content.append("\n\t</Reservation>");

		return content.toString();
	}

	@Override
	public void output(String content) {
		System.out.println(content);
	}
}
