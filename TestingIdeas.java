import java.util.HashMap;
import java.util.Map;

public class TestingIdeas {
    public static void main(String[] args) {
        Map<Integer, Integer> myHashMap = new HashMap<>();

        myHashMap.put(1, 100);
        myHashMap.put(100000, 100);
        //myHashMap.clear();

        System.out.println(myHashMap);
    }
}
