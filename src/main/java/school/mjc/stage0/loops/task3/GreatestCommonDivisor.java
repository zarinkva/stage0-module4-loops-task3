package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        if (gcd == 0) {
            System.out.println("Cannot calculate GCD when one of the numbers is 0.");
        }

        for (int i = 1; i <=first && i <= second; ++i) {
            if (first % i == 0 && second % i == 0)
                gcd = i;
        }
        System.out.println(gcd);
    }


    public static void main(String[] args) {
        GreatestCommonDivisor commonDivisor=new GreatestCommonDivisor();
        commonDivisor.printGCD(15,25);
        commonDivisor.printGCD(0,17);
        commonDivisor.printGCD(-12,-48);
        commonDivisor.printGCD(30,30);
        commonDivisor.printGCD(0,30);
    }
}
