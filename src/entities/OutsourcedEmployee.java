package entities;

public class OutsourcedEmployee extends Employee {

	private Double despesaAdicional;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String nome, Integer hora, Double valorPorHora, Double despesaAdicional) {
		super(nome, hora, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}
	
}
