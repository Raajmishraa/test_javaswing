import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private Test test;


    private Controller(Model m, Test T)
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
}
