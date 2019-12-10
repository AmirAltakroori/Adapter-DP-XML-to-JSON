public class SpecializationSec {

    private String specializationArea;
    private int startYear;

    public SpecializationSec() {
    }

    public SpecializationSec(String specializationArea, int startYear) {
        this.setSpecializationArea(specializationArea);
        this.setStartYear(startYear);
    }    

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getSpecializationArea() {
        return specializationArea;
    }

    public void setSpecializationArea(String specializationArea) {
        this.specializationArea = specializationArea;
    }
}
