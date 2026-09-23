package com.krakedev.juegos.test;
 
import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;
 
public class TestJuego21 {
 
	public static void main(String[] args) {
		Juego21 juego21 =  new Juego21();
 
		juego21.agregarJugador(new Jugador("Pepe"));
		juego21.agregarJugador(new Jugador("Tommy"));
		juego21.agregarJugador(new Jugador("Cynthia"));
 
		juego21.inicializar();
		juego21.repartirRonda();
 
		for(Jugador jugador : juego21.getJugadores()) {
			jugador.imprimir();
		}
 
		System.out.println(juego21.getDealer().getNaipe().size());
	}
}