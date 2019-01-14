package principal;
import num_complejo.*;
public class Principal {
	public static void main(String [] args) {
		Complejo num1 = new Complejo(9, 9);
		Complejo num2 = new Complejo(4, 8);
		Complejo num3 = new Complejo(45, 2);
		Complejo num4 = new Complejo(12, 4);
		Complejo num5 = new Complejo(5, 9);
		Complejo num6 = new Complejo(12, 3);
		Complejo num7 = new Complejo(4, 8);
		Complejo num8 = new Complejo(9, 9);
		System.out.println("Suma de dos complejos " + num1.suma(num2));
		System.out.println("Multiplicacion de dos complejos " + num4.resta(num5));
		Complejo []vector1 = new Complejo [4];
		vector1[0] = num1;
		vector1[1] = num2;
		vector1[2] = num3;
		vector1[3] = num4;
		Complejo []vector2 = new Complejo [4];
		vector2[0] = num5;
		vector2[1] = num6;
		vector2[2] = num7;
		vector2[3] = num8;
		Op_Conjuntos operaciones = new Op_Conjuntos();
		Complejo [] union = operaciones.union(vector1, vector2);
		Complejo [] interseccion = operaciones.interseccion(vector1, vector2);
		System.out.println("*** Unión ***");
		for(int i = 0; i < union.length; i++) {
			System.out.println(union[i]);
		}
		System.out.println("*** Intersección ***");
		for(int i = 0; i < interseccion.length; i++) {
			System.out.println(interseccion[i]);
		}
	}
}
