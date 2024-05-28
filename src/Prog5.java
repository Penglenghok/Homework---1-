import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {

        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};
        System.out.println(Arrays.toString(combine(a,b)));
    }
    public static int[] combine(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
         System.arraycopy(a,0,result,0,a.length);
         System.arraycopy(b,0,result ,a.length, b.length);
        return result;
    }

}
