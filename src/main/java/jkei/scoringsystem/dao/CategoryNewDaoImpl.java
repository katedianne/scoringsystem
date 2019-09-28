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
import jkei.scoringsystem.model.CategoryNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Kate Dianne
 */
public class CategoryNewDaoImpl implements CategoryNewDao {
    
    @Autowired
    DataSource datasource;

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void CreateCategoryNew(List<CategoryNew> _request) {
        for(CategoryNew request : _request){
            String sql = "insert into categories (category_name, event_id, score_id, remarks, date_created, created_by, level, status_id) values(?,?,?,?,?,?,?,1)";
            jdbcTemplate.update(sql, new Object[] { request.getCategoryName(), request.getEventId(), request.getScoreId(), request.getRemarks(), request.getDateCreated(),
            request.getCreatedBy(), request.getLevel()});
        }
    }
    
    public void UpdateCategoryNew(List<CategoryNew> request){
        for(CategoryNew _request : request){
            String sqlRecipient = "update categories set category_name = ?, weight=? where category_id = ?";
            jdbcTemplate.update(sqlRecipient, new Object[]{_request.getCategoryName(), _request.getWeight()});
        }
    }
    
    public void DeleteCategoryNew(List<CategoryNew> request){
        for(CategoryNew _request : request){
            String sql = "update categories set status_id = 2 where category_id = ?";
            jdbcTemplate.update(sql, new Object[]{_request.getCategoryID()});
            String sql2 = "update categories set status_id = 2 where level = ?";
            jdbcTemplate.update(sql2, new Object[]{_request.getCategoryID()});
        }
    }
    
    public List<CategoryNew> getCategoryNew(){
        String sql = "Select * from categories where status_id = 1";
        List<CategoryNew> category = jdbcTemplate.query(sql, new CategoryNewDaoImpl.CategoryNewMapper());
        return category;
    }
    
    class CategoryNewMapper implements RowMapper<CategoryNew>{
     
        public CategoryNew mapRow(ResultSet rs, int arg1) throws SQLException{
            CategoryNew dbget = new CategoryNew();
            
            dbget.setCategoryID(rs.getInt("category_id"));
            dbget.setCategoryName(rs.getString("category_name"));
            dbget.setEventId(rs.getInt("event_id"));
            dbget.setScoreId(rs.getInt("score_id"));
            dbget.setRemarks(rs.getString("remarks"));
            dbget.setCreatedBy(rs.getInt("created_by"));
            dbget.setDateCreated(rs.getTimestamp("date_created"));
            dbget.setStatusId(rs.getInt("status_id"));
            dbget.setLevel(rs.getInt("level"));
            return dbget;
        }
    }
}
