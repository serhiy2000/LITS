//package com.lits.lesson10;
//
//import lesson9.Person;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Application {
//    public static void main(String[] args) {
//
//        List <String> arrayPerson = new ArrayList<>();
//        List <String> linkedperson = new LinkedList<>();
//        Person boy = new Person (12, "Vova");
//        Person boy1 = new Person(13, "Vova1");
//        Person boy2 = new Person(14, "Vova2");
//        Person boy3 = new Person(15, "Vova3");
//        Person boy4 = new Person(16, "Vova4");
//        Person boy5 = new Person(17, "Vova5");
//        Person boy6 = new Person(18, "Vova6");
//        Person boy7 = new Person(18, "Vova6");
//        Person boy8 = new Person(19, "Vova7");
//
//        arrayPerson.add(boy);
//        arrayPerson.add(boy1);
//        arrayPerson.add(boy2);
//        arrayPerson.add(boy3);
//        arrayPerson.add(boy4);
//        arrayPerson.add(boy5);
//        arrayPerson.add(boy6);
//        arrayPerson.add(boy7);
//        arrayPerson.add(boy8);
//
//
//        linkedperson.add(boy);
//        linkedperson.add(boy1);
//        linkedperson.add(boy2);
//        linkedperson.add(boy3);
//        linkedperson.add(boy4);
//        linkedperson.add(boy5);
//        linkedperson.add(boy6);
//        linkedperson.add(boy7);
//        linkedperson.add(boy8);
//
//        add(arrayPerson, linkedperson, new Person(27,"Pavlo"));
//    }
//
//    private static void add(List<Person> arrayList, List<Person> linkedList, Person person) {
//        arrayList.add(person);
//        linkedList.add(person);
//        System.out.println(arrayList);
//        System.out.println(linkedList);
//    }
//}