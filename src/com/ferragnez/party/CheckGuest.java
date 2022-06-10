package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		/*
		 * Creare e inizializzare l'array con i nomi degli invitati
		 * chiedere all'utente come si chiama
		 * lasciarlo entrare o rispedirlo cortesemente da dove é venuto*/
		
		//inizializzo scanner
		Scanner scan = new Scanner (System.in);
		
		//array
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasy", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		//variabili 
		String nomeInserito;
		//boolean continua = true;
		int i;
		boolean trovato = false;
		
		System.out.println("Come ti chiami?"); 
		nomeInserito = scan.nextLine();
		
		for (i = 0; i < listaInvitati.length; i++) {
			if (nomeInserito.equalsIgnoreCase(listaInvitati[i])) {
				trovato = true;
				System.out.println("Benvenut*, puoi entrare!");
			} 
		}
		
		if (trovato == false) {
			System.out.println("Accesso negato, nome non nella lista!");
		}
		
		
		scan.close();
	}

}
