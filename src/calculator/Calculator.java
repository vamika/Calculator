/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Vamika Razdan
 */import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.text.*;
import java.awt.event.*;
public class Calculator {
static double total1;
static double total2;
static double plusminus;
static double result;
static double result1;
static float answer;
static String operation;
static int flag;

    public static void main(String[] args) {
JFrame frame=new JFrame("Calculator-Project");
 frame.setSize(405,400);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setLayout(null);
frame.setResizable(false);


 JTextField no=new JTextField(null,30);
no.setBorder(BorderFactory.createEmptyBorder());
no.setHorizontalAlignment(SwingConstants.RIGHT);
Font font = new Font("Times new Roman", Font.BOLD, 22);
no.setFont(font);
no.setSize(400,25);
no.setLocation(0,25);
frame.add(no);

 JTextField now=new JTextField(null,30);
now.setHorizontalAlignment(SwingConstants.RIGHT);
now.setBorder(BorderFactory.createEmptyBorder());
now.setEditable(false);
now.setFont(font);
now.setBackground(Color.WHITE);
now.setSize(400,25);
now.setLocation(0,0);
frame.add(now);

JButton clear= new JButton("Clear");
clear.setSize(200,50);
clear.setLocation(0,50);
frame.add(clear);

JButton backspace= new JButton("Backspace");
backspace.setSize(200,50);
backspace.setLocation(200,50);
frame.add(backspace);

JButton addition= new JButton("+");
addition.setSize(200,50);
addition.setLocation(200,100);
frame.add(addition);

JButton sub= new JButton("-");
sub.setSize(200,50);
sub.setLocation(200,150);
frame.add(sub);
frame.setVisible(true);

JButton multi= new JButton("*");
multi.setSize(200,50);
multi.setLocation(200,200);
frame.add(multi);
frame.setVisible(true);

JButton div= new JButton("/");
div.setSize(200,50);
div.setLocation(200,250);
frame.add(div);

JButton equal= new JButton("=");
equal.setSize(120,72);
equal.setLocation(280,300);
frame.add(equal);

JButton one= new JButton("1");
one.setSize(100,50);
one.setLocation(0,100);
frame.add(one);

JButton two= new JButton("2");
two.setSize(100,50);
two.setLocation(100,100);
frame.add(two);

JButton three= new JButton("3");
three.setSize(100,50);
three.setLocation(0,150);
frame.add(three);

JButton four= new JButton("4");
four.setSize(100,50);
four.setLocation(100,150);
frame.add(four);

JButton five= new JButton("5");
five.setSize(100,50);
five.setLocation(0,200);
frame.add(five);

JButton six= new JButton("6");
six.setSize(100,50);
six.setLocation(100,200);
frame.add(six);

JButton seven= new JButton("7");
seven.setSize(100,50);             
seven.setLocation(0,250);
frame.add(seven);
                                              
JButton eight= new JButton("8");
eight.setSize(100,50);
eight.setLocation(100,250);
frame.add(eight);

JButton nine= new JButton("9");
nine.setSize(66,72);
nine.setLocation(0,300);
frame.add(nine);

JButton dot=new JButton(".");
dot.setSize(66,72);
dot.setLocation(66,300);
frame.add(dot);

JButton zero= new JButton("0");
zero.setSize(68,72);
zero.setLocation(132,300);
frame.add(zero);

JButton posneg= new JButton("+/-");
posneg.setSize(80,72);
posneg.setLocation(200,300);
frame.add(posneg);


clear.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
{
no.setText("");
now.setText("");

}
}
});




backspace.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String str=no.getText();
             int p = str.length();
             if(p-1!=0)
                { no.setText(no.getText().substring(0,p-1));
                 
}
             else
               {  no.setText("");
}
 }
});

one.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"1");

 }
});



two.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"2");

 }
});




three.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"3");

 }
});



four.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"4");

 }
});



five.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"5");

 }
});


six.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"6");

 }
});


seven.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"7");
 }
});


 
eight.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"8");

 }
});




nine.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"9");

 }
});



zero.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+"0");

 }
});



dot.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
no.setText(no.getText()+".");
 }
});


addition.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
total1=Double.parseDouble(no.getText( ));
now.setText(no.getText( )+"+");

//total1=Double.parseDouble(no.getText( ))+result;
//now.setText(result+" "+no.getText( ));
//result=  Double.parseDouble( no.getText( ) ) ;
no.setText("");
operation = "+";

 }
});



sub.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
total1=Double.parseDouble(no.getText( ));
now.setText(no.getText( )+"-");
//total1=result-Double.parseDouble(no.getText( ));

//now.setText(result+" "+no.getText( ));
//result=  Double.parseDouble( no.getText( ) ) ;
no.setText("");

operation = "-";

 }
});



multi.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
total1=Double.parseDouble(no.getText( ));
now.setText(no.getText( )+"*");
//total1=Double.parseDouble(no.getText( ))*(result=1);

//now.setText(result+"*");
//result=  Double.parseDouble( no.getText( ) ) ;
no.setText(" ");

operation = "*";

 }
});


div.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
total1=Double.parseDouble(no.getText( ));
now.setText(no.getText( )+"/");
//total1 = Double.parseDouble( no.getText( ) )+(result) ;
//now.setText(result+" "+no.getText( ));
//result=  Double.parseDouble( no.getText( ) ) ;
no.setText("");
operation = "/";

 }
});



posneg.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
plusminus=Double.parseDouble(String.valueOf( no.getText( )) ) ;
plusminus=plusminus*(-1);
no.setText(String.valueOf(plusminus));
 }
});

equal.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String answer;
total2=Double.parseDouble( no.getText( ) ) ;
now.setText(now.getText( )+no.getText( ));

switch ( operation ) {
case "+":
result = total1 + total2 ;
answer=String.format("%f",result);
no.setText(answer);
break;
case "-":
result = total1 - total2;
answer=String.format("%f",result);
no.setText(answer);

break;
case "/":
result = (total1 / total2);
answer=String.format("%f",result);
no.setText( answer);

break;
case "*":
result = total1 * total2 ;
answer=String.format("%f",result);
no.setText(answer);
break;
}

}
});


           

frame.setVisible(true);



        // TODO code application logic here
    }
}




    

