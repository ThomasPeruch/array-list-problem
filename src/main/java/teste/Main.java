package teste;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] ids = {10,22,35,99,88};
        List<Integer> idsList = Arrays.asList(ids);
        idsList.add(7); //throw UnsuportedOperationException
    }
}