public class ContactMethods {
    private String emailAddress;
    private String website;
    private String phoneNumber;

    public ContactMethods() {
    }
    
    public ContactMethods(String emailAddress, String website, String phoneNumber) {
        this.setEmailAddress(emailAddress);
        this.setWebsite(website);
        this.setPhoneNumber(phoneNumber);
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
