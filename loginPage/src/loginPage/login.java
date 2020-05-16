//program for login page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class demo extends JFrame implements ActionListener{
                JPanel p1 = new JPanel(new GridLayout(3,1));
		//created a panel
		
		JLabel l1= new JLabel("User Name");
		JTextField t1 = new JTextField(10);	//object of textfield

		JLabel l2= new JLabel("Password");
		JPasswordField p2 = new JPasswordField();	//object of password field
		
		JLabel message;
                //label for the message of successful or unsuccessful login
	
            public void setFrame() {

                JButton b1 = new JButton("SUBMIT");
		JButton b2 = new JButton("CANCEL");
		//object of button
                
                p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(p2);
		//added two labels and textfield to the panel
		
                p1.add(message);
                
                p1.add(b1);
		p1.add(b2);
		//added button to the panel
               
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                b1.addActionListener(this);
                //added listener

                add(p1,BorderLayout.CENTER);
                //set the panel to the center
                
                setTitle("Login page");
                setSize(300,300);   //set the size of the frame
                setVisible(true);
                
        }	
        @Override
        public void actionPerformed(ActionEvent arg0) {
            
            String username = t1.getText();
            String password = p2.getText();
            //get the text from the textfield
            
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(username.trim().equals("Root") && password.trim().equals("1234")){
            //check the condition
            
                message.setText("hello "+username+" Welcome");
                //shaw the message if the condition is true
            }    
            else{
                message.setText("wrong username or password");
            }
        }
}
public class login extends demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                demo d1= new demo();
                //object of class demo
                
                d1.setFrame();
                //calling the method 
        }
}