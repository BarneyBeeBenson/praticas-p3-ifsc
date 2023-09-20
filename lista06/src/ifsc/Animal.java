package ifsc;

public class Animal {

	
	public String getRaca() {
		return Raca;
	}
	public void setRaca(String raca) {
		Raca = raca;
	}
	public Float getComprimento() {
		return Comprimento;
	}
	public void setComprimento(Float comprimento) {
		Comprimento = comprimento;
	}
	public Integer getNpatas() {
		return Npatas;
	}
	public void setNpatas(Integer npatas) {
		Npatas = npatas;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getEcossistema() {
		return Ecossistema;
	}
	public void setEcossistema(String ecossistema) {
		Ecossistema = ecossistema;
	}
	private String Raca;
	private Float Comprimento;
	private Integer Npatas;
	private String Cor;
	private String Ecossistema;
	public void caminha() {}

}

