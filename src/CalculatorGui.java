import javax.swing.*;

public class CalculatorGui {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGui();
            }
        });
    }
}
