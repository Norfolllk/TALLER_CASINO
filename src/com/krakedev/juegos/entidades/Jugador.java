package com.krakedev.juegos.entidades;
 
import java.util.ArrayList;
 
public class Jugador {
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private int puntajeCartas;
 
	//Constructor
	public Jugador(String nickname) {
		this.nickname = nickname;
	}
 
	//Getters and Setters
	public int getPuntajeCartas() {
		return puntajeCartas;
	}

	public void setPuntajeCartas(int puntajeCartas) {
		this.puntajeCartas = puntajeCartas;
	}

	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
 
	//metodo recibir Carta
	public void recibirCarta(Carta carta) {
		cartas.add(carta);
	}

	//metodo imprimir
	public void imprimir() {
		System.out.println("Nickname: " + nickname);
		for(Carta carta : cartas) {
			carta.imprimir();
		}
	}

}	

