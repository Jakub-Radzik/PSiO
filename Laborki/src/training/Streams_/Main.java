package training.Streams_;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = getPeople();

//        List<Person> females = people.stream()
//                .filter(person -> person.getGender().equals(Gender.FEMALE))
//                .collect(Collectors.toList());
//
//        List<Person> sortPeople = people.stream()
//                .sorted(Comparator.comparing(Person::getAge).reversed())
//                .collect(Collectors.toList());
//        sortPeople.forEach(System.out::println);

//        boolean b = people.stream()
//                .noneMatch(person -> person.getAge() < 22);
//
//        System.out.println(b);


//        people.stream()
//                .min(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);

//        Map<Gender, List<Person>> groupByGender = people.stream()
//                .collect(Collectors.groupingBy(Person::getGender));
//
//        groupByGender.forEach((k,v) -> System.out.println(k+":"+v));

        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresent(System.out::println);


    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("Jakub Radzik", 20, Gender.MALE),
                new Person("Andrzej Radzik", 21, Gender.MALE),
                new Person("Zbigniew Radzik", 22, Gender.MALE),
                new Person("Kamil Radzik", 30, Gender.MALE),
                new Person("Karolina Radzik", 50, Gender.FEMALE),
                new Person("Mieczysława Radzik", 10, Gender.FEMALE)
        );
    }
}
