package org.example;

public class University {

    private String universityName ;
    private String universityLocation ;
    private int totalDepartments ;

    public University(String universityName, String universityLocation, int totalDepartments) {
        this.universityName = universityName;
        this.universityLocation = universityLocation;
        this.totalDepartments = totalDepartments;
    }

    public University() {
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        System.out.println("setting university name...");
        this.universityName = universityName;
    }

    public String getUniversityLocation() {
        return universityLocation;
    }

    public void setUniversityLocation(String universityLocation) {
        this.universityLocation = universityLocation;
    }

    public int getTotalDepartments() {
        return totalDepartments;
    }

    public void setTotalDepartments(int totalDepartments) {
        this.totalDepartments = totalDepartments;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", universityLocation='" + universityLocation + '\'' +
                ", totalDepartments=" + totalDepartments +
                '}';
    }

    public void init(){
        System.out.println("University: inside init()");
    }

    public void destroy(){
        System.out.println("University: inside destroy()");
    }
}
