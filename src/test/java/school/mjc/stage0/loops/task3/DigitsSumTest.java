package school.mjc.stage0.loops.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsSumTest extends BaseIOTest {

    @Test
    void printDigitsSumPrintsSumWhenZeroes() {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(243580001);
        assertOutEquals("23\n");
    }

    @Test
    void printDigitsSumPrintsSumWhenNoZeroes() {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(243581);
        assertOutEquals("23\n");
    }

    @Test
    void printDigitsSumPrintsSumWhenNoZeroesAndNegative() {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(-24358);
        assertOutEquals("21\n");
    }

    @Test
    public void containsNoIndexesOrSteams() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/loops/task3/DigitsSum.java");
        List<String> strings = Files.readAllLines(path);

        List<String> result = strings.stream()
                .filter(line -> line.contains("index") || line.contains("]") || line.contains("->"))
                .collect(Collectors.toList());

        assertEquals(1, result.size());
    }
}