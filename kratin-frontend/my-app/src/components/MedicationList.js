import React from 'react';
import MedicationItem from './MedicationItem';

const MedicationList = ({ medications }) => {
  return (
    <div>
      <h2>Medication List</h2>
      {medications.map((medication) => (
        <MedicationItem key={medication.id} medication={medication} />
      ))}
    </div>
  );
};

export default MedicationList;
