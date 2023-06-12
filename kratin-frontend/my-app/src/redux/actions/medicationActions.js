// medicationActions.js
import axios from 'axios';

export const fetchMedications = () => {
  return (dispatch) => {
    dispatch({ type: 'FETCH_MEDICATIONS_REQUEST' });
    axios
      .get('/api/medications') // Customize the API endpoint as per your backend
      .then((response) => {
        dispatch({
          type: 'FETCH_MEDICATIONS_SUCCESS',
          payload: response.data,
        });
      })
      .catch((error) => {
        dispatch({
          type: 'FETCH_MEDICATIONS_FAILURE',
          payload: error.message,
        });
      });
  };
};
