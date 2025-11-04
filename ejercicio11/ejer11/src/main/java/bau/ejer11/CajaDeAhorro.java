package bau.ejer11;

public class CajaDeAhorro extends Cuenta {
	private double costoAdicional;
	public CajaDeAhorro() {
		super();
		this.costoAdicional = 0.02;
	}
	
	
	public double getCostoAdicional() {
		return costoAdicional;
	}
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto - monto* this.costoAdicional);
	}
	public void setCostoAdicional(double costoAdicional) {
		this.costoAdicional = costoAdicional;
	}

	protected double sumarCostoAdicional(double monto) {
		return monto+ monto* this.costoAdicional;
	}
	
	protected double restarCostoAdicional(double monto) {
		return monto- monto* this.costoAdicional;
	}
	@Override
	protected boolean puedeExtraer(double monto) {
		return (super.getSaldo() - monto >= 0);
	}
	
	@Override
	public boolean extraer(double unMonto) {
			return super.extraer(this.sumarCostoAdicional(unMonto));
	}
	
	public boolean transferirACuenta(double monto,Cuenta cuentaDestino) {
		super.extraerSinControlar(monto*this.costoAdicional);
		return super.transferirACuenta(monto, cuentaDestino);
	}
}
