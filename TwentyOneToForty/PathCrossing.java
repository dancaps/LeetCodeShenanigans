package TwentyOneToForty;

import java.util.*;

/**
 * Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east,
 * or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
 *
 * Return true if the path crosses itself at any point, that is, if at any time you are on a location you have
 * previously visited. Return false otherwise.
 *
 * Example 1:
 * Input: path = "NES"
 * Output: false
 * Explanation: Notice that the path doesn't cross any point more than once.
 *
 * Example 2:
 * Input: path = "NESWW"
 * Output: true
 * Explanation: Notice that the path visits the origin twice.
 *
 * Constraints:
 * 1 <= path.length <= 104
 * path[i] is either 'N', 'S', 'E', or 'W'.
 */

public class PathCrossing {

    public static void main(String[] args) {
        System.out.println("Expected: false, Actual: " + solution("NES"));
        System.out.println("Expected: true, Actual: " + solution("NESWW"));
        System.out.println("Expected: true, Actual: " + solution("NNEESSWW"));
        System.out.println("Expected: false, Actual: " + solution("NNEESSSWWW"));
        System.out.println("Expected: true, Actual: " + solution("NNSWWEWSSESSWENNW"));
    }

    public static boolean solution(String path) {

        Set<List<Integer>> coordinates = new HashSet<>();
        coordinates.add(new ArrayList<>(Arrays.asList(0, 0)));
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            switch (direction) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
            }
            if (coordinates.contains(Arrays.asList(x, y))) {
                return true;
            }
            coordinates.add(new ArrayList<>(Arrays.asList(x, y)));
        }

        return false;
    }
}

/** Pseudocode
 * Create a set with coordinates[]
 * add starting cords (0,0)
 * store previous coord
 *
 * for each char in path
 *  switch char
 *      case n
 *          update previous coords[1]++
 *      case s
 *          update previous coords[1]--
 *      case e
 *          update previous coords[0]++
 *      case w
 *          update previous coords[0]--
 *
 *   if new coords exist
 *      return true
 *   add new coords to the set
 *
 * return false
 */
