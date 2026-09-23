package com.krakedev.juegos.test;
 
import java.util.ArrayList;
 
import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;
 
public class TestJuego21 {
 
	public static void main(String[] args) {
		Juego21 juego21 =  new Juego21();
 
		juego21.agregarJugador(new Jugador("Pepe"));
		juego21.agregarJugador(new Jugador("Tommy"));
		juego21.agregarJugador(new Jugador("Cynthia"));
		juego21.agregarJugador(new Jugador("Diana"));
 
		juego21.inicializar();
		//for para lanzar mas de 1 ronda
		//for (int i = 0; i<4 ;i++) {
		//	juego21.repartirRonda();}
 
		ArrayList<Jugador> ganadores = juego21.jugar();
 
		for(Jugador jugador : ganadores) {
			jugador.imprimir();
		}
 
		for(Jugador jugador : juego21.getJugadores()) {
			jugador.imprimir();
		}
		
		for (int i = 0; i < 10; i++) {
		    ArrayList<Jugador> ganadores1 = juego21.jugar();
		    if (ganadores1.size() >= 1) {
		        for (Jugador jugador : ganadores1) {
		            jugador.imprimir();
		        }
		        break;
		    }
		}

		System.out.println(juego21.getDealer().getNaipe().size());
	}
}