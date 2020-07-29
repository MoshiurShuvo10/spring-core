package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*public class Student implements InitializingBean, DisposableBean {*/
  public class Student {

    private String studentId ;
    private String studentName ;
    private String studentAddress ;
    private List<String> phoneNumbers ;
    private Set<String> courses ;
    private Map<String,String> courseInstructors ;
    private University university ;



    public Student() {}

    public Student(String studentId, String studentName, String studentAddress, List<String> phoneNumbers, Set<String> courses,
                   Map<String, String> courseInstructors, University university) {
        System.out.println("Student constructor");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.phoneNumbers = phoneNumbers;
        this.courses = courses;
        this.courseInstructors = courseInstructors;
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        System.out.println("Setting student Id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }


    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    public Map<String, String> getCourseInstructors() {
        return courseInstructors;
    }

    public void setCourseInstructors(Map<String, String> courseInstructors) {
        this.courseInstructors = courseInstructors;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void printStudent() {
        System.out.println("_______________________________________________________");
        System.out.println();
        System.out.println("Student Info: ");
        System.out.println("Id: "+getStudentId());
        System.out.println("Name: "+getStudentName());
        System.out.println("Address: "+getStudentAddress());
        System.out.println("Courses: "+getCourses());
        System.out.println("Phones: "+getPhoneNumbers());
        System.out.println("Course Instructors: "+getCourseInstructors());
        System.out.println(getUniversity());
        System.out.println();
        System.out.println("_________________________________________________________");
    }



  /*  @Override
    public void destroy() throws Exception {
        System.out.println("destroy() of Student bean. Method of DisposableBean interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() i.e. init() of Student bean. Method of InitializingBean interface");
    }

    public void init(){
        System.out.println("inside init() method of Student");
    }
    public void destroy(){
        System.out.println("inside destroy() method of Student");
    }*/

    @PostConstruct
    public void hello(){
        System.out.println("post construct..init..");
    }

    @PreDestroy
    public void bye(){
        System.out.println("pre destroy.. destroy..");
    }
}
