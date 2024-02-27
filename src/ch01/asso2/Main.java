package ch01.asso2;

public class Main {
    public static void main(String[] args) {
        //과목
        Course java = new Course("java");
        Course python = new Course("python");

        //학생
        Student kim = new Student("김하서");
        Student lee = new Student("이지은");

        //수강신청
        kim.registerCourse(java);
        kim.registerCourse(python);

        //수강취소
        kim.dropCourse(python);

        //과목에 학생 추가
        java.addStudent(kim);
        java.addStudent(lee);
        //과목에 학생 제거
        java.removeStudent(lee);
    }
}
