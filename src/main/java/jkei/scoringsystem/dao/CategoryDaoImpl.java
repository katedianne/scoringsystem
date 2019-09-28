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
import jkei.scoringsystem.model.Category;
import jkei.scoringsystem.model.Category1;
import jkei.scoringsystem.model.Level;
import jkei.scoringsystem.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Kate Dianne
 */
public class CategoryDaoImpl {
    @Autowired
    DataSource datasource;

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    Level level;
    
    
    public void DeleteCategory(List<Category> request){
        if(level.getLevel()==1){
            for(Category _request : request){
                String sql = "update category_level_1 set status_id = 2 where category1_id = ?";
                jdbcTemplate.update(sql, new Object[]{_request.getCategory1ID()});
                
                String sql2 = "update category_level_2 set status_id = 2 where category1_id = ?";
                jdbcTemplate.update(sql2, new Object[]{_request.category2.getCategory1Id()});
                
                String sql3 = "update category_level_3 set status_id = 2 where category1_id = ?";
                jdbcTemplate.update(sql3, new Object[]{_request.category2.category3.getCategory3ID()});
                
            }
        }else if(level.getLevel()==2){
            for(Category _request : request){
                String sql = "update category_level_2 set status_id = 2 where category1_id = ?";
                jdbcTemplate.update(sql, new Object[]{_request.getCategory1ID()});
            }
        }
        
        
        for(Category _request : request){
            String sqlRecipient = "update recipent set status_id = 2 where announcement_id = ?";
            jdbcTemplate.update(sqlRecipient, new Object[]{_request.getCategory1ID()});
        }
    }
    
    public void CreateCategory1(List<Category> _request) {

    for(Category request : _request){
        String sql = "insert into category_level_1 (category1_name, event_id, score_id, remarks, date_created, created_by, status_id) values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[] { request.getCategory1Name(), request.getEventId(), request.getScoreId(), request.getRemarks(), request.getDateCreated(),
        request.getCreatedBy(), request.getStatusId()});
    }
    }
    
    public void CreateCategory2(List<Category> _request) {

    for(Category request : _request){
        String sql = "insert into category_level_2 (category2_name, category1_id, score_id, remarks, date_created, created_by, status_id) values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[] { request.category2.getCategory2Name(), request.category2.getCategory1Id(), request.category2.getScoreId(), request.category2.getRemarks(), request.category2.getDateCreated(),
        request.category2.getCreatedBy(), request.category2.getStatusId()});
    }
    }
    
    public void CreateCategory3(List<Category> _request) {

    for(Category request : _request){
        String sql = "insert into category_level_3 (category3_name, category2_id, score_id, remarks, date_created, created_by, status_id) values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[] { request.category2.category3.getCategory3Name(), request.category2.category3.getCategory2Id(), request.category2.category3.getScoreId(), request.category2.category3.getRemarks(), request.category2.category3.getDateCreated(),
        request.category2.category3.getCreatedBy(), request.category2.category3.getStatusId()});
    }
    }
    
    public List<Category> getAnnouncement(){
        String sql = "Select * from announcement as a inner join recipient as r on a.announcement_id=r.announcement_id where a.status_id = 1";
        List<Category> category = jdbcTemplate.query(sql, new CategoryDaoImpl.CategoryMapper());
        return category;
    }
    
    class CategoryMapper implements RowMapper<Category>{
     
        public Category mapRow(ResultSet rs, int arg1) throws SQLException{
            Category dbget = new Category();
            
            dbget.setCategory1ID(rs.getInt("category1_id"));
            dbget.setCategory1Name(rs.getString("category1_name"));
            dbget.setEventId(rs.getInt("event_id"));
            dbget.setScoreId(rs.getInt("score_id"));
            dbget.setRemarks(rs.getString("remarks"));
            dbget.setCreatedBy(rs.getInt("created_by"));
            dbget.setDateCreated(rs.getTimestamp("date_created"));
            dbget.setStatusId(rs.getInt("status_id"));
            dbget.category2.setCategory2ID(rs.getInt("category2_id"));
            dbget.category2.setCategory2Name(rs.getString("category2_name"));
            dbget.category2.setCategory1Id(rs.getInt("category1_id"));
            dbget.category2.setScoreId(rs.getInt("score_id"));
            dbget.category2.setRemarks(rs.getString("remarks"));
            dbget.category2.setCreatedBy(rs.getInt("created_by"));
            dbget.category2.setDateCreated(rs.getTimestamp("date_created"));
            dbget.category2.setStatusId(rs.getInt("status_id"));
            dbget.category2.category3.setCategory3ID(rs.getInt("category3_id"));
            dbget.category2.category3.setCategory3Name(rs.getString("category3_name"));
            dbget.category2.category3.setCategory2Id(rs.getInt("category2_id"));
            dbget.category2.category3.setScoreId(rs.getInt("remarks"));
            dbget.category2.category3.setRemarks(rs.getString("remarks"));
            dbget.category2.category3.setCreatedBy(rs.getInt("created_by"));
            dbget.category2.category3.setDateCreated(rs.getTimestamp("date_created"));
            dbget.category2.category3.setStatusId(rs.getInt("status_id"));
            return dbget;
        }
    }
}
