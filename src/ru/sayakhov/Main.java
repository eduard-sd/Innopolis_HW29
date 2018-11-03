package ru.sayakhov;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать хешмап для класса Person (поля - имя, возраст, пол) - переопределить equals, hashcode для объектов класса Person.
 * В режиме отладки посмотреть как элементы будут попадать внуть бакетов хешмапы
 * */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Person peter = new Person("Peter",29,'M');
        Person anton = new Person("Anton",29,'M');
        Person anton2 = new Person("Anton2",20,'M');
        Person anton3 = new Person("Anton3",20,'M');
        Person anton4 = new Person("Anton4",15,'M');
        Person anton5 = new Person("Anton5",10,'M');

        Map<Person, Person> personsList = new HashMap<>();
        personsList.put(peter,peter);
        personsList.put(anton,anton);
        personsList.put(anton2,anton2);
        personsList.put(anton3,anton3);
        personsList.put(anton4,anton4);
        personsList.put(anton5,anton5);

        System.out.println(anton.getName()+personsList.get(anton));
    }
}
