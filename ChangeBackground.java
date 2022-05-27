import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackground extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPane1 pane1;
    MyListner listner = new MyListener();
    public  ChangeBackground() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제")
        pane1 = new JPane1();
        button1 = new JButton("노란색");
        button1.addActionListener(listner);
        pane1.add(button1);
        button2 = new JButton("핑크색");
        button2.addActionListener(listner);
        pane1.add(button2);
        this.add(pane1);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class MyListener implements ActionListener {
        public void actionperformed(ActionEvent e){
            if (e.getSource()==button1){
                pane1.setBackground(Color.YELLOW);
            } else if (e.getSource()==button2) {
                pane1.setBackground(Color.PINK);

            }
        }
    }
    public static void main(String[] args){
        ChangeBackground t = new ChangeBackground();
    }
}
