import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Vista: Este apartado es el que nos permite ver la calculadora cuando ejecutamos el programa
public class CalcView extends JFrame {
    private final JTextField firstField = new JTextField();
    private final JTextField secondField = new JTextField();
    private final JTextField resultField = new JTextField();
    private final JButton addButton = new JButton("Suma (+)");
    private final JButton subtractButton = new JButton("Resta (-)");
    private final JButton multiplyButton = new JButton("Multiplicacion (*)");
    private final JButton resultButton = new JButton("Resultado");
    private final JButton clearButton = new JButton("Limpiar");
    private String selectedOperation;

    public CalcView() {
        super("Calculadora - Modelo Vista Controlador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(430, 280);
        setLocationRelativeTo(null);

        resultField.setEditable(false);
        JPanel fields = new JPanel(new GridLayout(3, 2, 8, 8));
        fields.setBorder(BorderFactory.createEmptyBorder(15, 15, 10, 15));
        fields.add(new JLabel("Primer numero:"));
        fields.add(firstField);
        fields.add(new JLabel("Segundo numero:"));
        fields.add(secondField);
        fields.add(new JLabel("Resultado:"));
        fields.add(resultField);

        JPanel operations = new JPanel(new GridLayout(2, 3, 8, 8));
        operations.setBorder(BorderFactory.createEmptyBorder(5, 15, 15, 15));
        operations.add(addButton);
        operations.add(subtractButton);
        operations.add(multiplyButton);
        operations.add(resultButton);
        operations.add(clearButton);

        add(fields, BorderLayout.CENTER);
        add(operations, BorderLayout.SOUTH);
    }

    public String getFirstNumber() { return firstField.getText(); }
    public String getSecondNumber() { return secondField.getText(); }
    public String getSelectedOperation() { return selectedOperation; }
    public void setSelectedOperation(String operation) { selectedOperation = operation; }
    public void setResult(String result) { resultField.setText(result); }
    public void showError(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message, "Entrada no valida",
                javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    public void clearFields() {
        firstField.setText("");
        secondField.setText("");
        resultField.setText("");
        selectedOperation = null;
        firstField.requestFocus();
    }

    public JButton getAddButton() { return addButton; }
    public JButton getSubtractButton() { return subtractButton; }
    public JButton getMultiplyButton() { return multiplyButton; }
    public JButton getResultButton() { return resultButton; }
    public JButton getClearButton() { return clearButton; }
}
