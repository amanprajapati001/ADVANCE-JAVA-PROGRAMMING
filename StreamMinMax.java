import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,1,4,6,199,29,45,78,65,99);
        List<Integer> sortedList = list.stream().sorted((a,b)->0).toList();
        System.out.println(list);
        System.out.println(sortedList);
        Optional<Integer> result = list.stream().min((a,b) -> 0);
        result.ifPresent(System.out::println);
    }
}
