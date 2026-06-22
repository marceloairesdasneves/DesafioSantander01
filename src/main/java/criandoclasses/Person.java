package criandoclasses;

import lombok.Getter;
import lombok.Setter;

// @author Marcelo Neves
@Getter
//@Setter
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = 1;
    }
}
