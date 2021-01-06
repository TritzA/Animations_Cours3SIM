package aaplications;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import composantperso.DessinDeVecteurs;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Programme de test qui dessine des vecteurs
 * @param args parametres du programme principal (non utilise dans cette application)
 * @author Caroline Houle
 */
public class AppDeDessin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppDeDessin frame = new AppDeDessin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AppDeDessin() {
		setTitle("Objets dessinables");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DessinDeVecteurs panelDessins = new DessinDeVecteurs();
		panelDessins.setBackground(new Color(0, 0, 139));
		panelDessins.setBounds(35, 36, 242, 216);
		contentPane.add(panelDessins);
		
		JLabel lblUnTestInitial = new JLabel("Tests avec les vecteurs");
		lblUnTestInitial.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnTestInitial.setBounds(35, 11, 142, 14);
		contentPane.add(lblUnTestInitial);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(35, 263, 242, 23);
		contentPane.add(btnQuitter);


	}
}
