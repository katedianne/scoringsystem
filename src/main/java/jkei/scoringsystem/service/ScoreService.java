/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.service;

import java.util.List;
import jkei.scoringsystem.model.Score;
import jkei.scoringsystem.model.ScoreInCategory;

/**
 *
 * @author Kate Dianne
 */
public interface ScoreService {
    void UpdateScore(List<ScoreInCategory> _request);
    void CreateScore(List<ScoreInCategory> _request);
    List<Score> getAnnouncement(List<Score> _request);
}
