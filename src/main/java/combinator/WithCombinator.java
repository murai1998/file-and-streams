package combinator;
import combinator.WithCombinator.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface WithCombinator extends Function<Member, ValidationResult> {

    static WithCombinator validPhone(){
       return  member -> member.getPhone().contains("+1") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NOT_VALID;
    }

    static WithCombinator validEmail(){
        return  member -> member.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static WithCombinator validAge(){
        return  member -> Period.between(member.getAge(), LocalDate.now()).getYears() > 21 ? ValidationResult.SUCCESS : ValidationResult.AGE_NOT_VALID;
    }

    default WithCombinator and(WithCombinator other){
        return member -> {
            ValidationResult result = this.apply(member);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(member) : result;
        };
    }

    enum ValidationResult{
        SUCCESS,
        PHONE_NOT_VALID,
        EMAIL_NOT_VALID,
        AGE_NOT_VALID
    }
}
