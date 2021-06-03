package functions;

import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;


public class OneArgument {
    public static void main(String[] args) {
        //==================ONE ARGUMENT=======================
        Function<Integer, Integer> oneArg = number -> number + 5;
        Function<Integer, Integer> secondArg =  number -> number * 10;
        Function<Integer, Integer> addByOne = oneArg.andThen(secondArg);
        int res = addByOne.apply(4);
        //=========================================================

        //====================TWO ARGUMENTS=======================
        BiFunction<Integer, Integer, Integer> sumDivide= (num1, num2) -> (num1 + num2) / 5;
        int res2 = sumDivide.apply(4, 3);

        //=========================================================


        //=======================CONSUMER===========================
        Person person1 = new Person("Kate", "Lee");
        Consumer<Person>  greeting = person -> System.out.println("Hello," + person.fName + " " + person.lName);
        greeting.accept(person1);

        //=========================================================

        //=======================CONSUMER===========================

        Person person2 = new Person("Alison", "Bredshow");
        BiConsumer<Person, Boolean> greeting2 = (person, check) -> System.out.println("Hello, " + person.fName + " " +
                (check ? person.lName : "*****"  ) );
        greeting2.accept(person2, false);
        //=========================================================


        //=======================PREDICATE(take one argument and returns true or false)==============
        Predicate<Integer> validNumber = num -> (num > 0) && (num % 2 == 0);
        Predicate<Integer> validNumber2 = num2 -> num2 > 4;

        System.out.println(validNumber.or(validNumber2).test(7));
        //=========================================================

        //==========================SUPPLIER=======================
        Supplier<String> supply = () -> "Supplier is working ...";
        System.out.println(supply.get());
        //=========================================================


        //==========================STREAMS=======================

        List<Person2> listP = List.of(
                new Person2("Kate", Gender.FEMALE),
                new Person2("Kalvin", Gender.MALE),
                new Person2("Lilly", Gender.FEMALE),
                new Person2("Josh", Gender.MALE)
        );

        List<Person2> listPers2 = listP.stream().filter(p -> Gender.FEMALE.equals(p.gender)).collect(Collectors.toList());
        System.out.println(listPers2);


        //=========================================================

        //==========================OPTIONALS=======================
        Optional.ofNullable(null).ifPresentOrElse((name)-> System.out.println("Welcome, " + name), ()->{
            System.out.println("Name is missing!");
        });
        //=========================================================



    }


    static class Person2 {
        public String name;
        private final Gender gender;

        public Person2(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person2{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }



    }
    enum Gender{
        FEMALE,
        MALE
    }

}



class Person{
    public String fName;
    public String lName;


    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}

