/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maralboran.imad.juegodelsiete;

import java.util.Random;

/**
 *
 * @author imad
 */
public class ProgramaJuegoDelSiete {

    public static void main(String[] args) {
        //Declaracion de variables
        int contadorRondasGanadasjugadorUno = 0,
                contadorRondasGanadasjugadorDos = 0,
                aleatorioJugadorUno,
                aleatorioJugadorDos, sumaJugadores = 0;
        int contadorRondas = 0;

        //Declaracion de objetos
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {
            //Generando aleatorios entre 1 y 5 
            System.out.println("--------Generando los numeros aleatorios de la ronda " + (contadorRondas + 1) + " --------");
            aleatorioJugadorUno = aleatorio.nextInt(5 - 1 + 1) + 1;
            System.out.println("Jugador 1 ha sacado " + aleatorioJugadorUno);
            aleatorioJugadorDos = aleatorio.nextInt(5 - 1 + 1) + 1;
            System.out.println("Jugador 2 ha sacado " + aleatorioJugadorDos);

            sumaJugadores = aleatorioJugadorUno + aleatorioJugadorDos;
            //Condicion para sumar rondas al ganador
            System.out.println("La suma de los numeros es " + sumaJugadores);
            if (aleatorioJugadorUno + aleatorioJugadorDos > 7) {
                System.out.println("Jugador dos gana la ronda " + (contadorRondas + 1));
                contadorRondasGanadasjugadorDos++;
            } else if (aleatorioJugadorUno + aleatorioJugadorDos < 7) {
                System.out.println("Jugador uno gana la ronda " + (contadorRondas + 1));
                contadorRondasGanadasjugadorUno++;

            } else {
                --i;
                System.out.println("Esta ronda ha terminado en empate");
            }
            if (contadorRondasGanadasjugadorUno == 3 || contadorRondasGanadasjugadorDos == 3) {
                //Si uno de los dos gana termina el juego 
                break;
            }
            contadorRondas++;
            System.out.println("---------------------------------------------------------------");
        }
        System.out.println("El jugador 1 ha ganado: " + contadorRondasGanadasjugadorUno + " rondas\n"
                + "El jugador 2 ha gando: " + contadorRondasGanadasjugadorDos + " rondas");
        System.out.println("------------------------------------------------------------------------------------");
        if (contadorRondasGanadasjugadorUno > contadorRondasGanadasjugadorDos) {
            System.out.println("Ha ganado el jugador 1");
        } else {
            System.out.println("Ha ganado el jugador 2");

        }

    }
}
