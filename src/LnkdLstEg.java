import java.util.LinkedList;

public class LnkdLstEg {
    public static void main(String[] args) {
        LinkedList<String> my_lnkdlst = new LinkedList<>();
        my_lnkdlst.add("Apple");
        my_lnkdlst.add("Orange");
        my_lnkdlst.add("Banana");
        System.out.println(my_lnkdlst);

        my_lnkdlst.remove();
        System.out.println(my_lnkdlst);

        System.out.println(my_lnkdlst.get(0));;

        my_lnkdlst.add("New");
        System.out.println(my_lnkdlst);

        my_lnkdlst.add(1,"yoe");
        System.out.println(my_lnkdlst);

    }
}
