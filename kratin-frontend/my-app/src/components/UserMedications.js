import React from 'react';
import MedicationList from './MedicationList';

const UserMedications = ({ user }) => {
  return (
    <div>
      <h2>User Medications</h2>
      <h3>User: {user.username}</h3>
      <MedicationList medications={user.medications} />
    </div>
  );
};

export default UserMedications;
