import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            integers.add(random.nextInt(1, 100));
            ArrayList<Integer> Jupsan = new ArrayList<>();
            ArrayList<Integer> Taksan = new ArrayList<>();
            for (int j = 0; j < integers.size(); j++) {
                if (integers.get(i) % 2 == 0) {
                    Jupsan.add(integers.get(i));
                } else {
                    Taksan.add(integers.get(i));
                }
            }
            System.out.println(Taksan);
            System.out.println(Jupsan);
        }
        System.out.println(integers);


    }
}
