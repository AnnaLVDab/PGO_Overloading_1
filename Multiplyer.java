import java.math.BigDecimal;
import java.util.List;

public class Multiplyer {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c, int d) {
        return multiply(a, b) * multiply(c, d);
    }

    public double multiply(double e, double f) {
        return e * f;
    }

    public BigDecimal multiply(BigDecimal g, BigDecimal h) {
        return g.multiply(h);
    }

    public int multiply(List<Integer> numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}
