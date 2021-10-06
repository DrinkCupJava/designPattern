package com.example.iterator;

public class ClassRoomIterator implements Iterator{

    private ClassRoom classroom;
    private int index;

    public ClassRoomIterator(ClassRoom classroom) {
        this.classroom = classroom;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index<classroom.getStudents().length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        index++;
        return classroom.getStudents()[index-1];
    }
}
