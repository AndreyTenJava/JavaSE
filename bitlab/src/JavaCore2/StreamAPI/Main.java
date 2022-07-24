package JavaCore2.StreamAPI;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 5, 3, -23, 232, 3, 99, -5, -53, 98};

        int positiveNums = 0;

        for (int i : nums) {

            if (i > 0) positiveNums++;

        }

        System.out.println(positiveNums);

        long posNums = IntStream.of(nums).filter(n -> n > 0).count();

        System.out.println(positiveNums);

    }
}
