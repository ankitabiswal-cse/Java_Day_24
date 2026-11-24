import java.util.ArrayList;
public class MaximumNumber {
    public static void main(String[] args){

        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(80);
        numbers.add(15);
        numbers.add(60);

        int max = numbers.get(0);

        for(int num : numbers){
            if(num > max) {
                max = num;
            }
        }
        System.out.println("Maximun ="+max);
    }
}
