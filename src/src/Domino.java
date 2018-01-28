package src;
public class Domino {
	public static void main(String[] args) {

		int num = 8;
		int rs = 0;
		while (num > rs) {
			int subloque;
			int fila; 
			for (fila = (int) Math.sqrt(2 * num); fila >= 1; fila--) { //con la raiz podemos obtener el numero aproximado de bloques en primera instancia
				subloque = (2 * num - fila * (fila - 1)) / (2 * fila);  //se evalua si el subloque completa una fila nueva
				if (2 * num == fila * (2 * subloque + fila - 1)) { 
					//comparamos si el valor de n es igual a una fila de a es 
					//igual al numero multiplicado *2 es verdadero y quedaria registrado
					//el numero de fila que se necesitaria en  i
					rs = num; // igualamos el resultado con el numero para romper el bloque while para que no siga iterando
					break;
				}
			}
			System.out.println("Filas: " + fila);
			System.out.println("Fichas: " + num);
		}
	}
}
