// medicationReducer.js
const initialState = {
    medications: [],
    loading: false,
    error: null,
  };
  
  const medicationReducer = (state = initialState, action) => {
    switch (action.type) {
      case 'FETCH_MEDICATIONS_REQUEST':
        return {
          ...state,
          loading: true,
          error: null,
        };
      case 'FETCH_MEDICATIONS_SUCCESS':
        return
      }
    }