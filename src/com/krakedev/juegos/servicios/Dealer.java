package com.krakedev.juegos.servicios;

import java.util.ArrayList;
import java.util.List;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	//Atributo naipe del ripo arrayList
	private ArrayList<Carta> naipe;
	
	//Constructor vacio Dealer
	public Dealer() {
		this.naipe = new ArrayList<Carta>();
		generarNaipe();
	}

	//Getters and Setters
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}
	
	//Metodo generarNaipe
	public void generarNaipe() {
		
		//Usamos la clase list para llenar un ArrayList	
		ArrayList<String> palos = new ArrayList<String>(List.of("T","CN","CR", "D"));
		
		ArrayList<String> numeros = new ArrayList<String>(List.of("A", "2","3","4","5","6","7","8","9","10","J","Q","K")); 
			
		for(String palo : palos) {
			for(String numero : numeros) {
				Carta carta = new Carta();
				carta.setPalo(palo);
				carta.setValor(numero);
				
				naipe.add(carta);
			}
		}
	}
	//Metodo imprimirNaipe
	public void imprimirNaipe() {
		for(Carta carta : naipe) {
			carta.imprimir();
		}
	}
	
	
	
	//Metodo generar Aleatorio
	public int generarAleatorio(int maximo) {
		
		int aleatorio;
		
		aleatorio = (int) (Math.random() * (maximo + 1));
		
		return aleatorio;
	}
	
	//Metodo entregar carta
	public Carta entregarCarta() {
		int aleatorio = generarAleatorio(naipe.size()-1);
		Carta carta = naipe.get(aleatorio);
		naipe.remove(aleatorio);
		return carta;
	}
}	
	