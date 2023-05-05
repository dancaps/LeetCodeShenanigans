package TwentyOneToForty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from
 * cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
 * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 *
 * Example 1:
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo"
 * Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city.
 * Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
 *
 * Example 2:
 * Input: paths = [["B","C"],["D","B"],["C","A"]]
 * Output: "A"
 * Explanation: All possible trips are:
 * "D" -> "B" -> "C" -> "A".
 * "B" -> "C" -> "A".
 * "C" -> "A".
 * "A".
 * Clearly the destination city is "A".
 *
 * Example 3:
 * Input: paths = [["A","Z"]]
 * Output: "Z"
 *
 * Constraints:
 * 1 <= paths.length <= 100
 * paths[i].length == 2
 * 1 <= cityAi.length, cityBi.length <= 10
 * cityAi != cityBi
 * All strings consist of lowercase and uppercase English letters and the space character.
 */
public class DestinationCity {
    public static void main(String[] args) {

        List<List<String>> paths =new ArrayList<>() ;
        paths.add(new ArrayList<>());
        paths.get(0).add("B");
        paths.get(0).add("C");
        paths.add(new ArrayList<>());
        paths.get(1).add("D");
        paths.get(1).add("B");
        paths.add(new ArrayList<>());
        paths.get(2).add("C");
        paths.get(2).add("A");
        //System.out.println(paths);
        System.out.println("Expected: A, Actual: " + solution(paths));

        List<List<String>> paths2 =new ArrayList<>() ;
        paths2.add(new ArrayList<>());
        paths2.get(0).add("London");
        paths2.get(0).add("New York");
        paths2.add(new ArrayList<>());
        paths2.get(1).add("New York");
        paths2.get(1).add("Lima");
        paths2.add(new ArrayList<>());
        paths2.get(2).add("Lima");
        paths2.get(2).add("San Paulo");
        //System.out.println(paths2);
        System.out.println("Expected: Sao Paulo, Actual: " + solution(paths2));

        List<List<String>> paths3 =new ArrayList<>() ;
        paths3.add(new ArrayList<>());
        paths3.get(0).add("A");
        paths3.get(0).add("Z");
        //System.out.println(paths);
        System.out.println("Expected: Z, Actual: " + solution(paths3));
    }

    public static String solution(List<List<String>> paths) {
        Map<String, String> sources = new HashMap<>();
        for (List<String> path : paths) {
            sources.put(path.get(0), path.get(1));
        }

        for (List<String> path : paths) {
            if (!sources.containsKey(path.get(1))) {
               return path.get(1);
            }
        }
        return "";
    }
}

/** Pseudocode
 * input = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * create hashmap to hold the key = sourceCity and value = destinationCity
 * populate the HM
 *
 * loop the input index[1]
 *  if it doesn't contain a key
 *      return index[1]
 * return "";
 */
