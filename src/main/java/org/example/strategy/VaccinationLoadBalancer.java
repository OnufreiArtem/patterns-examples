package org.example.strategy;


import java.util.List;

public interface VaccinationLoadBalancer {

     Pair<Patient, Doctor> getNext(List<PatientHolder> patients, List<DoctorHolder> freeDoctors);

}
