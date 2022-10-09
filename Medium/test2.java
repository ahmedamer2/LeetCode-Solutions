package Medium;
import java.util.ArrayList;
import java.util.List;

public class test2 {
    public List<boolean> findPrimes(int n){
        return null;
    }


    public static List<Integer> lightBulbs(List<Integer> states, List<Integer> numbers) {
        ArrayList<Boolean> primes = findPrimes(states.size());


        return primes;
    }
    
    public static List<String> splitWords(String s) {
            return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
        }
    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> states = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> numbers = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
            scanner.close();
            List<Integer> res = lightBulbs(states, numbers);
            System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }

}
