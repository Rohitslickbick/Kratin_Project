package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.pojo.Medication;

@Repository
public interface MedicationDao extends JpaRepository<Medication, Long> {
	
    @Query("SELECT m FROM Medication m")
	List<Medication> getAllMedications();
	Medication getMedicationById(int id);
}
