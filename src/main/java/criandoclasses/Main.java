package criandoclasses;// @author Marcelo Neves

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      var male = new Person();
      male.name = "Joao";
      male.age = 18;

      var female = new Person();
      female.name = "Maria";
      female.age = 19;

        System.out.println("Male: " + male.name + ", Age: " + male.age);
        System.out.println("Female: " +  female.name +  ", Age: " + female.age);


    }
}
