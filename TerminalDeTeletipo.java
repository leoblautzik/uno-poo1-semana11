package colecciones;

import java.util.Stack;

/*
En una terminal de teletipo existe un carácter de retroceso que permite 
cancelar el último carácter. Por ejemplo: si el carácter de retroceso es /, 
entonces la línea abc/d//e será interpretada como ae. 
Existe también un carácter anulador que elimina todos los caracteres ingresados hasta el momento, 
suponga que ese carácter es &. 
Realice un método que dada una tira de caracteres terminadas con * que se pasa por parámetro, 
ejecute las operaciones indicadas si se encuentra con el carácter / o el &. 
Debe por último imprimir la tira resultante. 
*/


public class TerminalDeTeletipo {

	public String ejecutar(String tira) {
		//Tener en cuenta que las operaciones sobre pila pop y push son O(1).

		Stack<Character> teletipo = new Stack<Character>();
		String linea ="";

		for (int i=0; i<tira.length()-1; i++)

			if (tira.charAt(i)=='&')
				teletipo.clear();
			else
				if (tira.charAt(i)=='/') {
					if (!teletipo.empty())
						teletipo.pop();
				}
					else 
						teletipo.push(tira.charAt(i));

		//Doy vuenta la pila resultante
		Stack<Character> aux = new Stack<Character>();
		while(!teletipo.empty())
			aux.push(teletipo.pop());

		//Pongo la pila en el string que será devuelto. 
		while(!aux.empty()) {
			linea+=aux.pop();
		}
		return linea;

	}

	public static void main(String[] args) {

		TerminalDeTeletipo terminal = new TerminalDeTeletipo();
		System.out.println(terminal.ejecutar("///abc//dfr/RY/e&///rtyu/*"));

	}

}
