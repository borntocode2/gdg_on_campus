import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(0, 40);
        System.out.println(list);
    }
}
