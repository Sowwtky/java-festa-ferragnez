package com.ferragnez.party;

import java.util.Scanner;

public class BonusCheckGuest {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasy", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		boolean trovato = false;
		String nomeInserito;
		int counter = 0;
		
		System.out.println("Come ti chiami?");
		nomeInserito = scan.nextLine();
		
		while (trovato == false && counter < listaInvitati.length) {
			if (nomeInserito.equalsIgnoreCase(listaInvitati[counter])) {
				trovato = true;
				System.out.println("Benvenut*!");
			} else {
				counter++;
			}
				
		}
		
		if (trovato == false) {
			System.out.println("Nome non nella lista");
		}
		
		scan.close();
		}
	}


