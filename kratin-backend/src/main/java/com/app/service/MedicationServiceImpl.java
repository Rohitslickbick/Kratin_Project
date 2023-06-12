package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.MedicationDao;
import com.app.exception.MedicationNotFoundException;
import com.app.pojo.Medication;

@Service
@Transactional
public class MedicationServiceImpl implements IMedicationService {

    @Autowired
    private MedicationDao medicationDao;

    @Override
    public Medication getMedicationById(int id) {
        return medicationDao.getMedicationById(id);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationDao.getAllMedications();
    }

    @Override
    public Medication createMedication(Medication medication) {
        return medicationDao.save(medication);
    }

    @Override
    public Medication updateMedication(Medication medication) throws MedicationNotFoundException {
        // Check if the medication exists
        Medication existingMedication = medicationDao.findById(medication.getId())
                .orElseThrow(() -> new MedicationNotFoundException("Medication Not Found"));

        // Update the medication properties
        existingMedication.setName(medication.getName());
        existingMedication.setDosage(medication.getDosage());
        existingMedication.setSchedule(medication.getSchedule());

        // Save the updated medication
        return medicationDao.save(existingMedication);
    }

    @Override
    public void deleteMedication(long id) throws MedicationNotFoundException {
        // Check if the medication exists
        Medication existingMedication = medicationDao.findById(id)
        		.orElseThrow(() -> new MedicationNotFoundException("Medication Not Found"));

        // Delete the medication
        medicationDao.delete(existingMedication);
    }
}
