package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class ValidCheck {

    private boolean phoneCheck(String phone){
        Predicate<String> check = p -> p.contains("+1");
        return check.test(phone);
    }

    private boolean emailCheck(String email){
        Predicate<String> check = p -> p.contains("@");
        return check.test(email);
    }

    private boolean ageCheck(LocalDate age){
        Predicate<LocalDate> check = d -> Period.between(age, LocalDate.now()).getYears() > 21;
        return check.test(age);
    }

    public boolean isValidMember(Member member){
        return phoneCheck(member.getPhone()) && emailCheck(member.getEmail()) && ageCheck(member.getAge());
    }
}
