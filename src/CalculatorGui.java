//b11 = +
//b12 = -
//b13 = *
//b14 = /
//b16 = =

import LogicPack.ButtonLogic;

import javax.swing.*;

public class CalculatorGui extends javax.swing.JFrame{

    private ButtonLogic buttonLogic;

    private JFrame window;

    public CalculatorGui(JFrame window, JButton a1Button, JButton a2Button, JButton a3Button, JButton a4Button, JButton a5Button, JButton a6Button, JButton a7Button, JButton a8Button, JButton a9Button, JButton a0Button, JButton button11, JButton button12, JButton button13, JButton button14, JButton cButton, JButton button16, JButton exitButton) {
        this.a1Button = a1Button;
        this.a2Button = a2Button;
        this.a3Button = a3Button;
        this.a4Button = a4Button;
        this.a5Button = a5Button;
        this.a6Button = a6Button;
        this.a7Button = a7Button;
        this.a8Button = a8Button;
        this.a9Button = a9Button;
        this.a0Button = a0Button;
        this.button11 = button11;
        this.button12 = button12;
        this.button13 = button13;
        this.button14 = button14;
        CButton = cButton;
        this.button16 = button16;
        this.exitButton = exitButton;
        buttonLogic = new ButtonLogic();
    }

    private <T> void setValue(T value){
        jTF.setText(" ");
        if (value.getClass().getName().equals("java.lang.Character")) buttonLogic.setValue((Character) value);
        if (value.getClass().getName().equals("java.lang.Double")) buttonLogic.setValue((Double) value);

        jTF.setText(buttonLogic.getStringRepresentationOfOperation());
    }

    private void a1ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(1.0);
    }

    private void a2ButtonButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(2.0);
    }

    private void a3ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(3.0);
    }

    private void a4ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(4.0);
    }

    private void a5ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(5.0);
    }

    private void a6ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(6.0);
    }

    private void a7ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(7.0);
    }

    private void a8ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(8.0);
    }

    private void a9ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(9.0);
    }

    private void a0ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setValue(0.0);
    }

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {
        setValue('+');
    }

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {
        setValue('-');
    }

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {
        setValue('*');
    }

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {
        setValue('/');
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jTF.setText(" ");
        buttonLogic = new ButtonLogic();
    }

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            jTF.setText(buttonLogic.getResult());
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        buttonLogic = new ButtonLogic();
    }

    private JTextField jTF;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton CButton;
    private JButton button16;
    private JButton exitButton;

}
