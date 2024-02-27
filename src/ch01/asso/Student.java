package ch01.asso;

import java.util.ArrayList;

public class Student {
    private String name; //학생이름

    //Student는 Course를 알고있다.(의존하고 있다)
    //학생은 여러개의 과목을 수강한다.
    private ArrayList<Course> courses;

    //생성자
    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    //수강신청
    public void registerCourse(Course course) {
        courses.add(course);
    }

    //수강취소
    public void dropCourse(Course course) {
        courses.remove(course);
    }
}
