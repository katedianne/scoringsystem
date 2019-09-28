/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.dao;

import javax.sql.DataSource;
import jkei.scoringsystem.model.Contestant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Kate Dianne
 */
public class ParticipantDaoImpl implements ParticipantDao {
    @Autowired
    DataSource datasource;

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public int CreateParticipant(Contestant contestant) {

        String sql = "insert into contestants (contestant_name, date_created, created_by, status_id) values(?,?,?,?)";

      int result = jdbcTemplate.update(sql, new Object[]{contestant.getContestantName(), contestant.getDateCreated(), contestant.getCreatedBy(), contestant.getStatusId() });

      return result;
    }
}
