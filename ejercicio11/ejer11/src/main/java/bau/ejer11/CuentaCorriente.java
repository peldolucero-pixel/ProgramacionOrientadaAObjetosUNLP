package bau.ejer11;

public class CuentaCorriente extends Cuenta{
	private double limiteDeDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDeDescubierto = 0;
	}
	
	public double getLimiteDeDescubierto() {
		return limiteDeDescubierto;
	}

	public void setLimiteDeDescubierto(double limiteDeDescubierto) {
		this.limiteDeDescubierto = (limiteDeDescubierto > 0 ? limiteDeDescubierto:
									this.limiteDeDescubierto);
	}

	public CuentaCorriente(double limiteDeDescubierto) {
		super();
		this.limiteDeDescubierto = limiteDeDescubierto;
	}
	
	
	@Override
	protected boolean puedeExtraer(double unMonto) {
		return (this.limiteDeDescubierto + super.getSaldo() >= unMonto );
	}
}
