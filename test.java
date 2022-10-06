import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test {

    public static List<Integer> getResult(List<Integer> arrival, List<Integer> street) {
        List<Integer> result = new ArrayList<Integer>(arrival.size());

        Queue<int[]> avenue = new LinkedList<int[]>();
        Queue<int[]> mainStreet = new LinkedList<int[]>();

        int currentTime = 0;
        int lastCar = -1;

        // create a queue for both streets
        for (int i = 0; i < arrival.size(); i++) {
            result.add(-1);
            if (street.get(i) == 1) {
                avenue.add(new int[] { arrival.get(i), i });
            } else {
                mainStreet.add(new int[] { arrival.get(i), i });
            }
        }

        while (!avenue.isEmpty() || !mainStreet.isEmpty()) {
            if (lastCar == -1) {
                // I checked both and found no current time so no cars have arrived
                if (!avenue.isEmpty() && avenue.peek()[0] <= currentTime) {
                    int[] car = avenue.remove();
                    result.set(car[1], currentTime);
                    currentTime++;
                    lastCar = 1;
                } else if (!mainStreet.isEmpty() && mainStreet.peek()[0] <= currentTime) {
                    int[] car = mainStreet.remove();
                    result.set(car[1], currentTime);
                    currentTime++;
                    lastCar = 0;
                } else {
                    currentTime++;
                }
                continue;
            }
            if (lastCar == 1) {
                // the last car was 1 and there is another car in 1 ready
                if (!avenue.isEmpty() && avenue.peek()[0] <= currentTime) {
                    int[] car = avenue.remove();
                    result.set(car[1], currentTime);
                    currentTime++;
                    lastCar = 1;
                }
                // there is no car at 1 currently
                else {
                    lastCar = -1;
                }
                continue;
            }
            if (lastCar == 0) {
                if (!mainStreet.isEmpty() && mainStreet.peek()[0] <= currentTime) {
                    int[] car = mainStreet.remove();
                    result.set(car[1], currentTime);
                    currentTime++;
                    lastCar = 0;
                } else {
                    lastCar = -1;
                }
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arrival = new ArrayList<Integer>();
        arrival.add(0);
        arrival.add(0);
        arrival.add(0);
        arrival.add(1);
        arrival.add(1);
        List<Integer> street = new ArrayList<Integer>();
        street.add(0);
        street.add(1);
        street.add(1);
        street.add(0);
        street.add(1);
        System.out.println(getResult(arrival, street));
        return;
    }
}
