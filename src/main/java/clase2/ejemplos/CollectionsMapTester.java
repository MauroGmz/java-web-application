package clase2.ejemplos;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMapTester {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        fillData(map);
        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
        map.put("iPhone", "Created by Apple");
        map.remove("Android");
        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));

    }

    private static void fillData(Map<String, String> map) {

        map.put("Android", "Mobile");
        map.put("Eclipse IDE", "Java");
        map.put("Eclipse RCP", "Java");
        map.put("Git", "Version control system");

    }

}
