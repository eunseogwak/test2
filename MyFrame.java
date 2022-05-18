import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame {
    public MyFrame() {
        setSize(300, 200);
        setTitle("MyFrame");

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        add(button);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public  static  void main(String[] args){
        MyFrame f =new MyFrame();
    }
}
