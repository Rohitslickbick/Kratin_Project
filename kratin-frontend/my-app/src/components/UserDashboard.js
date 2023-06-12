import React, { useEffect } from 'react';
import { connect } from 'react-redux';
import { fetchUser, fetchMedications } from '../actions';

import UserMedications from './UserMedications';

const UserDashboard = ({ user, loading, error, fetchUser, fetchMedications }) => {
  useEffect(() => {
    // Fetch user data
    fetchUser();

    // Fetch medication data
    fetchMedications();
  }, [fetchUser, fetchMedications]);

  if (loading) {
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>Error: {error}</div>;
  }

  return (
    <div>
      <h2>User Dashboard</h2>
      {user && <UserMedications user={user} />}
      {/* Add any other relevant information or actions for the user */}
    </div>
  );
};

const mapStateToProps = (state) => {
  return {
    user: state.user.user,
    loading: state.user.loading,
    error: state.user.error,
  };
};

export default connect(mapStateToProps, { fetchUser, fetchMedications })(UserDashboard);
