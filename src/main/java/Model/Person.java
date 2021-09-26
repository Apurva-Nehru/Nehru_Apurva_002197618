/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.util.Date;

/**
 *
 * @author apurv
 */
public class Person {
private String  Name ;
    private String Address;
    private Date DOB;
    private Long PhoneNumber;
    private Long FaxNumber;
    private String EmailAddress;
    private String SSN;
    private Long MedicalrecordNum;
    private Long HealthPlanBenficiaryNum;
    private Long AccountNum;
    private Long LisenceNum;
    private Long Vinum;
    private Long Deviceidentifier;
    private String LinkedInURL;
    private String IPAdd;
    private File Image;

    public File getImage() {
        return Image;
    }

    public void setImage(File Image) {
        this.Image = Image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Long PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public Long getFaxNumber() {
        return FaxNumber;
    }

    public void setFaxNumber(Long FaxNumber) {
        this.FaxNumber = FaxNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Long getMedicalrecordNum() {
        return MedicalrecordNum;
    }

    public void setMedicalrecordNum(Long MedicalrecordNum) {
        this.MedicalrecordNum = MedicalrecordNum;
    }

    public Long getHealthPlanBenficiaryNum() {
        return HealthPlanBenficiaryNum;
    }

    public void setHealthPlanBenficiaryNum(Long HealthPlanBenficiaryNum) {
        this.HealthPlanBenficiaryNum = HealthPlanBenficiaryNum;
    }

    public Long getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(Long AccountNum) {
        this.AccountNum = AccountNum;
    }

    public Long getLisenceNum() {
        return LisenceNum;
    }

    public void setLisenceNum(Long LisenceNum) {
        this.LisenceNum = LisenceNum;
    }

    public Long getVinum() {
        return Vinum;
    }

    public void setVinum(Long Vinum) {
        this.Vinum = Vinum;
    }

    public Long getDeviceidentifier() {
        return Deviceidentifier;
    }

    public void setDeviceidentifier(Long Deviceidentifier) {
        this.Deviceidentifier = Deviceidentifier;
    }

    public String getLinkedInURL() {
        return LinkedInURL;
    }

    public void setLinkedInURL(String LinkedInURL) {
        this.LinkedInURL = LinkedInURL;
    }

    public String getIPAdd() {
        return IPAdd;
    }

    public void setIPAdd(String IPAdd) {
        this.IPAdd = IPAdd;
    }

  
    }
