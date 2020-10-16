package calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorFrame extends JFrame {

	private final JTextField input;
	private final JTextField littleOne;
	private String actual = "0";
	private final double[] inputs = new double[2];
	private String action = "5";

	public CalculatorFrame() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 371);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		input = new JTextField();
		input.setFont(new Font("Helvetica", Font.PLAIN, 20));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setText("0");
		input.setBounds(75, 46, 175, 39);
		contentPane.add(input);
		input.setColumns(10);

		JLabel labelCalculator = new JLabel("Calculator");
		labelCalculator.setFont(new Font("Helvetica", Font.PLAIN, 14));
		labelCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		labelCalculator.setBounds(65, 11, 236, 25);
		contentPane.add(labelCalculator);

		JButton buttonDivision = new JButton("/");
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					inputs[0] = Double.parseDouble(input.getText());
				}
								littleOne.setText("/");
				input.setText("");
				input.requestFocus();
			}
		});
		buttonDivision.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonDivision.setBounds(279, 272, 57, 39);
		contentPane.add(buttonDivision);

		JButton buttonSign = new JButton("+/-");
		buttonSign.addActionListener(e -> {
			if (!input.getText().intern().equals("")) {
				if (Math.floor(Double.parseDouble(input.getText())) != Double.parseDouble(input.getText())) {
					input.setText(String.valueOf(Double.parseDouble(input.getText()) * (-1)));
				} else {
					input.setText(String.valueOf(Integer.parseInt(input.getText()) * (-1)));
				}
			}
		});
		buttonSign.setFont(new Font("Helvetica", Font.BOLD, 12));
		buttonSign.setBounds(193, 273, 57, 39);
		contentPane.add(buttonSign);

		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "0";
			} else {
				actual = input.getText() + "0";
			}
			input.setText(actual);
		});
		btn_0.setFont(new Font("Helvetica", Font.BOLD, 14));
		btn_0.setBounds(115, 272, 57, 39);
		contentPane.add(btn_0);

		JButton buttonDecimalPoint = new JButton(".");
		buttonDecimalPoint.addActionListener(e -> {
			if (input.getText().equals("")) {
				input.setText("0.");
			} else if (!input.getText().contains(".")) {
				actual = input.getText() + ".";
				input.setText(actual);
			}
		});
		buttonDecimalPoint.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonDecimalPoint.setBounds(35, 272, 57, 39);
		contentPane.add(buttonDecimalPoint);

		JButton buttonMultiplication = new JButton("*");
		buttonMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					inputs[0] = Double.parseDouble(input.getText());
				}
				action = "2";
				littleOne.setText("*");
				input.setText("");
				input.requestFocus();
			}
		});
		buttonMultiplication.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonMultiplication.setBounds(279, 211, 57, 39);
		contentPane.add(buttonMultiplication);

		JButton buttonSubtraction = new JButton("-");
		buttonSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					inputs[0] = Double.parseDouble(input.getText());
				}
				action = "1";
				littleOne.setText("-");
				input.setText("");
				input.requestFocus();
			}
		});
		buttonSubtraction.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonSubtraction.setBounds(279, 152, 57, 39);
		contentPane.add(buttonSubtraction);

		JButton buttonSum = new JButton("+");
		buttonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					inputs[0] = Double.parseDouble(input.getText());
				}
				action = "0";
				littleOne.setText("+");
				input.setText("");
				input.requestFocus();
			}
		});
		buttonSum.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonSum.setBounds(279, 98, 57, 39);
		contentPane.add(buttonSum);

		JButton buttonSeven = new JButton("7");
		buttonSeven.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "7";
			} else {
				actual = input.getText() + "7";
			}
			input.setText(actual);
		});
		buttonSeven.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonSeven.setBounds(35, 98, 57, 39);
		contentPane.add(buttonSeven);

		JButton buttonEight = new JButton("8");
		buttonEight.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "8";
			} else {
				actual = input.getText() + "8";
			}
			input.setText(actual);
		});
		buttonEight.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonEight.setBounds(115, 98, 57, 39);
		contentPane.add(buttonEight);

		JButton buttonNine = new JButton("9");
		buttonNine.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "9";
			} else {
				actual = input.getText() + "9";
			}
			input.setText(actual);
		});
		buttonNine.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonNine.setBounds(193, 98, 57, 39);
		contentPane.add(buttonNine);

		JButton buttonFour = new JButton("4");
		buttonFour.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "4";
			} else {
				actual = input.getText() + "4";
			}
			input.setText(actual);
		});
		buttonFour.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonFour.setBounds(35, 152, 57, 39);
		contentPane.add(buttonFour);

		JButton buttonFive = new JButton("5");
		buttonFive.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "5";
			} else {
				actual = input.getText() + "5";
			}
			input.setText(actual);
		});
		buttonFive.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonFive.setBounds(115, 152, 57, 39);
		contentPane.add(buttonFive);

		JButton buttonSix = new JButton("6");
		buttonSix.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "6";
			} else {
				actual = input.getText() + "6";
			}
			input.setText(actual);
		});
		buttonSix.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonSix.setBounds(193, 152, 57, 39);
		contentPane.add(buttonSix);

		JButton buttonOne = new JButton("1");
		buttonOne.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "1";
			} else {
				actual = input.getText() + "1";
			}
			input.setText(actual);
		});
		buttonOne.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonOne.setBounds(35, 211, 57, 39);
		contentPane.add(buttonOne);

		JButton buttonTwo = new JButton("2");
		buttonTwo.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "2";
			} else {
				actual = input.getText() + "2";
			}
			input.setText(actual);
		});
		buttonTwo.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonTwo.setBounds(115, 211, 57, 39);
		contentPane.add(buttonTwo);

		JButton buttonThree = new JButton("3");
		buttonThree.addActionListener(e -> {
			if (input.getText().equals("0")) {
				actual = "3";
			} else {
				actual = input.getText() + "3";
			}
			input.setText(actual);
		});
		buttonThree.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonThree.setBounds(193, 211, 57, 39);
		contentPane.add(buttonThree);

		JButton buttonEqualSign = new JButton("=");
		buttonEqualSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					boolean divZero = false;
					double resultEquals = 0;
					inputs[1] = Double.parseDouble(input.getText());

					switch (action) {
					case "0": // addition
						resultEquals = inputs[0] + inputs[1];
						break;
					case "1": // subtraction
						resultEquals = inputs[0] - inputs[1];
						break;
					case "2": // multiplication
						resultEquals = inputs[0] * inputs[1];
						break;
					case "3": // division
						if ((inputs[1] == 0.0) || (inputs[1] == 0)) {
							input.setText("ERROR");
							divZero = true;
						} else {
							resultEquals = inputs[0] / inputs[1];
						}
						break;
					case "5": // no action selected
						resultEquals = Double.parseDouble(input.getText());
						break;
					default:
						System.out.println("default");
						break;
					}

					action = "5";
					littleOne.setText("");
					String result = String.format("%.3f", resultEquals);

					if (!divZero) {
						if (resultEquals == Math.floor(resultEquals)) {
							input.setText(String.valueOf(Math.round(resultEquals))); // the result is an integer number
						} else {
							input.setText(String.valueOf(result).replace(',', '.')); // the result is a real number with max 3 decimal
						}
					}
				}
			}
		});
		buttonEqualSign.setFont(new Font("Helvetica", Font.BOLD, 14));
		buttonEqualSign.setBounds(279, 48, 57, 39);
		contentPane.add(buttonEqualSign);

		JButton buttonErase = new JButton("Erase"); // erase button
		buttonErase.addActionListener(arg0 -> input.setText("0"));
		buttonErase.setBounds(35, 14, 65, 23);
		contentPane.add(buttonErase);

		littleOne = new JTextField();
		littleOne.setFont(new Font("Helvetica", Font.BOLD, 20));
		littleOne.setHorizontalAlignment(SwingConstants.CENTER);
		littleOne.setBounds(35, 46, 39, 39);
		contentPane.add(littleOne);
		littleOne.setColumns(10);

		JButton buttonBack = new JButton("Clear"); // clear button
		buttonBack.addActionListener(e -> {
			if (input.getText().length() >= 1) {
				input.setText(input.getText().substring(0, input.getText().length() - 1));
			}
		});
		buttonBack.setBounds(271, 14, 65, 23);
		contentPane.add(buttonBack);

		littleOne.setEditable(false);
		input.setEditable(false);

		repaint();
		validate();
	}
}
