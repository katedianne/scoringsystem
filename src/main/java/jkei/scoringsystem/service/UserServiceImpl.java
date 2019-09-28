package jkei.scoringsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import jkei.scoringsystem.dao.UserDao;
import jkei.scoringsystem.model.Login;
import jkei.scoringsystem.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
