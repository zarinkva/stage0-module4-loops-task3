package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        AlphabetPrinter printer=new AlphabetPrinter();
        printer.printAlphabet();
    }
}
