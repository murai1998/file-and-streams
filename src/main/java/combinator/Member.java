package combinator;

import java.time.LocalDate;

public class Member {
    private final String name;
    private final String phone;
    private final String email;
    private final LocalDate age;

    public Member(String name, String phone, String email, LocalDate age) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

}
