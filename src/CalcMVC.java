// Este es e main de la calculadora
public class CalcMVC {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            CalcModel model = new CalcModel();
            CalcView view = new CalcView();
            new CalcController(model, view);
            view.setVisible(true);
        });
    }
}
