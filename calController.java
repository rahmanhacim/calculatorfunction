/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 *
 * @author Rahman Hakim
 */
public class calController {
     @FXML

    private Text output;



    private long number1 = 0;
    private String operator = "";
    private boolean start = true;
    private calModelLook model = new calModelLook();

    @FXML

    private void processNumpad(ActionEvent event) {

        if (start) {

            output.setText("");
            start = false;

        }

        String valueNum = ((Button)event.getSource()).getText();

        output.setText(output.getText() + valueNum);

    }

    @FXML

    private void processOperatorAct(ActionEvent event) {

        String valueNum = ((Button)event.getSource()).getText();
        if (!"=".equals(valueNum)) {

            if (!operator.isEmpty())

                return;
                operator = valueNum;
                number1 = Long.parseLong(output.getText());
                output.setText("");

        }

        else {

            if (operator.isEmpty())

                return;

                output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator)));
                operator = "";
                start = true;

        }

    }
    
}
