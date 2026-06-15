package criandoclasses;// @author Marcelo Neves

public class Main {
    public static void main(String[] args) {
      var male = new Person("Joao", 19);
      var female = new Person("Maria", 20);
        System.out.printf("Male: \t%s and Age: %d \n", male.getName(), male.getAge());
        System.out.printf("Female: %s and Age: %d ", female.getName(), female.getAge());
    }
}
