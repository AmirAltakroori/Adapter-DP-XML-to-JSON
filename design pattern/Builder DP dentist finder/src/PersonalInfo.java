/**
 * This class contain some basic personal information such as:
 * first name, last name, gender, email address, website, phoneNumber
 */
public class PersonalInfo {

    private String fisrtName;
    private String lastName;
    private String gender;
    private ContactMethods contactMethods;

    public PersonalInfo() {
    }
    

    public PersonalInfo(String fisrtName, String lastName, String gender, ContactMethods contactMethods) {
        this.setFisrtName(fisrtName);
        this.setLastName(lastName);
        this.setGender(gender);
        this.setContactMethods(contactMethods);
    }

    public ContactMethods getContactMethods() {
        return contactMethods;
    }

    public void setContactMethods(ContactMethods contactMethods) {
        this.contactMethods = contactMethods;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
