import javax.swing.*;

public class Panel extends JFrame{
        Panel(){
            super("Пробное окно");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            JButton button = new JButton("Кнопка1");
            button.setSize(100, 50);
            button.setLocation(40,20);
            panel.add(button);
            button = new JButton("Кнопка2");
            button.setSize(120, 40);
            button.setLocation(150,50);
            panel.add(button);
            setContentPane(panel);
            setSize(250, 150);
        }

    private void setContentPane(JPanel panel) {
    }

}


