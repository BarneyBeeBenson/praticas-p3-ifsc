package ifsc;

public class Smartphone extends Produto {
	private String dimensoesTela;
	private boolean xiaomi;
	public String getDimensoesTela() {
		return dimensoesTela;
	}
	public void setDimensoesTela(String dimensoesTela) {
		this.dimensoesTela = dimensoesTela;
	}
	public boolean isXiaomi() {
		return xiaomi;
	}
	public void setXiaomi(boolean xiaomi) {
		this.xiaomi = xiaomi;
	}
}
