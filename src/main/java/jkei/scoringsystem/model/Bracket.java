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
public class Bracket {

    public int getBracketId() {
        return bracketId;
    }

    public void setBracketId(int bracketId) {
        this.bracketId = bracketId;
    }

    public int getContestantId() {
        return contestantId;
    }

    public void setContestantId(int contestantId) {
        this.contestantId = contestantId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    private int bracketId;
    private int contestantId;
    private int level;
    private int eventId;
    private Timestamp dateCreated;
    private int statusId;
    public Contestant contestant;
    
    public class Contestant{

        public int getContestantId() {
            return contestantId;
        }

        public void setContestantId(int contestantId) {
            this.contestantId = contestantId;
        }

        public String getContestantName() {
            return contestantName;
        }

        public void setContestantName(String contestantName) {
            this.contestantName = contestantName;
        }

        public Timestamp getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(Timestamp dateCreated) {
            this.dateCreated = dateCreated;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public int getStatusId() {
            return statusId;
        }

        public void setStatusId(int statusId) {
            this.statusId = statusId;
        }
        private int contestantId;
        private String contestantName;
        private Timestamp dateCreated;
        private String createdBy;
        private int statusId;
    }
}
