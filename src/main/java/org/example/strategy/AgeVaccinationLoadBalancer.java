package org.example.strategy;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AgeVaccinationLoadBalancer implements VaccinationLoadBalancer {

    private final Random rand = new Random();

    @Override
    public Pair<Patient, Doctor> getNext(List<PatientHolder> patients, List<DoctorHolder> freeDoctors) {
        if (patients.size() == 0 || freeDoctors.size() == 0) {
            return null;
        }

        int randomElement = rand.nextInt(freeDoctors.size());

        Patient targetPatient = patients.get(0).getPatient();
        for (Patient p : patients.stream().map(PatientHolder::getPatient).collect(Collectors.toList())) {
            if (targetPatient.getDob().isAfter(p.getDob())) {
                targetPatient = p;
            }
        }

        return new Pair<>(targetPatient, freeDoctors.get(randomElement).getDoctor());
    }
}
