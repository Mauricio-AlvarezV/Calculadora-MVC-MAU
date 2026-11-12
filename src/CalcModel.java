import java.math.BigDecimal;

/** Modelo: contiene los datos y las operaciones matematicas. */
public class CalcModel {
    public BigDecimal calculate(String first, String second, String operation) {
        BigDecimal a = new BigDecimal(first.trim());
        BigDecimal b = new BigDecimal(second.trim());

        switch (operation) {
            case "+": return a.add(b);
            case "-": return a.subtract(b);
            case "*": return a.multiply(b);
            default: throw new IllegalArgumentException("Operacion no valida.");
        }
    }

    public String format(BigDecimal value) {
        return value.stripTrailingZeros().toPlainString();
    }
}
