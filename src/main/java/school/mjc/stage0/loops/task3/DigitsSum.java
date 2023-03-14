package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        String numStr = number+ "";
        for (int i = 0; i < numStr.length(); i++) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        System.out.println(sum);
    }


          public static void main(String[] args) {
              DigitsSum ds = new DigitsSum();
              ds.printDigitsSum(12345);
    }
}
