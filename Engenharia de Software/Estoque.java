import java.util.LinkedList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new LinkedList<Produto>();

    public void addProduto(Produto prod){
        produtos.add(prod);
    }

    public List<Produto> buscarProdutoPorNome(String nome){
        List<Produto> produtosEncontrados = new LinkedList<Produto>();
        for (Produto produto:produtos){
            if(produto.getNome().equals(nome)) produtosEncontrados.add(produto);
        }
        return produtosEncontrados;
    }

}
