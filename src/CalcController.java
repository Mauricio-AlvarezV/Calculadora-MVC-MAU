/** Controlador: conecta los eventos de la vista con el modelo. */
public class CalcController {
    private final CalcModel model;
    private final CalcView view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
        view.getAddButton().addActionListener(e -> selectOperation("+"));
        view.getSubtractButton().addActionListener(e -> selectOperation("-"));
        view.getMultiplyButton().addActionListener(e -> selectOperation("*"));
        view.getResultButton().addActionListener(e -> calculate());
        view.getClearButton().addActionListener(e -> view.clearFields());
    }

    private void selectOperation(String operation) {
        view.setSelectedOperation(operation);
    }

    private void calculate() {
        if (view.getSelectedOperation() == null) {
            view.showError("Selecciona suma, resta o multiplicacion antes de calcular.");
            return;
        }
        try {
            String result = model.format(model.calculate(
                    view.getFirstNumber(), view.getSecondNumber(), view.getSelectedOperation()));
            view.setResult(result);
        } catch (NumberFormatException ex) {
            view.showError("Ingresa dos numeros validos. Puedes usar decimales.");
        } catch (IllegalArgumentException ex) {
            view.showError(ex.getMessage());
        }
    }
}
