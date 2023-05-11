public class Main {
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new CalculatorGui(a1Button, a2Button, a3Button, a4Button, a5Button, a6Button, a7Button, a8Button, a9Button, a0Button, button11, button12, button13, button14, cButton, button16, exitButton).setVisible(true);
                }
            });
        }
}
