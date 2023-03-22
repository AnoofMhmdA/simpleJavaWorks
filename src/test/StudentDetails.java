package test;

import java.util.Comparator;

public class StudentDetails {
    // studentDetails model class
    String name;
    int mark;

    public StudentDetails(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    static Comparator<StudentDetails> comparator=new Comparator<StudentDetails>() {
        @Override
        public int compare(StudentDetails s1, StudentDetails s2) {
            int mark1=s1.getMark();
            int mark2= s2.getMark();
            return mark1-mark2;
        }
    };
}
