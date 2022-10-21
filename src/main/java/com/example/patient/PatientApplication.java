package com.example.patient;

import com.example.patient.entities.Patient;
import com.example.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PatientApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(PatientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Patient> patients = patientRepository.findAll();
        patientRepository.save(new Patient(null,"Yassine",new Date(),true,12));
        patientRepository.save(new Patient(null,"Reda",new Date(),true,15));
        patientRepository.save(new Patient(null,"Youssef",new Date(),true,87));
        patientRepository.save(new Patient(null,"Hatim",new Date(),false,9));
        patientRepository.save(new Patient(null,"Driss",new Date(),true,120));


    }
}
