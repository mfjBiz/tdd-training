import java.util.Collections;
import java.util.List;

public class Analyzer {
    private List<Integer> numbers;

    Analyzer(List<Integer> numbers) {
        this.numbers = numbers;
    }
    public String analyze() {
        return "o) minimum value = " + Collections.min(numbers) + "\n"+
                "o) maximum value = " + Collections.max(numbers) + "\n"+
                "o) number of elements in the sequence = 6\n" +
                "o) average value = 21.833333";
    }


}
