package mx.edu.uacm.is.slt.ms.ejemplocolaboracion;

public class ControladorA implements PanelControl {

	@Override
	public void eventoA() {
		System.out.println("Llamaste al evento A, pero no hace nada todavía :D");		
	}

	@Override
	public void eventoB() {
		System.out.println("Felicidades, llamaste al evento B XD");
	}

}
