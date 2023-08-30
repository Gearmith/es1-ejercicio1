/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio1;
import java.util.Scanner;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio1 {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan:");
        int juan = entrada.nextInt();
	int alberto = juan * 2/3;
	int ana = juan * 4/3;
	int mama = juan + alberto + ana;
        System.out.println("La edad de Juan es: " + juan);
        System.out.println("La edad de Alberto es: " + alberto);
        System.out.println("La edad de Ana es: " + ana);
        System.out.println("La edad de la madre es: " + mama);
    }
}
