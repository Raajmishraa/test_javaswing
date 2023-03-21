import javax.swing.*;

public class Test {
    private JPanel panelTest;
    private JTextField textField1;
    private JTextField textField2;
    private JButton clickButton;

    public JPanel getPanelTest() {
        return panelTest;
    }

    public void setPanelTest(JPanel panelTest) {
        this.panelTest = panelTest;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JButton getClickButton() {
        return clickButton;
    }

    public void setClickButton(JButton clickButton) {
        this.clickButton = clickButton;
    }

    public AbstractButton getTxtFirstName() {
        return null;
    }

    public AbstractButton getTxtLastName() {
        return null;
    }
}
