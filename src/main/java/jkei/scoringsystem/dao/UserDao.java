package jkei.scoringsystem.dao;

import jkei.scoringsystem.model.Login;
import jkei.scoringsystem.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}
