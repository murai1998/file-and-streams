package combinator;

import java.time.LocalDate;

public class Combinators {

    public static void main(String[] args) {
        Member m1 = new Member("Kate Susan", "+1 589 433 9493", "tt@gmail.com", LocalDate.of(2004, 11, 25));
//        System.out.println(new ValidCheck().isValidMember(m1));


        System.out.println(WithCombinator.validAge().and(WithCombinator.validEmail()).and(WithCombinator.validPhone()).apply(m1));
    }


}
