import mypack2.DBClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by agnel on 6/4/18.
 */
public class FirstSwing {
    JFrame jf = new JFrame("MyFrame");
    FirstSwing(){
        JButton jb = new JButton("ok");
        JLabel jl1 = new JLabel("Id");
        JLabel jl2 = new JLabel("Name");
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();

        jl1.setBounds(100,50,100,30);
        tf1.setBounds(200,50,100,30);
        jl2.setBounds(100,75,100,30);
        tf2.setBounds(200,75,100,30);
        jb.setBounds(130,200,100,40);

        jf.add(jl1);
        jf.add(jl2);
        jf.add(tf1);
        jf.add(tf2);
        jf.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id=tf1.getText();
                String name=tf2.getText();
                String query="insert into emp2 values('"+id+"','"+name+"')";
            try{
                Statement st;
                Connection con= DBClass.getConnection();
                st=con.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(tf1,"Saved");

            }
            catch(Exception ee){
                System.out.println(ee);

            }
            }
        });
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new FirstSwing();

    }
}
