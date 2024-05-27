public class Prog2 {

    public static void main(String[] args) {
        float f1 = 1.27f, f2=3.881f, f3=9.6f;
        int sum = (int)f1 + (int)f2 + (int)f3;
        int sumWithRound = Math.round(f1) + Math.round(f2) + Math.round(f3);
        System.out.println("Sum of float without round is "+sum);
        System.out.println("Sum of float with round is "+sumWithRound);
    }

}
