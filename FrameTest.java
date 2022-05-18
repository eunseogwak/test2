import javax.swing.*;  // (1)

public class FrameTest {
    public static void main(String[] args) {

        JFrame f = new JFrame("Frame"); // (2)
        f.setTitle("myFrame");  //(3)
        f.setSize(300,200);  //(4)
        f.setVisible(true);   //(5)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //(6)
    }
}
