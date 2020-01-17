import java.util.ArrayList;

/**
 * Created by adamhurwitz on 3/10/16.
 * Note: Pass in any type of list.
 */
public class JavaClass {
    static ArrayList<String> strs = new ArrayList<String>();
    static int n = 3;

    public static void main(String arg[]) {
        strs.add("bob");
        strs.add("cats");
        strs.add("tires");
        System.out.println(grtrThanN(n, strs));
    }

    public static ArrayList<String> grtrThanN(int n,  ArrayList<String> strs){
        ArrayList<String> sol = new ArrayList<String>();
        for (String s : strs){
            if (s.length() > n){
                sol.add(s);
            }
        }
        return sol;
    }


}
