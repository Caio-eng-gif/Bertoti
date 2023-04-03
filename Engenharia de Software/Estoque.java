package Estoque;

import java.util.LinkedList;
import java.util.List;

public class Estoque {
	
	
	private List <Camiseta> camisetas = new LinkedList<Camiseta>();
	
	public void addCamisetas (Camiseta Novascamisetas) {
		camisetas.add (Novascamisetas);
		
	}
	public List<Camiseta> buscarCamisetaPorTamanho(String tamanho){
        List<Camiseta> encontrados = new LinkedList<Camiseta>();
        for (Camiseta camiseta:camisetas){
            if (camiseta.getTamanho().equals(tamanho))
                encontrados.add(camiseta);
        }
        return encontrados;
    }

}