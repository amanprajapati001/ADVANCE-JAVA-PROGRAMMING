import java.util.Arrays;
import java.util.Optional;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20 ,30, 40, 34, 56, 20, 12, 32);
        Optional<Integer> result = list.stream().distinct().
    }
}
