package num_complejo;

public class Op_Conjuntos {
	public Complejo[] union(Complejo [] a, Complejo [] b){
		int n = a.length + b.length;
		Complejo auxiliar[] = new Complejo[n];
		int i;
		for(i = 0; i < a.length; i++) {
			auxiliar[i] = a[i];
		}
		for(int j = 0; j < b.length; j++){
			auxiliar[i] = b[j];
			i++;
		}
		return auxiliar;
	}
	public Complejo[] interseccion(Complejo [] a, Complejo [] b) {
		Complejo [] resultado = new Complejo[interseccion_veces(a, b)];
		int n = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i].getReal() == (b[j]).getReal() && a[i].getImaginario() == (b[j]).getImaginario()) {
					resultado[n] = a[i];
					n++;
				}
			}
		}
		return resultado;
	}
	public int interseccion_veces(Complejo [] a, Complejo [] b) {
		int n = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i].getReal() == (b[j]).getReal() && a[i].getImaginario() == (b[j]).getImaginario()) n++;
			}
		}
		return n;
	}
}
