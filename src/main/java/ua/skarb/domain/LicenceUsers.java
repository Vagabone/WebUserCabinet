package ua.skarb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "LICENCEUSERS")
public class LicenceUsers implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "LICENCEID")
    private Integer licenceId;

    @Column(name = "REGISTRATOR")
    private String registrator;

    @Column(name = "REGISTRATORSN")
    private String registratorSN;

    @Column(name = "CREATORID")
    private Integer creatorId;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATEDATE")
    private Date createDate;

    @Column(name = "COMMENTS")
    private String comments;

    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATEDDATE")
    private Date updateDate;

    @Column(name = "IS_TEST")
    private Boolean isTest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLicenceId() {
        return licenceId;
    }

    public void setLicenceId(Integer licenceId) {
        this.licenceId = licenceId;
    }

    public String getRegistrator() {
        return registrator;
    }

    public void setRegistrator(String registrator) {
        this.registrator = registrator;
    }

    public String getRegistratorSN() {
        return registratorSN;
    }

    public void setRegistratorSN(String registratorSN) {
        this.registratorSN = registratorSN;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getTest() {
        return isTest;
    }

    public void setTest(Boolean test) {
        isTest = test;
    }

    @Override
    public String toString() {
        return "LicenceUsers{" +
                "id=" + id +
                ", licenceId=" + licenceId +
                ", registrator='" + registrator + '\'' +
                ", registratorSN='" + registratorSN + '\'' +
                ", creatorId=" + creatorId +
                ", createDate=" + createDate +
                ", comments='" + comments + '\'' +
                ", updateDate=" + updateDate +
                ", isTest=" + isTest +
                '}';
    }
}
