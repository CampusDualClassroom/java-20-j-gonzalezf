package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("John", "Smith"));
        person.add(new Teacher("María", "Montessori", "Educación"));
        person.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        person.add(new Doctor("Gregory", "House", "Nefrología e infectología"));
        return person;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        stringList.forEach(Person::getDetails);
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
