public class EducationInfo {

    private String degree;
    private String major;
    private String schoolName;
    private int graduationDate;

    public EducationInfo() {
    }

    public EducationInfo(String degree, String major, String schoolName, int graduationDate) {
        this.setDegree(degree);
        this.setMajor(major);
        this.setSchoolName(schoolName);
        this.setGraduationDate(graduationDate);
    }
   
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

   
   
}
