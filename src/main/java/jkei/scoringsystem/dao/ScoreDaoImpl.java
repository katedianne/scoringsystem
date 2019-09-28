/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import jkei.scoringsystem.model.Score;
import jkei.scoringsystem.model.ScoreInCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Kate Dianne
 */
public class ScoreDaoImpl implements ScoreDao {
    @Autowired
    DataSource datasource;

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    
    public void UpdateScore(List<ScoreInCategory> _request){
        for(ScoreInCategory request : _request){
            String sqlSelect = "select weight from categories where category_id = '" + request._score.getCategoryId() + "'";
            List<ScoreInCategory> weight = jdbcTemplate.query(sqlSelect, new ScoreDaoImpl.ScoreInCategoryMapper()); 
        }
        
        double total=0;
        for(ScoreInCategory request: _request){
            String sql = "update scores set score_value = ? , final_scores = ? where category_id = ?";
            jdbcTemplate.update(sql, new Object[]{request._score.getScoreValue(),request._score.getFinalScore(), request._score.getCategoryId()});
            total += request._score.getFinalScore();
        }
        
        for(ScoreInCategory request : _request){
            double finalScoreOtherLevel = total * request.getWeight();
            String sql = "update scores set score_value = ? , final_scores = ? where category_id = ?";
            jdbcTemplate.update(sql, new Object[] { request._score.getScoreValue(), finalScoreOtherLevel, request.getCategoryID()});
            
        }
    }
    
    public void CreateScore(List<ScoreInCategory> _request) {

        for(ScoreInCategory request : _request){
            String sqlSelect = "select weight from categories where category_id = '" + request._score.getCategoryId() + "'";
            List<ScoreInCategory> weight = jdbcTemplate.query(sqlSelect, new ScoreDaoImpl.ScoreInCategoryMapper()); 
        }

        double total=0;
        for(ScoreInCategory request : _request){
            String sql = "insert into scores (score_value, final_score, contestant_id, date_created, created_by, status_id, category_id) values(?,?,?,?,?,1,?)";
            jdbcTemplate.update(sql, new Object[] { request._score.getScoreValue(), request._score.getFinalScore(), request._score.getContestantId(), request._score.getDateCreated(),
            request._score.getCreatedBy(), request._score.getStatusId(), request._score.getCategoryId()});

            total += request._score.getFinalScore();
        }
        for(ScoreInCategory request : _request){
            double finalScoreOtherLevel = total * request.getWeight();
            String sql = "insert into scores (score_value, final_score, contestant_id, date_created, created_by, status_id, category_id) values(?,?,?,?,?,1,?)";
            jdbcTemplate.update(sql, new Object[] { request._score.getScoreValue(), finalScoreOtherLevel, request._score.getContestantId(), request._score.getDateCreated(),
            request._score.getCreatedBy(), request._score.getStatusId(), request.getCategoryID()});
            
        }
    }
    public List<Score> getAnnouncement(List<Score> _request){
        String sql="";
        for(Score request : _request){
            sql = "Select * from scores where status_id = 1 and category_id = '" + request.getCategoryId() + "'";
        }
        List<Score> score = jdbcTemplate.query(sql, new ScoreDaoImpl.ScoreMapper());
        return score;
    }
    
    class ScoreMapper implements RowMapper<Score>{
     
        public Score mapRow(ResultSet rs, int arg1) throws SQLException{
            Score dbget = new Score();
            
            dbget.setScoreId(rs.getInt("score_id"));
            dbget.setScoreValue(rs.getDouble("score_value"));
            dbget.setFinalScore(rs.getInt("final_score"));
            dbget.setContestantId(rs.getInt("contestant_id"));
            dbget.setCreatedBy(rs.getInt("created_by"));
            dbget.setDateCreated(rs.getTimestamp("date_created"));
            dbget.setStatusId(rs.getInt("status_id"));
            dbget.setCategoryId(rs.getInt("category_id"));
            return dbget;
        }
    }
    
    class ScoreInCategoryMapper implements RowMapper<ScoreInCategory>{
     
        public ScoreInCategory mapRow(ResultSet rs, int arg1) throws SQLException{
            ScoreInCategory dbget = new ScoreInCategory();
            
            dbget.setWeight(rs.getInt("weight"));
            return dbget;
        }
    }
}
