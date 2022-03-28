package taller3.televisores;

public class Control {
	private TV tv;

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public void enlazar(TV tv){
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void turnOff() {
		if (tv.estado == true) {
			this.tv.estado = false;
		}
	}
	
	public void turnOn() {
		if (tv.estado == false) {
			this.tv.estado = true;
		}
	}
	
	public void canalUp() {
		if (tv.estado == true) {
			for (tv.canal = 1;
					tv.canal <= 120;
					tv.canal++);
			tv.canal++;
		}
	}
	
	public void canalDown() {
		if (tv.estado == true) {
			for (tv.canal = 1;
					tv.canal <= 120;
					tv.canal--);
			tv.canal--;
		}
	}
	
	public void volumenUp() {
		if (tv.estado == true) {
			for (tv.volumen = 1; 
					tv.volumen <= 7;
					tv.volumen++);
					tv.volumen++;
		}
	}

	public void volumenDown() {
		if (tv.estado == true) {
			for (tv.volumen = 1; 
					tv.volumen <= 7;
					tv.volumen--);
					tv.volumen--;
		}
	}
}
