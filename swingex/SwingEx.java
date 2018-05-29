package com.expertzlab.swingex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by agnel on 5/29/18.
 */
public class SwingEx {
    public static void main(String[] args) {
        JFrame window = new JFrame();

        window.setTitle("ExpertZLab");
        final JTextField txt = new JTextField();
        txt.setBounds(50,50, 150,20);
       // txt.setSize(15,25);
        JButton button =  new JButton("Click Me");
        button.setBounds(130,100,100,40);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt.setText("Welcome to Cochin");
            }
        });
        //button.setBounds(130,100,100, 40)
      /*  button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText("Welcome to ExpertZLab...");
            }
        });*/
        window.add(txt);
        window.add(button);
        window.setSize(400,500);
        window.setLayout(null);
        window.setVisible(true);

    }
}
