import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functButtons = new JButton[8];
	JButton addBut, subBut, mulBut, divBut, deciBut, eqlBut, clearBut, delBut;
	JPanel panel;
	
	Font myFont = new Font("",Font.BOLD,30);
	
	
	Calculator(){
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);	
		frame.setLayout(null);
		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		
		addBut = new JButton("+");
		subBut = new JButton("-");
		mulBut = new JButton("x");
		divBut = new JButton("÷");
		deciBut = new JButton(".");
		eqlBut = new JButton("=");
		delBut = new JButton("Delete");
		clearBut = new JButton("Clear");
		
		functButtons[0] = addBut;
		functButtons[1] = subBut;
		functButtons[2] = mulBut;
		functButtons[3] = divBut;
		functButtons[4] = deciBut;
		functButtons[5] = eqlBut;
		functButtons[6] = delBut;
		functButtons[7] = clearBut;

		for(int i = 0;i<8;i++) {
			functButtons[i].addActionListener(this);
			functButtons[i].setFont(myFont);
			functButtons[i].setFocusable(false);
		}
		
		for(int i = 0;i<10;i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		delBut.setBounds(50, 430, 145, 50);
		clearBut.setBounds(205, 430, 145, 50);
		
		panel = new JPanel();
		panel.setBounds(50,100, 300,300);
		panel.setLayout(new GridLayout(4, 4,10, 10));
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addBut);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subBut);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulBut);
		panel.add(deciBut);
		panel.add(numberButtons[0]);
		panel.add(eqlBut);
		panel.add(divBut);
		
		
		frame.add(delBut);
		frame.add(clearBut);
		
		
		frame.add(textfield);
		
		frame.setVisible(true);
		
		
	}


	public static void main(String[] args) {
		Calculator calc = new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
