package jkei.scoringsystem.service;

import jkei.scoringsystem.model.Login;
import jkei.scoringsystem.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}
