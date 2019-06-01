import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Tic extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;

    JButton b[] = new JButton[10];
    JButton breset;
	JPanel p;	
    JLabel l;
    int arr[] = {100, 101, 102, 103, 104, 105, 106, 107, 108}; 

	Tic(){

		setLayout(null);
		p = new JPanel();		
		p.setBounds(50, 50, 300, 300);
        p.setLayout(new GridLayout(3,3));
        
        b[0] = new JButton("999");
        for (int i=1; i<10; i++){
            b[i] = new JButton("");
            p.add(b[i]);
            b[i].addActionListener(this); 
        }
        this.add(p);

        breset = new JButton("Reset");
        breset.setBounds(150, 400, 100, 30);
        this.add(breset);
        breset.addActionListener(this);
	}

    int count = 2;

	public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();

        for (int i = 0; i < 9; i++){
            if (ae.getSource() == breset){
                for (int iter=0; iter<9; iter++){
                    arr[iter] = 100+iter;
                    b[iter+1].setText(""); }              
                count = 2;
            }
            
            /////////////////////////// FOR 'X' ////////////////////////////

            if (ae.getSource() == b[1] && str==("") && count%2 == 0){
                b[1].setText("X");

                arr[0] = 1;
                if (arr[0]==(arr[1]) && arr[0]==(arr[2])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }
                if (arr[0]==(arr[3]) && arr[0]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }    
                if (arr[0]==(arr[4]) && arr[0]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }    
                count++;
                // JOptionPane.showMessageDialog(count);
                return;  }

            if (ae.getSource() == b[2] && str==("") && count%2 == 0){
                b[2].setText("X");
                arr[1] = 1;  
                if (arr[0]==(arr[1]) && arr[0]==(arr[2])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }
                if (arr[1]==(arr[4]) && arr[1]==(arr[7])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }   
                count++;
                return;  }

            if (ae.getSource() == b[3] && str==("") && count%2 == 0){
                b[3].setText("X");
                arr[2] = 1;
                if (arr[0]==(arr[1]) && arr[0]==(arr[2])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }
                if (arr[2]==(arr[5]) && arr[2]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }
                if (arr[2]==(arr[4]) && arr[2]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }    
                count++;
                return;  }

            if (ae.getSource() == b[4] && str==("") && count%2 == 0){
                b[4].setText("X");
                arr[3] = 1;
                if (arr[3]==(arr[4]) && arr[3]==(arr[5])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);
                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   }
                if (arr[0]==(arr[3]) && arr[0]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);
                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   }      
                count++;
                return;  }

            if (ae.getSource() == b[5] && str==("") && count%2 == 0){
                b[5].setText("X");  
                arr[4] = 1;
                if (arr[3]==(arr[4]) && arr[3]==(arr[5])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }
                if (arr[1]==(arr[4]) && arr[1]==(arr[7])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }  
                if (arr[0]==(arr[4]) && arr[0]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }
                if (arr[2]==(arr[4]) && arr[2]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE); }   
                count++;
                return;  }

            if (ae.getSource() == b[6] && str==("") && count%2 == 0){
                b[6].setText("X");
                arr[5] = 1;
                if (arr[3]==(arr[4]) && arr[3]==(arr[5])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[0]==(arr[4]) && arr[0]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[2]==(arr[5]) && arr[2]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}     
                count++;
                return;  }

            if (ae.getSource() == b[7] && str==("") && count%2 == 0){
                b[7].setText("X");
                arr[6] = 1;
                if (arr[6]==(arr[7]) && arr[6]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[0]==(arr[3]) && arr[0]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}  
                if (arr[2]==(arr[4]) && arr[2]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}       
                count++;
                return;  }

            if (ae.getSource() == b[8] && str==("") && count%2 == 0){
                b[8].setText("X");   
                arr[7] = 1;
                if (arr[6]==(arr[7]) && arr[6]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);} 
                if (arr[1]==(arr[4]) && arr[1]==(arr[7])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}      
                count++;
                return;  } 

            if (ae.getSource() == b[9] && str==("") && count%2 == 0){
                b[9].setText("X");  
                arr[8] = 1;
                if (arr[6]==(arr[7]) && arr[6]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);} 
                if (arr[2]==(arr[5]) && arr[2]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}     
                if (arr[0]==(arr[4]) && arr[0]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"X WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}     
                count++;
                return;  }                    

            /////////////////////////// FOR 'O' ////////////////////////////

            if (ae.getSource() == b[1] && str==("") && count%2 == 1){
                b[1].setText("O");
                arr[0] = 2;
                if (arr[0]==(arr[1]) && arr[0]==(arr[2])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[0]==(arr[3]) && arr[0]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}    
                if (arr[0]==(arr[4]) && arr[0]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}    
                count++;
                return;  }

            if (ae.getSource() == b[2] && str==("") && count%2 == 1){
                b[2].setText("O");
                arr[1] = 2;
                if (arr[0]==(arr[1]) && arr[0]==(arr[2])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[1]==(arr[4]) && arr[1]==(arr[7])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}   
                count++;
                return;  }

            if (ae.getSource() == b[3] && str==("") && count%2 == 1){
                b[3].setText("O");
                arr[2] = 2;
                if (arr[0]==(arr[1]) && arr[0]==(arr[2])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[2]==(arr[5]) && arr[2]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[2]==(arr[4]) && arr[2]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}    
                count++;
                return;  }

            if (ae.getSource() == b[4] && str==("") && count%2 == 1){
                b[4].setText("O");
                arr[3] = 2;
                if (arr[3]==(arr[4]) && arr[3]==(arr[5])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[0]==(arr[3]) && arr[0]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}      
                count++;
                return;  }

            if (ae.getSource() == b[5] && str==("") && count%2 == 1){
                b[5].setText("O");  
                arr[4] = 2;
                if (arr[3]==(arr[4]) && arr[3]==(arr[5])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[1]==(arr[4]) && arr[1]==(arr[7])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}  
                if (arr[0]==(arr[4]) && arr[0]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[2]==(arr[4]) && arr[2]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}   
                count++;
                return;  }

            if (ae.getSource() == b[6] && str==("") && count%2 == 1){
                b[6].setText("O");
                arr[5] = 2;
                if (arr[3]==(arr[4]) && arr[3]==(arr[5])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[0]==(arr[4]) && arr[0]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[2]==(arr[5]) && arr[2]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}     
                count++;
                return;  }

            if (ae.getSource() == b[7] && str==("") && count%2 == 1){
                b[7].setText("O");
                arr[6] = 2;
                if (arr[6]==(arr[7]) && arr[6]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}
                if (arr[0]==(arr[3]) && arr[0]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}  
                if (arr[2]==(arr[4]) && arr[2]==(arr[6])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}       
                count++;
                return;  }

            if (ae.getSource() == b[8] && str==("") && count%2 == 1){
                b[8].setText("O");   
                arr[7] = 2;
                if (arr[6]==(arr[7]) && arr[6]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);} 
                if (arr[1]==(arr[4]) && arr[1]==(arr[7])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}      
                count++;
                return;  } 

            if (ae.getSource() == b[9] && str==("") && count%2 == 1){
                b[9].setText("O");  
                arr[8] = 2;
                if (arr[6]==(arr[7]) && arr[6]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);} 
                if (arr[2]==(arr[5]) && arr[2]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}     
                if (arr[0]==(arr[4]) && arr[0]==(arr[8])) {
                    JOptionPane.showMessageDialog(this,"O WINS!", "Reset game",JOptionPane.PLAIN_MESSAGE);}     
                count++;
                return;  }              
        }           
	}
	public static void main(String[] args){
		Tic fr = new Tic();
		fr.setSize(400,500);
		fr.setTitle("TicTacToe");      //Creating the basic big frame
		fr.setVisible(true);
		fr.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}