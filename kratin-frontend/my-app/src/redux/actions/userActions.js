// userActions.js
import axios from 'axios';

export const fetchUser = () => {
  return (dispatch) => {
    dispatch({ type: 'FETCH_USER_REQUEST' });
    axios
      .get('/api/user') // Customize the API endpoint as per your backend
      .then((response) => {
        dispatch({
          type: 'FETCH_USER_SUCCESS',
          payload: response.data,
        });
      })
      .catch((error) => {
        dispatch({
          type: 'FETCH_USER_FAILURE',
          payload: error.message,
        });
      });
  };
};
