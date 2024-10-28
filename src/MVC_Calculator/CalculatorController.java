package MVC_Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addOperationHandler(new OperationHandler());
    }

    class OperationHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double firstOperand = view.getFirstOperand();
                double secondOperand = view.getSecondOperand();
                String output = "";

                if (e.getSource() == view.getSumButton()) {
                    output = String.valueOf(model.sum(firstOperand, secondOperand));
                } else if (e.getSource() == view.getDiffButton()) {
                    output = String.valueOf(model.difference(firstOperand, secondOperand));
                } else if (e.getSource() == view.getProdButton()) {
                    output = String.valueOf(model.product(firstOperand, secondOperand));
                } else if (e.getSource() == view.getQuotButton()) {
                    output = String.valueOf(model.quotient(firstOperand, secondOperand));
                }

                view.displayResult(output);

            } catch (NumberFormatException ex) {
                view.displayResult("|Error: Enter numerical values");
            } catch (ArithmeticException ex) {
                view.displayResult(ex.getMessage());
            }
        }
    }
}



