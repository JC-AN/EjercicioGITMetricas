package mx.edu.uacm.is.slt.ms.ejemplocolaboracion;

public class ControladorB implements PanelControl {

	@Override
	public void eventoA() {
		System.out.println("ControladorB - Evento A");
	}

	@Override
	public void eventoB() {
		System.out.println("ControladorB - Evento B");
	}

}
