package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.models.Model;


public class SampleController {
    Model model;
    @FXML private Button nu1, nu2, nu3, nu4, nu5, nu6, nu7, nu8, nu9, nu0, zPlus, zMinus, zEqual, zC;
    @FXML private Label textLab;

    public SampleController(){
        this.model = new Model(this);
    }

    public void operationButtonAction(Button button) {
        if (!textLab.toString().isEmpty()) {
            model.pushToNumbers();
            textLab.setText("");
            model.pushToOperations(button);
        }
    }

    public void equalButtonAction() {
        if (!textLab.toString().isEmpty()) {
            model.pushToNumbers();
            textLab.setText("" + equal());
        }
    }

    public void refrashButtonAction() {
        textLab.setText("");
        while (!model.getStackNum().isEmpty() && !model.getStackOperations().isEmpty()){
            model.getStackNum().pop();
            model.getStackOperations().pop();
        }
    }

    public int equal() {
        while (!model.getStackOperations().isEmpty()) {
            switch (model.getStackOperations().pop()) {
                case "+":
                    model.getStackNum().push(model.getStackNum().pop() + model.getStackNum().pop());
                    break;
                case "-":
                    int a = model.getStackNum().pop();
                    int b = model.getStackNum().pop();
                    model.getStackNum().push(b - a);
                    break;
            }
        }
        return model.getStackNum().pop();
    }


    public Label getTextLab() {
        return textLab;
    }

    @FXML
    public void onActionnu01() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu1.getText());
        textLab.setText(stringBuilder.toString());
    }
    public void onActionnu02() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu2.getText());
        textLab.setText(stringBuilder.toString());
    }

    public void onActionnu03() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu3.getText());
        textLab.setText(stringBuilder.toString());
    }

    public void onActionnu04() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu4.getText());
        textLab.setText(stringBuilder.toString());
    }
    public void onActionnu05() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu5.getText());
        textLab.setText(stringBuilder.toString());
    }
    public void onActionnu06() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu6.getText());
        textLab.setText(stringBuilder.toString());
    }
    public void onActionnu07() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu7.getText());
        textLab.setText(stringBuilder.toString());
    }
    public void onActionnu08() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu8.getText());
        textLab.setText(stringBuilder.toString());
    }
    public void onActionnu09() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu9.getText());
        textLab.setText(stringBuilder.toString());
    }
    public void onActionnu0() {
        StringBuilder stringBuilder = new StringBuilder(textLab.getText());
        stringBuilder.append(nu0.getText());
        textLab.setText(stringBuilder.toString());
    }

    public void onActionzPlus() {
        operationButtonAction(zPlus);
    }

    public void onActionzMinus() {
        operationButtonAction(zMinus);
    }

    public void onActionzEqual() {
        equalButtonAction();
    }

    public void onActionzClear() {
        refrashButtonAction();
    }
}
