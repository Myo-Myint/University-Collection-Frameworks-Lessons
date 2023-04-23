import java.util.LinkedList;

public class LnkdLstEg {
    public static void main(String[] args) {
        LinkedList<String> my_lnkdlst = new LinkedList<>();
        my_lnkdlst.add("Myo");
        my_lnkdlst.add("Thu");
        my_lnkdlst.add("Mint");
        System.out.println(my_lnkdlst);

        my_lnkdlst.remove(1);
        System.out.println(my_lnkdlst);

        System.out.println(my_lnkdlst.get(0));;

        my_lnkdlst.add(0,"New");
        System.out.println(my_lnkdlst);

        my_lnkdlst.set(1,"yoe");
        System.out.println(my_lnkdlst);
    }
}
