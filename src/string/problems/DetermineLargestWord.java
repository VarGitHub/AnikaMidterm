package string.problems;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Collections;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */

        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        // Using TreeMap to sort the map in reverse order to get the largest word in the front.
        Map<Integer, String> descendingMap = new TreeMap<Integer,String>(Collections.reverseOrder());
        descendingMap.putAll(wordNLength);

        for (Map.Entry<Integer,String> entry: descendingMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            // break because I only need the first element.
            break;
        }

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        // String st = "";
        //implement

        // Turning wordGiven into an array.
        String [] tempStr = wordGiven.split(" ");
        for (String s : tempStr)
            map.put(s.length(), s);

        return map;
    }
}
