package ch01.asso;

public class Main {
    public static void main(String[] args) {
        //과목
        Course java = new Course("java");
        Course python = new Course("python");

        //학생
        Student student = new Student("김하서");

        //수강신청
        student.registerCourse(java);
        student.registerCourse(python);

        //수강취소
        student.dropCourse(python);

    }
}
