package org.example.strategy;

import lombok.Builder;

@Builder
public class DoctorHolder {
    private Doctor doctor;
    private Boolean isFree;

    public Doctor getDoctor() {
        return doctor;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

}
