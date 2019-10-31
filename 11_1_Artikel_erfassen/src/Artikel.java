import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Artikel extends JFrame {
	
	public static void main(String[] args) {
		Artikel artikelErfasser = new Artikel(); 
	}
	
	public Artikel()
	{
		super("Artikel erfassen");
		
		JLabel lblArtikelNummer = new JLabel("Artikelnummer");
		JTextField txtArtikelNummer = new JTextField(20);
		
		JLabel lblBezeichnung = new JLabel("Bezeichnung");
		JTextField txtBezeichnung = new JTextField(50);
		
		JLabel lblPreis = new JLabel("Preis");
		JTextField txtPreis = new JTextField(20);
		
		JLabel lblFehlerAusgabe = new JLabel("");
		
		JButton btnSpeichern = new JButton("Speichern");
	    btnSpeichern.addActionListener(new ActionListener(){  

    		int artikelNummer;
    		String bezeichnung;
    		float preis;
	    	
			@Override
			public void actionPerformed(ActionEvent e) {
				if (getInput()) {
					saveIntoCSV();
				}
			}

			private void saveIntoCSV() {
				BufferedWriter writer;
				try {
					writer = new BufferedWriter(new FileWriter("artikelsatz.csv", true));
					String output = String.format("%d;%s;%f\n", artikelNummer, bezeichnung, preis);
					writer.write(output);
					writer.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			private boolean getInput() {
				boolean isValid = true;
				
				String artikelNummerInput = txtArtikelNummer.getText();
				String bezeichnungInput = txtBezeichnung.getText();
				String preisInput = txtPreis.getText();
				
				String fehlerStr = "";
				
				if (artikelNummerInput.equals("")) {
					fehlerStr += "Artikelnummer darf nicht leer sein. ";
				}
				if (bezeichnungInput.equals("")) {
					fehlerStr += "Bezeichnung darf nicht leer sein. ";
				}
				if (preisInput.equals("")) {
					fehlerStr += "Preis darf nicht leer sein. ";
				}
				
				if (fehlerStr != "") {
					lblFehlerAusgabe.setText(fehlerStr);
					return false;
				}
				
				try {
					artikelNummer = Integer.parseInt(artikelNummerInput);
					preis = Float.parseFloat(preisInput);
					bezeichnung = bezeichnungInput;
				}
				catch (Exception e) {
					isValid = false;
				}
				
				return isValid;
			}  
	    });
		
		GridLayout gridLayout = new GridLayout(5, 2, 1, 1);
		setLayout(gridLayout);
		
		add(lblArtikelNummer);
		add(txtArtikelNummer);
		add(lblBezeichnung);
		add(txtBezeichnung);
		add(lblPreis);
		add(txtPreis);
		add(lblFehlerAusgabe);
		add(btnSpeichern);
		
		setVisible(true);
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
















