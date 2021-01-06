package aaplications;

import javax.swing.JOptionPane;

import geometrie.Vecteur;

public class AppDeCalcul {

	/**
	 * Programme de test qui utilise des vecteurs pour fins de calculs
	 * @param args parametres du programme principal (non utilise dans cette application)
	 * @author Caroline Houle
	 */
	public static void main(String[] args) {
		
		// Exercice (a)
		Vecteur vec1 = new Vecteur(3, 5);
		Vecteur vec2 = new Vecteur(9.7, 5.6);
		Vecteur vec3 = new Vecteur(10, 2);
		
		Vecteur vec4 = vec1.additionne(vec2.additionne(vec3));
		System.out.println(vec4.toString());
		
		Vecteur vec5 = null;
		try {
			vec5 = vec4.normalise();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Vecteur: erreur de normalisation");
		}
		System.out.println(vec5.toString());
		
	} //fin main

} //fin classe
