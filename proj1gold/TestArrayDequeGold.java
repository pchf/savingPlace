import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDequeGold {
    /**
     * Random test compare StudentArrayDeque
     * against ArrayDequeSolution
     */
    @Test
    public void randomArrayDequeTest () {
        StudentArrayDeque<Integer> sad = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> ads = new ArrayDequeSolution<>();
        String message = "\n";

        while (true) {
            int rand = StdRandom.uniform(10000);
            if (rand < 2500) {
                sad.addFirst(rand);
                ads.addFirst(rand);
                message = message + "addFirst(" + rand + ")\n";
            } else if (rand < 5000){
                sad.addLast(rand);
                ads.addLast(rand);
                message = message + "addLast(" + rand + ")\n";
            } else if ((rand < 7500) && (!sad.isEmpty())) {
                Integer actual = sad.removeFirst();
                Integer expected = ads.removeFirst();
                message = message + "removeFirst()\n";
                assertEquals(message, expected, actual);
            } else if (!sad.isEmpty()){
                Integer actual = sad.removeLast();
                Integer expected = ads.removeLast();
                message = message + "removeLast()\n";
                assertEquals(message, expected, actual);
            }
        }
    }
}

