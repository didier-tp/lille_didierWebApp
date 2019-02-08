package com.atos.tp.core;

import java.util.ArrayList;
import java.util.List;

public class RevisionBasesJava {

	public static void main(String[] args) {
		//cr�er une liste de produits (vide au debut)
		List<Produit> listeProduits = new ArrayList<Produit>();
		//ajouter 3 produits:
		Produit p1=new Produit(1L,"prod1", 56.7);
		listeProduits.add(p1);
		Produit p2=new Produit(2L,"prod2", 86.7);
		listeProduits.add(p2);
		listeProduits.add(new Produit(3L,"prod3", 16.7));
		//afficher les produits:
		System.out.println("avant promo:");
		for(Produit p : listeProduits) {
			System.out.println(p.toString());
		}
		//changer les prix:
		for(Produit p : listeProduits) {
			p.setPrix(p.getPrix()*0.95);
		}
		System.out.println("apres promo:");
		//r�-afficher les produits:
		for(Produit p : listeProduits) {
			System.out.println(p.toString());
		}
	}

}
