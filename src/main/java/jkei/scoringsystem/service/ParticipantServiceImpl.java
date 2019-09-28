/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.service;

import jkei.scoringsystem.dao.ParticipantDao;
import jkei.scoringsystem.model.Contestant;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kate Dianne
 */
public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    public ParticipantDao participantDao;
    
    public int CreateParticipant(Contestant contestant){
        return participantDao.CreateParticipant(contestant);
    }
}
