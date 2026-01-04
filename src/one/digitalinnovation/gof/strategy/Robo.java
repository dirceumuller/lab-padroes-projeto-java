package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover(int passos) {
		for (int i = 0; i < passos; i++) {
			comportamento.mover();
		}
	}
}
