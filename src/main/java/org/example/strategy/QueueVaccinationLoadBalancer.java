package org.example.strategy;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class QueueVaccinationLoadBalancer implements VaccinationLoadBalancer {

    private final Random rand = new Random();

    @Override
    public Pair<Patient, Doctor> getNext(List<PatientHolder> patients, List<DoctorHolder> freeDoctors) {
        if (freeDoctors.size() == 0 || patients.size() == 0) {
            return null;
        }

        int randomElement = rand.nextInt(freeDoctors.size());

        LocalDateTime time = patients.get(0).getAddressedTime();
        Patient targetPatient = patients.get(0).getPatient();
        for (PatientHolder patientHolder : patients) {
            if (patientHolder.getAddressedTime().isBefore(time)) {
                targetPatient = patientHolder.getPatient();
            }
        }

        return new Pair<>(targetPatient, freeDoctors.get(randomElement).getDoctor());
    }
}
