package ch01.asso3;

import java.util.ArrayList;

public class Course {
    private String name; //과목명

    //과목하나당 성적을 여러개 저장
    private ArrayList<Transcript> transcripts;

    public Course(String name) {
        this.name = name;
        transcripts = new ArrayList<>();
    }

    public String getName() { return name; }

    //성적추가
    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }
}
