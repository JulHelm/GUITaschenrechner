import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {

	private JLabel labelOperand1;
	private JLabel labelOperand2;
	private JLabel labelOperator;

	private JTextField fieldOperand1;
	private JTextField fieldOperand2;

	private JButton buttonRechnen;

	private String operator;

	public GUI(String title, String operator) {
		this.operator = operator;

		initComponents();
		setTitle(title);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(250, 150);
		setResizable(false);

		initComponents();

		add(labelOperand1);
		add(labelOperand2);
		add(fieldOperand1);
		add(labelOperator);
		add(fieldOperand2);
		add(buttonRechnen);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void initComponents() {

		labelOperand1 = new JLabel("1. Summand       ");
		labelOperand2 = new JLabel("2. Summand");
		labelOperator = new JLabel(operator);

		fieldOperand1 = new JTextField(8);
		fieldOperand2 = new JTextField(8);

		buttonRechnen = new JButton("Rechne!");
		buttonRechnen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int op1 = Integer.parseInt(fieldOperand1.getText());
				int op2 = Integer.parseInt(fieldOperand2.getText());
				
				int ergebnis;
				
				if (operator.equals("+")) {
					ergebnis = op1 + op2;
					System.out.println(ergebnis);
				}else if (operator.equals("-")) {
					ergebnis = op1 - op2;
				}else if (operator.equals("*")) {
					ergebnis = op1 * op2;
				}else if (operator.equals("/")) {
					ergebnis = op1 / op2;
				}else
					System.out.println("Bitte +,*,/,- eigeben!");
				

			}
		});

	}

}
