import React from 'react';

const MedicationItem = ({ medication }) => {
  return (
    <div>
      <h3>{medication.name}</h3>
      <p>Dosage: {medication.dosage}</p>
      <p>Schedule: {medication.schedule}</p>
    </div>
  );
};

export default MedicationItem;
