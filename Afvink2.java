import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Afvink2 extends JFrame implements ActionListener {

    private JTextField textField1, textField2;
    private JButton button1;
    private JLabel label1, label2;
    private JPanel panel;


    public static void main(String[] args) {
        Afvink2 frame = new Afvink2();
        frame.setSize(800, 800);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.setBackground(Color.LIGHT_GRAY);

        // maken en plaatsen van het panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 700));
        window.add(panel);

        //toevoegen van labels
        label1 = new JLabel("x");
        label2 = new JLabel("y");

        // plaatsen van textfields
        textField1 = new JTextField("0");
        textField2 = new JTextField("0");

        //aanpassen van de groote van de textfields
        textField1.setPreferredSize((new Dimension(60, 20)));
        textField2.setPreferredSize((new Dimension(60, 20)));

        //maken van de button
        button1 = new JButton("apply");

        //het plaatsen van alles in de window
        window.add(label1);
        window.add(textField1);
        window.add(label2);
        window.add(textField2);
        window.add(button1);

        //er gebeurt wat als je op de knop drukt
        button1.addActionListener(this);


    }


    @Override
    //dit gebeurt er allemaal als je op de knop drukt
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(textField1.getText());
        int y = Integer.parseInt(textField2.getText());
        int radius1 = 20;
        int radius2 = 40;
        Graphics paper = panel.getGraphics();
        paper.clearRect(0, 0 , 700, 700);
        paper.drawLine(x+radius2/2, y+radius2/2, x+60+radius1/2, y+40+radius1/2);
        paper.drawLine(x+radius2/2, y+radius2/2, x-20+radius1/2, y-40+radius1/2);
        paper.setColor(Color.RED);
        paper.fillOval( x, y, radius2, radius2);
        paper.setColor(Color.BLUE);
        paper.fillOval(x+60, y+40, radius1, radius1) ;
        paper.fillOval(x-20, y-40, radius1, radius1);

        paper.setColor(Color.CYAN);


    }
}

