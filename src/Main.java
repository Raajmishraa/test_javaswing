import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Model m = new Model(" ", " ");
        Test t = new Test();
        Controller c = new Controller(m,t);

        c.initcontroller();
        JFrame frame = new JFrame("My MVC");
        frame.setContentPane(t.getPanelTest());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
