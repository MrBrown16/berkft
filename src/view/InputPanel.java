/*
 * File: InputPanel.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.05.23
 * Github: https://github.com/MrBrown16/berkft.git
 * Licence: GNU GPL
 */


package view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel {
    JLabel label;
    JTextField field;
    public InputPanel() {        
        this.initComponent();
        this.setPanel();
    }
    public InputPanel(String text) {             
        this.initComponent();
        this.label.setText(text);   
        this.setPanel();
    }
    private void initComponent() {
        this.label = new JLabel();
        this.field = new JTextField();
    }
    private void setPanel() {
        this.add(this.label);
        this.add(this.field);
        this.setLayout(new GridLayout(1, 2));
    }
    public void setLabel(String text) {
        this.label.setText(text);
    }
    public String getLabel() {
        return this.label.getText();
    }
    public void setValue(String text) {
        this.field.setText(text);
    }
    public String getValue() {
        return this.field.getText();
    }
}
