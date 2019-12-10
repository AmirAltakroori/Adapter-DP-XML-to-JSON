/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnA
 */
public class Biography {
    private String licenseCountyName;
    private int licenseNumber;
    private int practiceYears;

    public Biography() {
    }
    

    public Biography(String licenseCountyName, int licenseNumber, int practiceYears) {
        this.setLicenseCountyName(licenseCountyName);
        this.setLicenseNumber(licenseNumber);
        this.setPracticeYears(practiceYears);
    }
    
    
     public String getLicenseCountyName() {
        return licenseCountyName;
    }

    public void setLicenseCountyName(String licenseCountyName) {
        this.licenseCountyName = licenseCountyName;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getPracticeYears() {
        return practiceYears;
    }

    public void setPracticeYears(int practiceYears) {
        this.practiceYears = practiceYears;
    }
}
