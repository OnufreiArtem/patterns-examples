package org.example.template;

import java.util.ArrayList;
import java.util.List;

public abstract class ReservationExporter {

    private final List<Reservation> reservationList = new ArrayList<>();
    private String beginning = "";
    private String ending = "";
    private String separator = ",";
    public abstract String serialize(Reservation reservation);


    public String getContent() {
        StringBuilder contentStringBuilder = new StringBuilder();
        contentStringBuilder.append(beginning);
        for (int i = 0; i < reservationList.size(); i++) {
            contentStringBuilder.append(serialize(reservationList.get(i)));
            if (i < reservationList.size() - 1) {
                contentStringBuilder.append(separator);
            }
        }
        contentStringBuilder.append(ending);
        return contentStringBuilder.toString();
    }

    public void export() {
        String content = getContent();
        output(content);
    }

    public abstract void output(String content);

    public ReservationExporter setElementSeparator(String separator) {
        this.separator = separator;
        return this;
    }

    public ReservationExporter setBeginning(String beginning) {
        this.beginning = beginning;
        return this;
    }

    public ReservationExporter setEnding(String ending) {
        this.ending = ending;
        return this;
    }

    public ReservationExporter addReservation(Reservation reservation) {
        reservationList.add(reservation);
        return this;
    }


}
