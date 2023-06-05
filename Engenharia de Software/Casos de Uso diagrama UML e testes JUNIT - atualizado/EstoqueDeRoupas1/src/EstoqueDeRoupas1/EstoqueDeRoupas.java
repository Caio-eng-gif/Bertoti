package EstoqueDeRoupas1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class EstoqueDeRoupas {

    public static void main(String[] args) {
        // Cria um modelo para a tabela
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Camisetas");
        model.addColumn("Tamanho");
        model.addColumn("Calças");
        model.addColumn("Tamanho");
        model.addColumn("Bermudas");
        model.addColumn("Tamanho");

        // Adiciona alguns itens de estoque ao modelo
        model.addRow(new Object[]{"Jeans", "G", "Jeans", "42", "Jeans", "M"});
        model.addRow(new Object[]{"Regata", "P", "Moletom", "38", "Téctel", "G"});
        model.addRow(new Object[]{"Gola V", "GG", "Sarja", "40", "Jeans", "P"});

        // Cria a tabela com o modelo
        JTable tabelaEstoque = new JTable(model);

        // Define o tamanho preferido das colunas
        TableColumn col1 = tabelaEstoque.getColumnModel().getColumn(0);
        col1.setPreferredWidth(400);

        TableColumn col2 = tabelaEstoque.getColumnModel().getColumn(1);
        col2.setPreferredWidth(400);

        TableColumn col3 = tabelaEstoque.getColumnModel().getColumn(2);
        col3.setPreferredWidth(400);

        TableColumn col4 = tabelaEstoque.getColumnModel().getColumn(3);
        col4.setPreferredWidth(400);

        TableColumn col5 = tabelaEstoque.getColumnModel().getColumn(4);
        col5.setPreferredWidth(400);

        TableColumn col6 = tabelaEstoque.getColumnModel().getColumn(5);
        col6.setPreferredWidth(400);

        // Cria um painel para a tabela com barra de rolagem
        JScrollPane scrollPane = new JScrollPane(tabelaEstoque);

        // Cria o layout principal e adiciona o painel da tabela
        JPanel panel = new JPanel();
        panel.add(scrollPane);

        // Cria a janela e adiciona o layout principal
        JFrame frame = new JFrame("Estoque de Roupas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);
    }

	public void setModel(DefaultTableModel model) {
		// TODO Auto-generated method stub
		
	}
}
