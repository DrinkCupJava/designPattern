package com.example.iterator;

public class ClassRoom implements Aggregrate{

    private Student[] students;

    public ClassRoom(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public Iterator iterator() {
        return new ClassRoomIterator(this);
    }
}
