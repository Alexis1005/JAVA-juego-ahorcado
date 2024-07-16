package prueba_inicial.comienzo;
import java.util.Scanner;


public class Ahorcado {
	public static void main(String[] args) {
		
		//crear clase scanner
		Scanner sc = new Scanner(System.in);
		
		//declarar variables y asignaciones
		String palabraSecreta = "artificial";
		int intentos = 12;
		int intento = 0;
		boolean adivinada= false;
		
		//crear arreglos
		char [] letraAdivinada = new char[palabraSecreta.length()];
		
		
		for (int i = 0; i < letraAdivinada.length; i++) {
			letraAdivinada[i] = '_';
		}
		
		while(!adivinada && intento <= intentos) {
			System.out.println("Palabra a adivinar: " + String.valueOf(letraAdivinada) + " " + "(" + palabraSecreta.length()+ " letras) ");
			
			System.out.println("Ingrese una letra, por favor: ");
			
			char letra = Character.toLowerCase(sc.next().charAt(0));
			
			boolean letraCorrecta = false;
			
			int j=0;
			for(; j < palabraSecreta.length(); j++) {
				if(letra == palabraSecreta.charAt(j)) {
					letraAdivinada[j] = letra;
					letraCorrecta= true;
				}
				}
			if(!letraCorrecta) {
				intento++;
				System.out.println("Incorrecto, intenta nuevamente! Te quedan " + (intentos - intento) + " intentos.");
			}
			if (String.valueOf(letraAdivinada).equals(palabraSecreta)) {
				System.out.println("Felicidades! GANASTE");
				break;
			}
		}
		if(!adivinada) {
			System.out.println("!GAME OVER¡");
		}
		sc.close();
		}
	}				
