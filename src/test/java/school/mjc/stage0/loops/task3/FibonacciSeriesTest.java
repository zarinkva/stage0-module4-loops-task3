package school.mjc.stage0.loops.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest extends BaseIOTest {

    @Test
    void printFibonacciPrintsFirstThree() {
        FibonacciSeries fibonacci = new FibonacciSeries();

        fibonacci.printFibonacci(3);

        assertOutEquals("0\n1\n1\n");
    }

    @Test
    void printFibonacciPrintsFirstFive() {
        FibonacciSeries fibonacci = new FibonacciSeries();

        fibonacci.printFibonacci(5);

        assertOutEquals("0\n1\n1\n2\n3\n");
    }

    @Test
    public void containsNoRecursion() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/loops/task3/FibonacciSeries.java");
        List<String> strings = Files.readAllLines(path);

        List<String> result = strings.stream()
                .filter(line -> line.contains("printFibonacci"))
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

}