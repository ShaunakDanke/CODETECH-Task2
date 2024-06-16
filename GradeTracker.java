import javax.swing.*;
import java.awt.event.*;

class stdGrades extends JFrame implements ActionListener
{
    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    JButton b1,b2;
    public stdGrades()
    {
        setTitle("Grade Tracker");
        setLayout(null);
        setVisible(true);

        lb1=new JLabel("Subject 1:");
        lb2=new JLabel("Subject 2:");
        lb3=new JLabel("Subject 3:");
        lb4=new JLabel("Subject 4:");
        lb5=new JLabel("Subject 5:");
        lb6=new JLabel("Average Grade:");
        lb7=new JLabel("letter Grade:");
        lb8=new JLabel("GPA:");

        tf1=new JTextField("");
        tf2=new JTextField("");
        tf3=new JTextField("");
        tf4=new JTextField("");
        tf5=new JTextField("");
        tf6=new JTextField("");
        tf7=new JTextField("");
        tf8=new JTextField("");

        b1=new JButton("Calculate");
        b2=new JButton("Clear");
        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb6);
        add(lb7);
        add(lb8);

        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        add(tf7);
        add(tf8);

        add(b1);
        add(b2);
        setSize(1920, 1080);

        lb1.setBounds(100, 100, 100, 50);
        tf1.setBounds(250, 100, 100, 50);

        lb2.setBounds(100, 200, 100, 50);
        tf2.setBounds(250, 200, 100, 50);

        lb3.setBounds(100, 300, 100, 50);
        tf3.setBounds(250, 300, 100, 50);

        lb4.setBounds(100, 400, 100, 50);
        tf4.setBounds(250, 400, 100, 50);

        lb5.setBounds(100, 500, 100, 50);
        tf5.setBounds(250, 500, 100, 50);

        lb6.setBounds(400, 200, 100, 50);
        tf6.setBounds(550, 200, 100, 50);

        lb7.setBounds(400, 300, 100, 50);
        tf7.setBounds(550, 300, 100, 50);

        lb8.setBounds(400, 400, 100, 50);
        tf8.setBounds(550, 400, 100, 50);

        b1.setBounds(100, 600, 100, 60);
        b2.setBounds(250, 600,100 , 60);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==b1)
        {
        double a=Double.parseDouble(tf1.getText());
        double b=Double.parseDouble(tf2.getText());
        double c=Double.parseDouble(tf3.getText());
        double d=Double.parseDouble(tf4.getText());
        double e=Double.parseDouble(tf5.getText());
        double avggrade=(a+b+c+d+e)/5;
        tf6.setText(String.valueOf(avggrade));
        String letterGrade;
        
        if(avggrade>=9)
        {
            letterGrade="A";
        }
        else if(avggrade>=8)
        {
            letterGrade="B";
        }
        else if(avggrade>=7)
        {
            letterGrade="C";
        }
        else if(avggrade>=6)
        {
            letterGrade="D";
        }
        else if(avggrade>=5)
        {
            letterGrade="E";
        }
        else
        {
            letterGrade="F";
        }
        tf7.setText(String.valueOf(letterGrade));

        Double gpa;
        if (avggrade>=9)
        {
            gpa=4.0;
        }
        else if(avggrade>=8)
        {
            gpa=3.0;
        }
        else if(avggrade>=7)
        {
            gpa=2.0;
        }
        else if(avggrade>=6)
        {
            gpa=1.0;
        }
        else
        {
            gpa=0.0;
        }
        tf8.setText(String.valueOf(gpa));
    }
    if (ae.getSource()==b2)
    {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        tf7.setText("");
        tf8.setText("");
    }
}   
}
class GradeTracker
{
 public static void main(String [] args)
 {
    new stdGrades();
 }   
}
