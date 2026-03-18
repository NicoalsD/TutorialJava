package clases.c8_oop.accesmodifiers;

public class Student {
    // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

    private int grade;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        return (grade >= 60);
    }
}
