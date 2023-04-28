import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Myo",20);
        myHashMap.put("Ronaldo",37);
        myHashMap.put("Messi",35);

        System.out.println(myHashMap);

        myHashMap.remove("Ronaldo");
        System.out.println(myHashMap);

        myHashMap.replace("Messi",35,1);
        System.out.println(myHashMap);

    }
}
