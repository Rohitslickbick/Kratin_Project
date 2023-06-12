import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import UserDashboard from './components/UserDashboard';
import UserLogin from './components/UserLogin';
import NotFound from './components/NotFound';

const App = () => {
  return (
    <Router>
      <div>
        <Switch>
          <Route exact path="/" component={UserLogin} />
          <Route path="/dashboard" component={UserDashboard} />
          <Route component={NotFound} />
        </Switch>
      </div>
    </Router>
  );
};

export default App;
