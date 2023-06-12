package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.MedicationNotFoundException;
import com.app.pojo.Medication;
import com.app.service.IMedicationService;

@RestController
@RequestMapping("/medications")
@CrossOrigin(origins="http://localhost:3000")
public class MedicationController {

	@Autowired
 private IMedicationService medicationService;

 @GetMapping("/{id}")
 public ResponseEntity<Medication> getMedicationById(@PathVariable int id) {
     Medication medication = medicationService.getMedicationById(id);
     if (medication != null) {
         return ResponseEntity.ok(medication);
     } else {
         return ResponseEntity.notFound().build();
     }
 }

 @GetMapping
 public ResponseEntity<List<Medication>> getAllMedications() {
     List<Medication> medications = medicationService.getAllMedications();
     return ResponseEntity.ok(medications);
 }

 @PostMapping
 public ResponseEntity<Medication> createMedication(@RequestBody Medication medication) {
     Medication createdMedication = medicationService.createMedication(medication);
     return ResponseEntity.status(HttpStatus.CREATED).body(createdMedication);
 }

 @PutMapping("/{id}")
 public ResponseEntity<Medication> updateMedication(@PathVariable int id, @RequestBody Medication medication) throws MedicationNotFoundException {
     medication.setId(id);
     Medication updatedMedication = medicationService.updateMedication(medication);
     if (updatedMedication != null) {
         return ResponseEntity.ok(updatedMedication);
     } else {
         return ResponseEntity.notFound().build();
     }
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<Void> deleteMedication(@PathVariable int id) throws MedicationNotFoundException {
     medicationService.deleteMedication(id);
     return ResponseEntity.noContent().build();
 }
}
