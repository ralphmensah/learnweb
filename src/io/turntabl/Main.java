package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

//        List<Car> carList = new ArrayList<Car>(Arrays.asList(
//                new Car("Benze", "A234", 300),
//                new Car("Picanto", "B234", 400)
//        ));
//
//        System.out.println("Car list >> " + carList);
//        System.out.println("lenght : " + carList.size());
//
//        Car taxi = new Car("taxi", "E3545", 150);
//        carList.add(taxi);
//
//        System.out.println("Car list 2 : " + carList);
//        System.out.println("length: " + carList.size());
//
//        System.out.println("for each loop..");
//        for (Car car: carList) {
//            System.out.println(car.getType());
//        }


        // ENUMS AND STREAMS
        List<Student> students = Arrays.asList(     // since now creating list, use array.asList(...)
                new Student("Erbynn", 006, StudentYear.FOURTH),
                new Student("Doreen", 005, StudentYear.THIRD),
                new Student("Agnes", 0063, StudentYear.FIRST),
                new Student("Andy", 006, StudentYear.FOURTH)
                );

        System.out.println(students);
        System.out.println("LengthOfStudents: " + students.size() + "\n");

        // print individual students
        int i = 0;
        for (Student student: students) {
            System.out.println(i++ + " -> " + student);
        }

        // with streams...intermediate & terminal operation
        students.stream().forEach(e -> System.out.println(e + " || ")); //.forEach(System.out::println);


        // forth year filter
        List<Student> fourthYearStudents = new ArrayList<Student>();
        for (Student stu:
                students) {
            if(stu.getStudentYear() == StudentYear.FOURTH){
                fourthYearStudents.add(stu);
            }
        }
        System.out.println(fourthYearStudents);

        // forth year filter with streams
        students.stream().filter(e -> e.getStudentYear() == StudentYear.FOURTH).forEach(e -> System.out.println(e));

//        // map
//        System.out.println("\nmap works >>");
//        students.stream().map(e -> e.getStudentID() + 5).forEach(System.out::println);
    }
}