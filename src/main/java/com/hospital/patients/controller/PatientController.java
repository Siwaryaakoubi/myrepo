package com.hospital.patients.controller;

import com.hospital.patients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService; // bean
    @GetMapping("/print-name")
    public String printfPatientName(){
     return patientService.printName("sousou");

    }
}
