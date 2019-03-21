package szamologep;

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

public class SzgepAblak extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JTextField littleOne;
	private String aktualis = "0";
	private double[] inputok = new double[2];
	private String muvelet = "5";

	public SzgepAblak() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		input = new JTextField();
		input.setFont(new Font("Tahoma", Font.PLAIN, 20));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setText("0");
		input.setBounds(75, 46, 175, 39);
		contentPane.add(input);
		input.setColumns(10);

		JLabel lblSzmolgp = new JLabel("Sz\u00E1mol\u00F3g\u00E9p");
		lblSzmolgp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSzmolgp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSzmolgp.setBounds(65, 11, 236, 25);
		contentPane.add(lblSzmolgp);

		JButton btn_osztas = new JButton("/");
		btn_osztas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					inputok[0] = Double.parseDouble(input.getText());
				}
				muvelet = "3";
				littleOne.setText("/");
				input.setText("");
				input.requestFocus();
			}
		});
		btn_osztas.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_osztas.setBounds(279, 272, 57, 39);
		contentPane.add(btn_osztas);

		JButton btn_elojel = new JButton("+/-");
		btn_elojel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() != "") {
					if (Math.floor(Double.parseDouble(input.getText())) != Double.parseDouble(input.getText())) {
						input.setText(String.valueOf(Double.parseDouble(input.getText()) * (-1)));
					} else {
						input.setText(String.valueOf(Integer.parseInt(input.getText()) * (-1)));
					}
				}
			}
		});
		btn_elojel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_elojel.setBounds(193, 273, 57, 39);
		contentPane.add(btn_elojel);

		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "0";
				} else {
					aktualis = input.getText() + "0";
				}
				input.setText(aktualis);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_0.setBounds(115, 272, 57, 39);
		contentPane.add(btn_0);

		JButton btn_tizedes = new JButton(".");
		btn_tizedes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().contains(".")) {

				} else if (input.getText().intern() == "") {
					input.setText("0.");
				} else {
					aktualis = input.getText() + ".";
					input.setText(aktualis);
				}
			}
		});
		btn_tizedes.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_tizedes.setBounds(35, 272, 57, 39);
		contentPane.add(btn_tizedes);

		JButton btn_szorzas = new JButton("*");
		btn_szorzas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					inputok[0] = Double.parseDouble(input.getText());
				}
				muvelet = "2";
				littleOne.setText("*");
				input.setText("");
				input.requestFocus();
			}
		});
		btn_szorzas.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_szorzas.setBounds(279, 211, 57, 39);
		contentPane.add(btn_szorzas);

		JButton btn_kivon = new JButton("-");
		btn_kivon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					inputok[0] = Double.parseDouble(input.getText());
				}
				muvelet = "1";
				littleOne.setText("-");
				input.setText("");
				input.requestFocus();
			}
		});
		btn_kivon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_kivon.setBounds(279, 152, 57, 39);
		contentPane.add(btn_kivon);

		JButton btn_osszead = new JButton("+");
		btn_osszead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!input.getText().equals("")) {
					inputok[0] = Double.parseDouble(input.getText());
				}
				muvelet = "0";
				littleOne.setText("+");
				input.setText("");
				input.requestFocus();
			}
		});
		btn_osszead.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_osszead.setBounds(279, 98, 57, 39);
		contentPane.add(btn_osszead);

		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "7";
				} else {
					aktualis = input.getText() + "7";
				}
				input.setText(aktualis);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_7.setBounds(35, 98, 57, 39);
		contentPane.add(btn_7);

		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "8";
				} else {
					aktualis = input.getText() + "8";
				}
				input.setText(aktualis);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_8.setBounds(115, 98, 57, 39);
		contentPane.add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "9";
				} else {
					aktualis = input.getText() + "9";
				}
				input.setText(aktualis);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_9.setBounds(193, 98, 57, 39);
		contentPane.add(btn_9);

		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "4";
				} else {
					aktualis = input.getText() + "4";
				}
				input.setText(aktualis);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_4.setBounds(35, 152, 57, 39);
		contentPane.add(btn_4);

		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "5";
				} else {
					aktualis = input.getText() + "5";
				}
				input.setText(aktualis);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_5.setBounds(115, 152, 57, 39);
		contentPane.add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "6";
				} else {
					aktualis = input.getText() + "6";
				}
				input.setText(aktualis);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_6.setBounds(193, 152, 57, 39);
		contentPane.add(btn_6);

		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "1";
				} else {
					aktualis = input.getText() + "1";
				}
				input.setText(aktualis);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_1.setBounds(35, 211, 57, 39);
		contentPane.add(btn_1);

		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "2";
				} else {
					aktualis = input.getText() + "2";
				}
				input.setText(aktualis);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_2.setBounds(115, 211, 57, 39);
		contentPane.add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() == "0") {
					aktualis = "3";
				} else {
					aktualis = input.getText() + "3";
				}
				input.setText(aktualis);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_3.setBounds(193, 211, 57, 39);
		contentPane.add(btn_3);

		JButton btn_egyenlo = new JButton("=");
		btn_egyenlo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().intern() != "") {
					boolean nulloszt = false;
					double eredmeny = 0;
					inputok[1] = Double.parseDouble(input.getText());

					switch (muvelet) {
					case "0": // összeadás
						eredmeny = inputok[0] + inputok[1];
						break;
					case "1": // kivonás
						eredmeny = inputok[0] - inputok[1];
						break;
					case "2": // szorzás
						eredmeny = inputok[0] * inputok[1];
						break;
					case "3": // osztás
						if ((inputok[1] == 0.0) || (inputok[1] == 0)) {
							input.setText("ERROR");
							nulloszt = true;
						} else {
							eredmeny = inputok[0] / inputok[1];
						}
						break;
					case "5": // nincs kiválasztva mûvelet
						eredmeny = Double.parseDouble(input.getText());
						break;
					default:
						System.out.println("default");
						break;
					}

					muvelet = "5";
					littleOne.setText("");
					String result = String.format("%.3f", eredmeny);

					if (!nulloszt) {
						if (eredmeny == Math.floor(eredmeny)) {
							input.setText(String.valueOf(Math.round(eredmeny))); // az eredmény egész szám
						} else {
							input.setText(String.valueOf(result).replace(',', '.')); // az eredmény valós szám
																						// tizedesponttal, max 3 tizedes
																						// értékkel
						}
					}
				}
			}
		});
		btn_egyenlo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_egyenlo.setBounds(279, 48, 57, 39);
		contentPane.add(btn_egyenlo);

		JButton btnC = new JButton("T\u00F6r\u00F6l"); // törlés gomb
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input.setText("0");
			}
		});
		btnC.setBounds(35, 14, 65, 23);
		contentPane.add(btnC);

		littleOne = new JTextField();
		littleOne.setFont(new Font("Tahoma", Font.BOLD, 20));
		littleOne.setHorizontalAlignment(SwingConstants.CENTER);
		littleOne.setBounds(35, 46, 39, 39);
		contentPane.add(littleOne);
		littleOne.setColumns(10);

		JButton vissza = new JButton("javít"); // javító gomb
		vissza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input.getText().length() >= 1) {
					input.setText(input.getText().substring(0, input.getText().length() - 1));
				}
			}
		});
		vissza.setBounds(271, 14, 65, 23);
		contentPane.add(vissza);

		littleOne.setEditable(false);
		input.setEditable(false);

		repaint();
		validate();
	}
}
