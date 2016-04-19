package ua.skarb.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "VIEW_LICENCE")
public class LicenceView implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Temporal(TemporalType.DATE)
    @Column(name = "BESTBEFORE")
    private Date bestBefore;

    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATEBEFORE")
    private Date updateBefore;

    @Column(name = "CREATEDBY")
    private String createdBy;

    @Column(name = "DEBTEXISTS")
    private Boolean debtExists;

    @Column(name = "DEBT")
    private String debt;

    @Column(name = "BLZMEDSYNC")
    private String blzMedSync;

    @Temporal(TemporalType.DATE)
    @Column(name = "BLZMEDSYNCUPDATEBEFORE")
    private Date blzMedSyncUpdateBefore;

    @Column(name = "DOCOBOROT")
    private Boolean docOborot;

    @Column(name = "RECEPTU")
    private Boolean receptu;

    @Column(name = "ROZNICA")
    private Boolean roznica;

    @Column(name = "PLATEJU")
    private Boolean plateju;

    @Column(name = "ZAKPOTAVCIK")
    private Boolean zakPotavcik;

    @Column(name = "FILIALU")
    private Boolean filialu;

    @Column(name = "SINCOSERVER")
    private Boolean sincoServer;

    @Column(name = "SINCOCLIENT")
    private Boolean sincoClient;

    @Column(name = "SERT")
    private Boolean sert;

    @Column(name = "SCLAD")
    private Boolean sclad;

    @Column(name = "PROIZVODSTVO")
    private Boolean proizvodstvo;

    @Column(name = "OPTIMA")
    private Boolean optima;

    @Column(name = "GORSPRAVKA")
    private Boolean gorSpravka;

    @Column(name = "MEDOK")
    private Boolean medoc;

    @Column(name = "PODATKOVA")
    private Boolean podatkova = false;

    @Column(name = "BADM")
    private Boolean badm = false;

    @Column(name = "TOS")
    private Boolean tos = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(Date bestBefore) {
        this.bestBefore = bestBefore;
    }

    public Date getUpdateBefore() {
        return updateBefore;
    }

    public void setUpdateBefore(Date updateBefore) {
        this.updateBefore = updateBefore;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getDebtExists() {
        return debtExists;
    }

    public void setDebtExists(Boolean debtExists) {
        this.debtExists = debtExists;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    public String getBlzMedSync() {
        return blzMedSync;
    }

    public void setBlzMedSync(String blzMedSync) {
        this.blzMedSync = blzMedSync;
    }

    public Date getBlzMedSyncUpdateBefore() {
        return blzMedSyncUpdateBefore;
    }

    public void setBlzMedSyncUpdateBefore(Date blzMedSyncUpdateBefore) {
        this.blzMedSyncUpdateBefore = blzMedSyncUpdateBefore;
    }

    public Boolean getDocOborot() {
        return docOborot;
    }

    public void setDocOborot(Boolean docOborot) {
        this.docOborot = docOborot;
    }

    public Boolean getReceptu() {
        return receptu;
    }

    public void setReceptu(Boolean receptu) {
        this.receptu = receptu;
    }

    public Boolean getRoznica() {
        return roznica;
    }

    public void setRoznica(Boolean roznica) {
        this.roznica = roznica;
    }

    public Boolean getPlateju() {
        return plateju;
    }

    public void setPlateju(Boolean plateju) {
        this.plateju = plateju;
    }

    public Boolean getZakPotavcik() {
        return zakPotavcik;
    }

    public void setZakPotavcik(Boolean zakPotavcik) {
        this.zakPotavcik = zakPotavcik;
    }

    public Boolean getFilialu() {
        return filialu;
    }

    public void setFilialu(Boolean filialu) {
        this.filialu = filialu;
    }

    public Boolean getSincoServer() {
        return sincoServer;
    }

    public void setSincoServer(Boolean sincoServer) {
        this.sincoServer = sincoServer;
    }

    public Boolean getSincoClient() {
        return sincoClient;
    }

    public void setSincoClient(Boolean sincoClient) {
        this.sincoClient = sincoClient;
    }

    public Boolean getSert() {
        return sert;
    }

    public void setSert(Boolean sert) {
        this.sert = sert;
    }

    public Boolean getSclad() {
        return sclad;
    }

    public void setSclad(Boolean sclad) {
        this.sclad = sclad;
    }

    public Boolean getProizvodstvo() {
        return proizvodstvo;
    }

    public void setProizvodstvo(Boolean proizvodstvo) {
        this.proizvodstvo = proizvodstvo;
    }

    public Boolean getOptima() {
        return optima;
    }

    public void setOptima(Boolean optima) {
        this.optima = optima;
    }

    public Boolean getGorSpravka() {
        return gorSpravka;
    }

    public void setGorSpravka(Boolean gorSpravka) {
        this.gorSpravka = gorSpravka;
    }

    public Boolean getMedoc() {
        return medoc;
    }

    public void setMedoc(Boolean medoc) {
        this.medoc = medoc;
    }

    public Boolean getPodatkova() {
        return podatkova;
    }

    public void setPodatkova(Boolean podatkova) {
        this.podatkova = podatkova;
    }

    public Boolean getBadm() {
        return badm;
    }

    public void setBadm(Boolean badm) {
        this.badm = badm;
    }

    public Boolean getTos() {
        return tos;
    }

    public void setTos(Boolean tos) {
        this.tos = tos;
    }

    @Override
    public String toString() {
        return "LicenceView{" +
                "id=" + id +
                ", bestBefore=" + bestBefore +
                ", updateBefore=" + updateBefore +
                ", createdBy='" + createdBy + '\'' +
                ", debtExists=" + debtExists +
                ", debt='" + debt + '\'' +
                ", blzMedSync='" + blzMedSync + '\'' +
                ", blzMedSyncUpdateBefore=" + blzMedSyncUpdateBefore +
                ", docOborot=" + docOborot +
                ", receptu=" + receptu +
                ", roznica=" + roznica +
                ", plateju=" + plateju +
                ", zakPotavcik=" + zakPotavcik +
                ", filialu=" + filialu +
                ", sincoServer=" + sincoServer +
                ", sincoClient=" + sincoClient +
                ", sert=" + sert +
                ", sclad=" + sclad +
                ", proizvodstvo=" + proizvodstvo +
                ", optima=" + optima +
                ", gorSpravka=" + gorSpravka +
                ", medoc=" + medoc +
                ", podatkova=" + podatkova +
                ", badm=" + badm +
                ", tos=" + tos +
                '}';
    }
}
