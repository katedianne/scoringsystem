package jkei.scoringsystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jkei.scoringsystem.model.Login;
import jkei.scoringsystem.model.User;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;

  public void register(User user) {

    String sql = "insert into user (username, password, email, date_created, status_id ) values(?,?,?,?,?)";

    jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getEmail(), user.getDateCreated(), user.getStatusId() });
  }

  public User validateUser(Login login) {

    String sql = "select * from user where username='" + login.getUsername() + "' and password='" + login.getPassword()
        + "'";

    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
  }

}

class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();

    user.setUserId(rs.getInt("user_id"));
    user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setEmail(rs.getString("email"));
    user.setDateCreated(rs.getTimestamp("date_created"));
    user.setStatusId(rs.getInt("status_id"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));

    return user;
  }
}