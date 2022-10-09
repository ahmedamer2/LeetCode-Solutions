
import java.util.ArrayList;
import java.util.List;

public class test2 {
    public List<boolean> findPrimes(int n){
        List<Boolean> primes = new ArrayList<Boolean>(n+1);
        for(int i = 0; i < primes.size(); i++){
            primes.set(i, true);
        }

        for(int j = 2; j*j <= Math.sqrt(n); j++){
            if(primes.get(j) == true){
                for(int k = j *j; k <= Math.sqrt(n); k += j){
                    primes.set(k, false);
                }
            }
        }
        System.out.print();
        return primes;
    }


    public static List<Integer> lightBulbs(List<Integer> states, List<Integer> numbers) {
        ArrayList<Boolean> primes = findPrimes(states.size());

        return ;
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
