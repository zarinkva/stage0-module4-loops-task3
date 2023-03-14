package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
int sum=0;
int i;
int term=9;
for (i=1;i<=lengthOfLastNumber;i++){
    sum += term;
    term = term * 10 + 9;
    }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        NinesSum ns=new NinesSum();
        ns.calculateSum(3);
    }
}
