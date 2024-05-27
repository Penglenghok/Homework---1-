import java.util.Random;

public class Prog1 {

    public static void main(String[] args) {

        Random ran = new Random();
        double x = ran.nextInt(1,9);
        double y = ran.nextInt(3,14);
        double resX = Math.pow(Math.PI,x);
        double resY = Math.pow(y,Math.PI);

        System.out.printf("PI power X is  " + String.valueOf(resX) + "\n");
        System.out.printf("Y power PI is " + String.valueOf(resY));
    }


}