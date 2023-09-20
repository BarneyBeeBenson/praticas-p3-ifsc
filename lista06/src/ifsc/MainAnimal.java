package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		Gato laranja = new Gato();
		laranja.Mia();
		laranja.setRaca("Sla");
		laranja.setComprimento (0.90f);
		laranja.setNpatas (4);
		laranja.setCor("Autoexplicativo");
		laranja.setEcossistema("Casa");
		
		Cachorro Rex = new Cachorro();
		Rex.Late();
		Rex.setRaca("ViraLata");
		Rex.setComprimento (0.70f);
		Rex.setNpatas (3);
		Rex.setCor("Malhado");
		Rex.setEcossistema("Rua");
		
		System.out.println(laranja.getRaca());
		System.out.println(laranja.getComprimento());
		System.out.println(laranja.getNpatas());
		System.out.println(laranja.getCor());
		System.out.println(laranja.getEcossistema());
		laranja.Mia();
		System.out.println(Rex.getRaca());
		System.out.println(Rex.getComprimento());
		System.out.println(Rex.getNpatas());
		System.out.println(Rex.getCor());
		System.out.println(Rex.getEcossistema());
		Rex.Late();
	}

}
