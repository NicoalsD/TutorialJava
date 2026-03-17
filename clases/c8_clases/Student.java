package clases.c8_clases;

public class Student {
    int score;

    public Student(int score) {
        this.score = score;
    }

    public boolean siAprobo() {
        return this.score >= 60;
    }
}
