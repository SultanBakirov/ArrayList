package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Student student = new Student("Sultan", 20);
//        Student student1 = new Student("Sultan", null);
//        Student student2 = new Student("Sultan", -2);
//        ArrayList<Student> students = new ArrayList<>();
//        System.out.println(student);
//        System.out.println(student1);
//        System.out.println(student2);

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        for (int i: arrayList) {
            System.out.print(i + ", ");
//            if (i % 2 == 0) {
//                System.out.println(i + ", ");
//            } else if (i % 2 == 1) {
//                System.out.println(i + ", ");
//            }
        }
        System.out.println("\nJup sandar: ->");

//        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i: arrayList) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nTak sandar: ->");

//        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i: arrayList) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }
    }
}
