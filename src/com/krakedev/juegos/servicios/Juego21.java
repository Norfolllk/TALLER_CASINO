package com.krakedev.juegos.servicios;
 
import java.util.ArrayList;
 
import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;
 
public class Juego21 {
	private ArrayList<Jugador> jugadores;
	private Dealer dealer;
 
	//Constructor vacio
	public Juego21() {
		this.jugadores = new ArrayList<Jugador>();
	}
 
	//Getters and Setters
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Dealer getDealer() {
		return dealer;
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
 
	//Metodo cargar Valores
	public void cargarValores() {
		for(Carta carta : dealer.getNaipe()) {
			switch (carta.getValor()) {
			case "A" :
				carta.setValorJuego(11);
				break;
			case "J" :
			case "Q" :
			case "K" :
				carta.setValorJuego(10);
				break;
			default :
				int x = Integer.parseInt(carta.getValor());
				carta.setValorJuego(x);
				break;
 
			}
		}
	}
	
	//Metodo inicializar
	public void inicializar() {
		this.dealer = new Dealer();
		cargarValores();
	}
	
	//Metodo agregarJugador
	public void agregarJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	//Metodo repartirCarta
	public void repartirCarta(Jugador jugador) {
		if(dealer.getNaipe().size()==0) {
			System.out.println("NAIPE VACIO");
			return;
		}
		Carta carta = this.dealer.entregarCarta();
 
		jugador.recibirCarta(carta);
	}
	
	//Metodo repartir ronda
	public void repartirRonda() {
		for(Jugador jugador : jugadores) {
			repartirCarta(jugador);
		}
	}
}

