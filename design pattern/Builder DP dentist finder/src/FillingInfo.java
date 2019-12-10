import java.util.ArrayList;

public interface FillingInfo {
    void setPersonalInfo (PersonalInfo personalInfo);
    void setBiography(Biography biography);
    void setEducationInfo (ArrayList<EducationInfo> educationInfo);
    void setEducationInfo (EducationInfo educationInfo);
    void setAddressSec (ArrayList<AddressSec> addressSec);
    void setAddressSec (AddressSec addressSec);
    void setSpecializationSec (ArrayList<SpecializationSec> specializationSec);
    void setSpecializationSec (SpecializationSec addressSec);
        
    @Override
    String toString();
}
