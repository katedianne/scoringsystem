/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jkei.scoringsystem.model;

import java.sql.Timestamp;

/**
 *
 * @author Kate Dianne
 */
public class Category3 {

    public int getCategory3ID() {
        return category3ID;
    }

    public void setCategory3ID(int category3ID) {
        this.category3ID = category3ID;
    }

    public String getCategory3Name() {
        return category3Name;
    }

    public void setCategory3Name(String category3Name) {
        this.category3Name = category3Name;
    }

    public int getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(int category2Id) {
        this.category2Id = category2Id;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    private int category3ID;
    private String category3Name;
    private int category2Id;
    private int weight;
    private int scoreId;
    private Timestamp dateCreated;
    private int createdBy;
    private String remarks;
    private int statusId;
}
