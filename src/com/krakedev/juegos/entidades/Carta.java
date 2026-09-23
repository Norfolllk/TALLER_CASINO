package com.krakedev.juegos.entidades;

public class Carta {
	//Atributos
	private String valor;
	private int valorJuego;
	private String palo;
	
	//Getters and Setters
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getValorJuego() {
		return valorJuego;
	}
	public void setValorJuego(int valorJuego) {
		this.valorJuego = valorJuego;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public void imprimir() {
		System.out.print(valor + "-" + palo);
		System.out.println(" Valor Juego: " + valorJuego);

	}
	
}