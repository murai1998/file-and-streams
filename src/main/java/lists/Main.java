package lists;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Kate", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Alison", Gender.FEMALE)
                );

List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }


people.stream().filter(person -> person.name.startsWith("K")).collect(Collectors.toList()).forEach(System.out::println);
        incrementByOne = incrementByOne.andThen(a -> a + 100);
        System.out.println(incrementByOne.apply(9));
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    list1 = list1.stream().map(i -> i * 10).sorted().collect(Collectors.toList());
// list1.forEach(System.out::println);
        //========RANDOM NUMBERS========
        Random random = new Random();
        random.ints().limit(10).sorted().filter(n -> n > 0).forEach(System.out::println);

    }

  static Function<Integer, Integer> incrementByOne = i -> i + 1;
    static Function<String, String> modifyString = str -> str.toUpperCase();


    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


    enum Gender{
        MALE, FEMALE
    }

    }









