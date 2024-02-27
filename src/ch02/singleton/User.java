package ch02.singleton;

public class User {
    private String name; //사용자이름

    public User(String name) {
        this.name = name;
    }

    //사용자가 프린트를 사용해서 프린트 결과를 출력하는 메소드
    public void print() {
        Printer printer = Printer.getPrinter();

        printer.print(this.name + "이 프린트 사용중: " + printer);
    }
}
