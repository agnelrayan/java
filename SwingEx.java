import mypack2.DBClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import static javax.swing.JOptionPane.*;

/**
 * Created by agnel on 6/1/18.
 */
public class SwingEx extends Component {
    static JTextField jt;
    static JLabel jl;
    static JLabel jl2;
    static JTextField jt2;
   // static JButton jb2;
    public void saveItems(){
        JFrame jf = new JFrame("Button Example");
        jt = new JTextField();
        jl = new JLabel("Id:");
        jl2 = new JLabel("Name:");
        jt2 = new JTextField();

        jl.setBounds(25,50,150,20);
        jt.setBounds(50, 50, 150, 20);
        jl2.setBounds(25,100,150,20);
        jt2.setBounds(70, 100, 150, 20);

        JButton jb = new JButton("Save");
        JButton jb2=new JButton("Clear");
        jb.setBounds(50, 250, 95, 30);
        jb2.setBounds(50,300,95,30);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jt.getText();
                String name = jt2.getText();
                String query = "INSERT INTO test.emp2(id,name) VALUES('"+id+"','"+name+"')";
                try {
                    Statement st;
                    Connection con = DBClass.getConnection();
                    st=con.createStatement();
                    st.executeUpdate(query);
                    System.out.println(query);
                    //showMessageDialog("Saved");
                    JOptionPane.showMessageDialog(jt,"saved");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
                jt2.setText("");
            }
        });

        jf.add(jl);
        jf.add(jl2);
        jf.add(jb);
        jf.add(jb2);
        jf.add(jt);
        jf.add(jt2);
        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingEx s = new SwingEx();
        s.saveItems();
    }


}

   /* public void buttonSave(ActionEvent evt){

            String itemCode = tf.getText();
        //    String itemName = txtItemName.getText();
         //   String unitPrice = txtUnitPrice.getText();
         //   String qty = txtQty.getText();
            //String query = "insert into items values ('"+id+"','"+itemName+"','"+unitPrice+"','"+qty+"')";
         //   System.out.println(query);


        String query = "insert into emp values(id)";
            try {
                Statement stmt;
                try (Connection c = DBClass.getConnection()) {
                    stmt = c.createStatement();
                }
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Saved");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}*/
