import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by agnel on 6/4/18.
 */
public class First extends Frame implements ActionListener {

    TextField tf;
    First(){
        tf=new TextField();
        tf.setBounds(60,50,170,20);

    Button b = new Button("OK");

   b.addActionListener(this);
    Button b2 = new Button("Close");


    b.setBounds(30,100,80,30);
    b2.setBounds(30,200,80,30);

    add(tf);
    add(b);
    add(b2);
    setSize(400,400);
    setLayout(null);
    setVisible(true);

    }

    public static void main(String[] args) {
        new First();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        tf.setText("Welcome to Java Abstract Windows ToolKit..");
    }
}
