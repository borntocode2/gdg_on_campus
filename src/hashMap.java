import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "상화");
        map.put(1, "지원");
        //상화가 삭제되고 지원이 map안에 put
        System.out.println(map);

    }
}
