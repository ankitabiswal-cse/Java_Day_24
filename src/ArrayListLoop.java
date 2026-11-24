import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args){

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("DSA");
        subjects.add("DBMS");
        subjects.add("Operating System");

        for(String subject:subjects){
            System.out.println(subject);
        }
    }
}
