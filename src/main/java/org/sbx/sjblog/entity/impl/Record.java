package org.sbx.sjblog.entity.impl;

import org.sbx.sjblog.entity.DBObject;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "records")
@NamedQueries({
        @NamedQuery(name = "getRecords",
                    query = "SELECT r FROM Record r")
})
public class Record implements Serializable, DBObject{

    @Id
    @Basic
    @Column(name = "rec_id")
    private Integer recordId;

    @Column(name = "user_id")
    @Basic
    private Integer userId;

    @Column(name = "rec_title")
    @Basic
    private String recordTitle;

    @Column(name = "rec_body")
    @Basic
    private String recordBody;

    @Column(name = "crt_date")
    @Basic
    private Date creationDate;

    @Column(name = "mdf_date")
    @Basic
    private Date modificationDate;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle;
    }

    public String getRecordBody() {
        return recordBody;
    }

    public void setRecordBody(String recordBody) {
        this.recordBody = recordBody;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
}
