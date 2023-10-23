import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functButtons = new JButton[8];
	JButton addBut, subBut, mulBut, divBut, deciBut, eqlBut, clearBut;
	JPanel panel;
	
	Font myFont = new Font("",Font.BOLD,30);
	
	Calculator(){
		
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
