import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private Test test;


    Controller(Model m, Test t)
    {
        model = m;
        test = t;
    }

    public void initcontroller()
    {
        test.getClickButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                saveName();
            }
        });
    }
    private void saveName()
    {
        model.setFirstName(test.getTxtFirstName().getText());
        model.setLastName(test.getTxtLastName().getText());
        JOptionPane.showMessageDialog( null,
                "First Name : " +model.getFirstName() +
                "and Last Name :" +model.getLastName() +
                "are saved",
                "info",JOptionPane.INFORMATION_MESSAGE);
    }
}
