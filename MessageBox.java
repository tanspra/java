import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
public class MessageBox {
JFrame frame;
public static void main(String[] args) {
MessageBox db = new MessageBox();
}
public MessageBox() {
frame = new JFrame("Show Message Box");
JButton button = new JButton("Click");
button.setAlignmentX((float) 100.00);
button.addActionListener(new MyAction());
frame.add(button);
frame.setSize(300, 300);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public class MyAction implements ActionListener {
public void actionPerformed(ActionEvent e) {

    Object[] options = {"Yes", "No", "Ask later"};
    
    int n = JOptionPane.showOptionDialog(frame,"Would you like to save it",null, 
    JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[2]);

JOptionPane.showMessageDialog(frame, "Message Box");
}
}
}