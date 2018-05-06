package sample.models;

import javafx.scene.control.Button;
import sample.controllers.SampleController;

import java.util.Stack;

public class Model {
    private SampleController controler;
    private Stack<Integer> stackNum;
    private Stack <String> stackOperations;

    public Model (SampleController controler){
        this.controler = controler;
        stackNum = new Stack<Integer>();
        stackOperations = new Stack<String>();
    }

    public void pushToNumbers (){
        stackNum.push(Integer.parseInt(controler.getTextLab().getText()));
    }
    public void pushToOperations (Button button){
        stackOperations.push(button.getText());
    }

    public Stack<String> getStackOperations() {
        return stackOperations;
    }
    public Stack<Integer> getStackNum() {
        return stackNum;
    }
}
