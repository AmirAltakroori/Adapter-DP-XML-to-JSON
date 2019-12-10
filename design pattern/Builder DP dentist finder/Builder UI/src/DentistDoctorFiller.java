
import java.util.ArrayList;

public class DentistDoctorFiller implements FillingInfo {

    private PersonalInfo personalInfo;
    private Biography biography;
    private ArrayList<EducationInfo> educationInfo;
    private ArrayList<AddressSec> addressList;
    private ArrayList<SpecializationSec> specializationSec;

    public DentistDoctorFiller() {
        this.personalInfo = null;
        this.biography = null;
        this.educationInfo = new ArrayList<>();
        this.addressList = new ArrayList<>();
        this.specializationSec = new ArrayList<>();
    }

    @Override
    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    @Override
    public void setBiography(Biography biography) {
        this.biography = biography;
    }

    @Override
    public void setEducationInfo(ArrayList<EducationInfo> educationInfo) {
        this.educationInfo = educationInfo;
    }

    @Override
    public void setEducationInfo(EducationInfo educationInfo) {
        this.educationInfo.add(educationInfo);
    }

    @Override
    public void setAddressSec(ArrayList<AddressSec> addressList) {
        this.addressList = addressList;
    }

    @Override
    public void setAddressSec(AddressSec addressList) {
        this.addressList.add(addressList);
    }

    @Override
    public void setSpecializationSec(ArrayList<SpecializationSec> specializationSec) {
        this.specializationSec = specializationSec;
    }

    @Override
    public void setSpecializationSec(SpecializationSec specializationSec) {
        this.specializationSec.add(specializationSec);
    }

    public DoctorInfo getDoctorInfo() {
        return new DoctorInfo(personalInfo, biography, educationInfo, addressList, specializationSec);
    }

    @Override
    public String toString() {
        String widgetPreview = personalInfo.getFisrtName() + this.personalInfo.getLastName() + " , " + educationInfo.get(0).getDegree() + '\n';
        widgetPreview += personalInfo.getContactMethods().getEmailAddress() + " | " + personalInfo.getContactMethods().getPhoneNumber() + " | " + personalInfo.getContactMethods().getWebsite()+ '\n';

        for (int i = 1; i <= addressList.size(); i++) {
            widgetPreview += i + ") " + addressList.get(i - 1).getCountry() + ", " + addressList.get(i - 1).getState() + ", " + addressList.get(i - 1).getCity() + '\n';
        }
        return widgetPreview;
    }

}
