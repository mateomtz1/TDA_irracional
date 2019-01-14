package num_complejo;
public class Complejo implements IComplejo{
	private double x; //Parte real
	private double y; //Parte imaginaria
	public Complejo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getReal() {
		return this.x;
	}
	public double getImaginario() {
		return this.y;
	}
	@Override
	public Complejo suma(Complejo _a) {
		return new Complejo(x + _a.getReal(), y + _a.getImaginario());
	}

	@Override
	public Complejo resta(Complejo _a) {
		return new Complejo(x - _a.getReal(), y - _a.getImaginario());
	}
	@Override
	public Complejo multiplicacion(Complejo _a) {
		return new Complejo(x * _a.getReal() - y * _a.getImaginario(), 
				x * _a.getImaginario() + y * _a.getReal());
	}
	@Override
	public double modulo() {
		if(x != 0 || y != 0)
			return Math.sqrt(x * x + y * y);
		else
			return 0;
	}
	@Override
	public Complejo division(Complejo _a) {
		double denominador = Math.pow(_a.modulo(), 2);
		return new Complejo((x * _a.getReal() + y * _a.getImaginario()) / denominador, 
				(y * _a.getReal() - x * _a.getImaginario())/denominador);
	}
	
	@Override
	public double argumento() {
		return Math.atan2(y, x);
	}
	@Override
	public Complejo exponenciacion() {
		return new Complejo(Math.exp(x) * Math.cos(y), 
				Math.exp(x) * Math.sin(y));
	}
	@Override
	public Complejo radicacion() {
		double r = Math.sqrt(this.modulo());
		double theta = this.argumento() / 2;
		return new Complejo(r * Math.cos(theta), 
				r * Math.sin(theta));
	}
	@Override
	public Complejo logaritmo() {
		return new Complejo(Math.log(this.modulo()), this.argumento());
	}
	public String toString() {
        if (x != 0 && y > 0)
            return x + " + " + y +"i";
        if (x!=0 && y<0)
            return x + " - " + (-y) + "i";
        if (y == 0)
            return String.valueOf(x);
        if (x==0)
            return y + "i";
        return x + " + i*" + y;
        
    }  
}
