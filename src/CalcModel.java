import java.math.BigDecimal;

//Model tiene la lógica matemática es el que realiza las operaciones matemáticas
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
