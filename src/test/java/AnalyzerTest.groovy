import spock.lang.Specification

class AnalyzerTest extends Specification {
    def "AnalyzeTest"() {
        setup:
        def analyzer = new Analyzer([6, 9, 15, -2, 92, 11])
        expect:
        analyzer.analyze() == expectOutput(-2)
    }

    def "MinimumValueTest"() {
        setup:
        def analyzer = new Analyzer([6, 9, 15, -3, 92, 11])
        expect:
        analyzer.analyze() == expectOutput(-3)
    }

    def "MaxValueTest"() {
        setup:
        def analyzer = new Analyzer([6, 9, 15, -2, 93, 11])
        expect:
        analyzer.analyze() == maxValueExpectOutput(93)
    }

    def expectOutput(int minValue) {
        return "o) minimum value = " + minValue + "\n" +
                "o) maximum value = 92\n" +
                "o) number of elements in the sequence = 6\n" +
                "o) average value = 21.833333"
    }

    def maxValueExpectOutput(int maxValue) {
        return "o) minimum value = -2\n" +
                "o) maximum value = " + maxValue + "\n" +
                "o) number of elements in the sequence = 6\n" +
                "o) average value = 21.833333"
    }

}
