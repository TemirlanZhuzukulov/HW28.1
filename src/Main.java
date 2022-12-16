import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

            Integer[] integers = {4,1,3,88,17,2,19,8,5,8};

            Integer max = Arrays.stream(integers)
                    .filter(integer -> integer % 2 == 0)
                    .map(integer -> (int)Math.pow(integer,2))
                    .max(Comparator.naturalOrder()).get();

            System.out.println("Max:"+max);
    }
}