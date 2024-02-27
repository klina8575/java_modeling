package ch01.asso;

public class Course {
    private String name; //과목명

    //생성자
    public Course(String name) {
        this.name = name;
    }

    //과목명 리턴
    public String getName() {
        return name;
    }
}
