import java.util.Arrays;
import java.util.stream.IntStream;

public class Tribonacci {
    public static void main(String[] args) {
        int[] result = Tribonacci.tribonacci(new int[]{1, 1, 2}, 10);
        System.out.println(Arrays.toString(result));
    }

    public static int[] tribonacci(int[] initialSequence, int newSequenceCount) {
        int sequenceLength = initialSequence.length;
        int[] newSequence = Arrays.copyOf(initialSequence, newSequenceCount);

        for (int index = sequenceLength; index < newSequenceCount; index++) {
            newSequence[index]  = IntStream
                .of(newSequence)
                .skip(index - sequenceLength)
                .sum();
        }

        return newSequence;
    }
}