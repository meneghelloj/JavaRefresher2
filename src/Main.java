import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
    //System.out.println(recurseMe(1,true));
        ArrayList<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Bob");
        names.add("Billy");
        for(int i=0; i < names.size();i++) {
            System.out.println(recurseMe(names.get(i), i, names));
        }
    }


    private static String recurseMe(String name, int i, ArrayList<String> names){
        System.out.println(name);
        if (i == names.size()-1){
            return "That's all folks!";
        }else {
            return recurseMe(names.get(i+1)+ " "+ name,i+1,  names);
        }


    }
}
