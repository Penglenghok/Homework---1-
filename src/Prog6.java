import java.util.Arrays;

public class Prog6 {

    public static void main(String[] args) {

        int[] inputs = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(inputs);
    }

    public static void secondMin(int[] arrayOfInts){
        int min = arrayOfInts[0];
        int max = arrayOfInts[0];
        for(int i=1;i<arrayOfInts.length;i++)
        {
            if(min>arrayOfInts[i]) min = arrayOfInts[i];
            if(max<arrayOfInts[i]) max=arrayOfInts[i];
        }
        int min2 = max;
        for(int i=0;i<arrayOfInts.length;i++)
        {
            if(arrayOfInts[i]>min && min2>arrayOfInts[i]) min2=arrayOfInts[i];
        }
        System.out.println(min2);

    }
}
