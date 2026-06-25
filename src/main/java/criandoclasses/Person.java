package criandoclasses;


import lombok.Getter;

// @author Marcelo Neves
@Getter
//@Setter
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = 1;
    }
}
