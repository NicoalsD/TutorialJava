package clases.c8_oop.clases_ejercicios;

public class Student {
    int score;

    public Student(int score) {
        this.score = score;
    }

    public boolean siAprobo() {
        return this.score >= 60;
    }
}
