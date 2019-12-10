
import java.util.ArrayList;

public class DoctorInfo {

    private PersonalInfo personalInfo;
    private Biography biography;
    private ArrayList<EducationInfo> educationInfoList;
    private ArrayList<AddressSec> addressList;
    private ArrayList<SpecializationSec> specializationSecList;

    public DoctorInfo(PersonalInfo personalInfo, Biography biography, ArrayList<EducationInfo> educationInfo, ArrayList<AddressSec> addressList, ArrayList<SpecializationSec> specializationSec) {
        this.personalInfo = personalInfo;
        this.biography = biography;
        this.educationInfoList = educationInfo;
        this.addressList = addressList;
        this.specializationSecList = specializationSec;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Biography getBiography() {
        return biography;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }

    public ArrayList<EducationInfo> getEducationInfoList() {
        return educationInfoList;
    }

    public void setEducationInfoList(ArrayList<EducationInfo> educationInfoList) {
        this.educationInfoList = educationInfoList;
    }

    public ArrayList<AddressSec> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<AddressSec> addressList) {
        this.addressList = addressList;
    }

    public ArrayList<SpecializationSec> getSpecializationSecList() {
        return specializationSecList;
    }

    public void setSpecializationSecList(ArrayList<SpecializationSec> specializationSecList) {
        this.specializationSecList = specializationSecList;
    }

    public DoctorInfo getDoctorInfo() {
        return new DoctorInfo(personalInfo, biography, educationInfoList, addressList, specializationSecList);
    }

}
