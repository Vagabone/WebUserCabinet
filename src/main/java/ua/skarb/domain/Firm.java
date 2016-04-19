package ua.skarb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FIRMS")
public class Firm {

    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FULLNAME")
    private String fullName;

    @Column(name = "OKPO")
    private String okpo;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ADDRESS2")
    private String address2;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "TAXIDNO")
    private String taxidNo;

    @Column(name = "TAXSERTNO")
    private String taxSertNo;

    @Column(name = "EMAIL1")
    private String email1;

    @Column(name = "EMAIL2")
    private String email2;

    @Column(name = "EMAILCOMMENTS")
    private String emailComments;

    @Column(name = "WEBADDRESS")
    private String webAddress;

    @Column(name = "DIRECTORFIO")
    private String directorFIO;

    @Column(name = "DIRECTORPHONE")
    private String directorPhone;

    @Column(name = "CONTACTFIO")
    private String contactFIO;

    @Column(name = "CONTACTPOST")
    private String contactPost;

    @Column(name = "CONTACTPHONE")
    private String contactPhone;

    @Column(name = "CONTACTEMAIL")
    private String contactEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTaxidNo() {
        return taxidNo;
    }

    public void setTaxidNo(String taxidNo) {
        this.taxidNo = taxidNo;
    }

    public String getTaxSertNo() {
        return taxSertNo;
    }

    public void setTaxSertNo(String taxSertNo) {
        this.taxSertNo = taxSertNo;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmailComments() {
        return emailComments;
    }

    public void setEmailComments(String emailComments) {
        this.emailComments = emailComments;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getDirectorFIO() {
        return directorFIO;
    }

    public void setDirectorFIO(String directorFIO) {
        this.directorFIO = directorFIO;
    }

    public String getDirectorPhone() {
        return directorPhone;
    }

    public void setDirectorPhone(String directorPhone) {
        this.directorPhone = directorPhone;
    }

    public String getContactFIO() {
        return contactFIO;
    }

    public void setContactFIO(String contactFIO) {
        this.contactFIO = contactFIO;
    }

    public String getContactPost() {
        return contactPost;
    }

    public void setContactPost(String contactPost) {
        this.contactPost = contactPost;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", okpo='" + okpo + '\'' +
                ", address='" + address + '\'' +
                ", address2='" + address2 + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", taxidNo='" + taxidNo + '\'' +
                ", taxSertNo='" + taxSertNo + '\'' +
                ", email1='" + email1 + '\'' +
                ", email2='" + email2 + '\'' +
                ", emailComments='" + emailComments + '\'' +
                ", webAddress='" + webAddress + '\'' +
                ", directorFIO='" + directorFIO + '\'' +
                ", directorPhone='" + directorPhone + '\'' +
                ", contactFIO='" + contactFIO + '\'' +
                ", contactPost='" + contactPost + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
}
