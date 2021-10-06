package com.example.iterator;

public class DemoRunner {
    public static void main(String[] args) {
        Student s1=new Student("zs");
        Student s2=new Student("ls");
        Student s3=new Student("ww");
        Student[] students=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        ClassRoom classRoom=new ClassRoom(students);
        Iterator iterator = classRoom.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
