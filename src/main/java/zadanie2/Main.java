package zadanie2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new LinkedList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");

        System.out.println(lista);

        ReversList reversList =new ReversList();
       reversList.reversList(lista);

        System.out.println(lista);

    }
}
