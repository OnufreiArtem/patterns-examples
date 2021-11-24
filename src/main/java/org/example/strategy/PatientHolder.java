package org.example.strategy;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class PatientHolder {
    private Patient patient;
    private LocalDateTime addressedTime;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getAddressedTime() {
        return addressedTime;
    }

    public void setAddressedTime(LocalDateTime addressedTime) {
        this.addressedTime = addressedTime;
    }
}
