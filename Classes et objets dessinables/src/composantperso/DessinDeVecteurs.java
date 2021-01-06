package composantperso;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import geometrie.Vecteur;
import geometrie.VecteurGraphique;

/**
 * Composant graphique de dessin personnalise
 * Pour illustrer le fonctionnement des vecteurs
 * @author Caroline Houle
 */
public class DessinDeVecteurs extends JPanel {
	private static final long serialVersionUID = 2336373394542511620L;

	public DessinDeVecteurs() {
		setBackground(Color.blue);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;	
		
		g2d.setColor(Color.white);
		VecteurGraphique vec1 = new VecteurGraphique(60,100);
		vec1.setOrigineXY(50, 20);
		vec1.dessiner(g2d);

		g2d.setColor(Color.red);
		VecteurGraphique vec2 = new VecteurGraphique(100,0);
		vec2.setOrigineXY(60, 60);
		vec2.setAngleTete(1.2);
		vec2.setLongueurTete(40);
		vec2.dessiner(g2d);
		
		g2d.setColor(Color.green);
		VecteurGraphique vec3 = new VecteurGraphique(vec1.additionne(vec2));
		vec3.setOrigineXY(0, 0);
		vec3.dessiner(g2d);

	}

}//fin classe
