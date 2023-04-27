import java.util.ArrayList;

public class ArrayListEg {
    public static void main(String[] args) {

        ArrayList<String> my_arrlist = new ArrayList<>();
        my_arrlist.add("Myo");
        my_arrlist.add("Thu");
        my_arrlist.add("Mint");
        System.out.println(my_arrlist);

        my_arrlist.remove(1);
        System.out.println(my_arrlist);

        System.out.println(my_arrlist.get(0));;

        my_arrlist.add(0,"New");
        System.out.println(my_arrlist);

        my_arrlist.set(1,"yoe");
        System.out.println(my_arrlist);
//        System.out.println(my_arrlist.contains("Myo"));

    }
}
