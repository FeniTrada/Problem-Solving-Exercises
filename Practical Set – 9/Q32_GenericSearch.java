import java.util.*;

public class GenericSearch {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNos = new LinkedList<>();
        rollNos.add(101);
        rollNos.add(102);
        rollNos.add(103);

        System.out.println("Search 102: " + searchElement(rollNos, 102));

        LinkedList<String> names = new LinkedList<>();
        names.add("Disha");
        names.add("Rahul");
        names.add("Priya");

        System.out.println("Search Rahul: " + searchElement(names, "Rahul"));
    }
}
