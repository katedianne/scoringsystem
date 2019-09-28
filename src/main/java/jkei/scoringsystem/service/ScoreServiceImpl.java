/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.service;

import java.util.List;
import jkei.scoringsystem.dao.ScoreDao;
import jkei.scoringsystem.model.Score;
import jkei.scoringsystem.model.ScoreInCategory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kate Dianne
 */
public class ScoreServiceImpl {
    
    @Autowired
    ScoreDao scoreDao; 
    
    public void UpdateScore(List<ScoreInCategory> _request){
        scoreDao.UpdateScore(_request);
    }
    
    public void CreateScore(List<ScoreInCategory> _request){
        scoreDao.CreateScore(_request);
    }
    
    public List<Score> getAnnouncement(List<Score> _request){
        return scoreDao.getAnnouncement(_request);
    }
}
