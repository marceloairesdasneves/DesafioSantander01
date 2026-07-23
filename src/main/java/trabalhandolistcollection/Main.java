package trabalhandolistcollection;

// @author Marcelo Neves

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> code2 = new ArrayList<>();
        code2.add(1);
        code2.add(2);

        code2.forEach(System.out::println);
    }

}
