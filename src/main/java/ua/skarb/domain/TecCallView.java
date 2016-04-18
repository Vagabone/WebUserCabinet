package ua.skarb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NamedNativeQuery(name = "TecCallView.findByLicenceIdAndCallCreateDateBetween",
        query = "SELECT * " +
                "FROM MERCURY.TEC_CALL_VIEW TCV " +
                "WHERE TCV.LICENCEID = :licenceId AND TCV.CALLCREATEDATE BETWEEN :startDate AND :endDate " +
                "ORDER BY TCV.CALLCREATEDATE DESC",
        resultSetMapping = "tecCallViewMapping")
@SqlResultSetMapping(name = "tecCallViewMapping",
        entities = {
                @EntityResult(entityClass = TecCallView.class, fields = {
                        @FieldResult(name = "id", column = "ID"),
                        @FieldResult(name = "licenceId", column = "LICENCEID"),
                        @FieldResult(name = "responsibleUser", column = "RESPONSIBLEUSER"),
                        @FieldResult(name = "priority", column = "PRIORITY"),
                        @FieldResult(name = "isClosed", column = "ISCLOSED"),
                        @FieldResult(name = "callDate", column = "CALLDATE"),
                        @FieldResult(name = "callTime", column = "CALLTIME"),
                        @FieldResult(name = "firmName", column = "FIRMNAME"),
                        @FieldResult(name = "callDescription", column = "CALLDESCRIPTION"),
                        @FieldResult(name = "callContacts", column = "CALLCONTACTS"),
                        @FieldResult(name = "callCreateDate", column = "CALLCREATEDATE"),
                        @FieldResult(name = "callCreateTime", column = "CALLCREATETIME")
                })})
public class TecCallView implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "LICENCEID", length = 12)
    private Integer licenceId;

    @Column(name = "RESPONSIBLEUSER", nullable = false)
    private String responsibleUser;

    @Column(name = "PRIORITY", nullable = false)
    private String priority;

    @Column(name = "ISCLOSED", nullable = false)
    private String isClosed;

    @Temporal(TemporalType.DATE)
    @Column(name = "CALLDATE")
    private Date callDate;

    @Column(name = "CALLTIME")
    private String callTime;

    @Column(name = "FIRMNAME", nullable = false)
    private String firmName;

    @Column(name = "CALLDESCRIPTION")
    private String callDescription;

    @Column(name = "CALLCONTACTS")
    private String callContacts;

    @Temporal(TemporalType.DATE)
    @Column(name = "CALLCREATEDATE")
    private Date callCreateDate;

    @Column(name = "CALLCREATETIME")
    private String callCreateTime;

    public TecCallView() {
    }

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

    public String getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(String responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    public String getCallTime() {
        return callTime;
    }

    public void setCallTime(String callTime) {
        this.callTime = callTime;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getCallDescription() {
        return callDescription;
    }

    public void setCallDescription(String callDescription) {
        this.callDescription = callDescription;
    }

    public String getCallContacts() {
        return callContacts;
    }

    public void setCallContacts(String callContacts) {
        this.callContacts = callContacts;
    }

    public Date getCallCreateDate() {
        return callCreateDate;
    }

    public void setCallCreateDate(Date callCreateDate) {
        this.callCreateDate = callCreateDate;
    }

    public String getCallCreateTime() {
        return callCreateTime;
    }

    public void setCallCreateTime(String callCreateTime) {
        this.callCreateTime = callCreateTime;
    }

    @Override
    public String toString() {
        return "TecCallView{" +
                "id=" + id +
                ", licenceId=" + licenceId +
                ", responsibleUser='" + responsibleUser + '\'' +
                ", priority='" + priority + '\'' +
                ", isClosed=" + isClosed +
                ", callDate=" + callDate +
                ", callTime='" + callTime + '\'' +
                ", firmName='" + firmName + '\'' +
                ", callDescription='" + callDescription + '\'' +
                ", callContacts='" + callContacts + '\'' +
                ", callCreateDate=" + callCreateDate +
                ", callCreateTime='" + callCreateTime + '\'' +
                '}';
    }

}
