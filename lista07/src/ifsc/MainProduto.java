package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<String> pecas = new ArrayList<>();

		Desktop setup = new Desktop();
		setup.setCodBarras(6777564l);
		setup.setGamer(false);
		setup.setNome("Ricardo");
		pecas.add("Placa de video");
		pecas.add("Cooler");
		pecas.add("Processador");
		pecas.add("Ram");
		pecas.add("Outra Ram");
		setup.setPecas(pecas);
		
		ArrayList<String> pecas1 = new ArrayList<>();
		Desktop setup2 = new Desktop();
		setup2.setCodBarras(1899752l);
		setup2.setGamer(true);
		setup2.setNome("Roberto");
		pecas1.add("Placa de video dahora");
		pecas1.add("Cooler frio");
		pecas1.add("Processador oposto de lento");
		pecas1.add("Ram média");
		pecas1.add("Outra Ram igualmente mediana");
		setup2.setPecas(pecas1);
		
		ArrayList<String> pecas2 = new ArrayList<>();
		Desktop setup3 = new Desktop();
		setup3.setCodBarras(1899752l);
		setup3.setGamer(true);
		setup3.setNome("Gonzales");
		pecas2.add("Placa de video potente");
		pecas2.add("Cooler glacial");
		pecas2.add("Processador sinônimo de luz");
		pecas2.add("Ram POW");
		pecas2.add("Outra Ram PAW irmã da POW");
		setup3.setPecas(pecas2);
		
		ArrayList<Desktop> setups = new ArrayList<>();
		setups.add(setup);
		setups.add(setup2);
		setups.add(setup3);
		
		Smartphone iphoneXXVIX = new Smartphone();
		iphoneXXVIX.setCodBarras(9457362l);
		iphoneXXVIX.setNome("iphoneXXVIX");
		iphoneXXVIX.setDimensoesTela("6 por 4");
		iphoneXXVIX.setXiaomi(false);
		
		Smartphone xiaomilinchingVV = new Smartphone();
		xiaomilinchingVV.setCodBarras(2109190l);
		xiaomilinchingVV.setNome("xiaomilinchingVV");
		xiaomilinchingVV.setDimensoesTela("3 por 4");
		xiaomilinchingVV.setXiaomi(true);
		
		Smartphone motoroll2018 =  new Smartphone();
		motoroll2018.setCodBarras(424954l);
		motoroll2018.setNome("motoroll2018");
		motoroll2018.setDimensoesTela("4 por 4");
		motoroll2018.setXiaomi(false);
		
		ArrayList<Smartphone> phones = new ArrayList<>();
		phones.add(iphoneXXVIX);
		phones.add(motoroll2018);
		phones.add(xiaomilinchingVV);
		
		for (Desktop i : setups) {
			System.out.println(i.getNome());
			System.out.println(i.getCodBarras());
			System.out.println(i.getGamer());
			System.out.println(i.getPecas());
		}
		
		for (Smartphone i : phones) {
			System.out.println(i.getNome());
			System.out.println(i.getCodBarras());
			System.out.println(i.getXiaomi());
			System.out.println(i.getDimensoesTela());
		}
		
		
				
	}

}
