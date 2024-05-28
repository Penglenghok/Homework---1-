import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String[] input = {"horse", "dog", "cat", "horse", "dog"};
        String[] output = new String[input.length];
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            String cur = input[i];
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (output[j].equals(cur)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                output[count] = cur;
                count++;
            }
        }

        String[] resultArray = Arrays.copyOf(output, count);
        System.out.println("Unique elements: " + String.join(", ", resultArray));
    }
}
