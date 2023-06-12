package com.app.service;

import java.util.List;

import com.app.exception.MedicationNotFoundException;
import com.app.pojo.Medication;



public interface IMedicationService {
 Medication getMedicationById(int id);
 List<Medication> getAllMedications();
 Medication createMedication(Medication medication);
 Medication updateMedication(Medication medication) throws MedicationNotFoundException;
 void deleteMedication(long id) throws MedicationNotFoundException;
}

