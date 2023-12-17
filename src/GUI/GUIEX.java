package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIEX implements ActionListener {


  JButton add;
  JButton sub;
  JTextField input1;
  JTextField input2;
  JTextField result;

    GUIEX(){
        JFrame frame= new JFrame();



         input1=new JTextField();
         input2=new JTextField();
         result=new JTextField();

        add= new JButton("Add");
         sub= new JButton("Subtract");

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);


        input1.setBounds(50,50,100,50);
        input2.setBounds(200,50,100,50);
        result.setBounds(120,150, 100,50);

        add.setBounds(50,230,100,60);
        sub.setBounds(200,230,100,60);

        add.addActionListener(this);
        sub.addActionListener(this);


        frame.add(input1);
        frame.add(input2);
        frame.add(result);
        frame.add(add);
        frame.add(sub);

        frame.setVisible(true);


    }






    public void actionPerformed(ActionEvent e){
        int n1= Integer.parseInt(input1.getText()) ;
        int n2= Integer.parseInt(input2.getText()) ;
        if(e.getSource()==add){

            int ans= n1+n2;
            result.setText(String.valueOf(ans));

        }else if(e.getSource()==sub){
            int ans= n1-n2;
            result.setText(String.valueOf(ans));
        }
    }




    public static void main(String[] args) {
        new GUIEX();
    }
}
