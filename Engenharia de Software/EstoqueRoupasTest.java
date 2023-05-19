package EstoqueDeRoupas;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.table.DefaultTableModel;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstoqueRoupasTest {
    private DefaultTableModel model;
    private EstoqueRoupas estoque;

    @BeforeEach
    public void setUp() {
        model = new DefaultTableModel();
        model.addColumn("Camisetas");
        model.addColumn("Tamanho");
        model.addColumn("Calças");
        model.addColumn("Tamanho");
        model.addColumn("Bermudas");
        model.addColumn("Tamanho");

        model.addRow(new Object[]{"Jeans", "G", "Jeans", "42", "Jeans", "M"});
        model.addRow(new Object[]{"Regata", "P", "Moletom", "38", "Téctel", "G"});
        model.addRow(new Object[]{"Gola V", "GG", "Sarja", "40", "Jeans", "P"});

        estoque = new EstoqueRoupas();
        estoque.setModel(model);
    }

    @Test
    public void testQuantidadeColunas() {
        assertEquals(6, model.getColumnCount(), "A quantidade de colunas está incorreta");
    }

    @Test
    public void testValoresAdicionados() {
        assertEquals("Jeans", model.getValueAt(0, 0), "Valor incorreto na célula (0, 0)");
        assertEquals("G", model.getValueAt(0, 1), "Valor incorreto na célula (0, 1)");
        assertEquals("Jeans", model.getValueAt(0, 2), "Valor incorreto na célula (0, 2)");
        assertEquals("42", model.getValueAt(0, 3), "Valor incorreto na célula (0, 3)");
        assertEquals("Jeans", model.getValueAt(0, 4), "Valor incorreto na célula (0, 4)");
        assertEquals("M", model.getValueAt(0, 5), "Valor incorreto na célula (0, 5)");

        assertEquals("Regata", model.getValueAt(1, 0), "Valor incorreto na célula (1, 0)");
        assertEquals("P", model.getValueAt(1, 1), "Valor incorreto na célula (1, 1)");
        assertEquals("Moletom", model.getValueAt(1, 2), "Valor incorreto na célula (1, 2)");
        assertEquals("38", model.getValueAt(1, 3), "Valor incorreto na célula (1, 3)");
        assertEquals("Téctel", model.getValueAt(1, 4), "Valor incorreto na célula (1, 4)");
        assertEquals("G", model.getValueAt(1, 5), "Valor incorreto na célula (1, 5)");

        assertEquals("Gola V", model.getValueAt(2, 0), "Valor incorreto na célula (2, 0)");
        assertEquals("GG", model.getValueAt(2, 1), "Valor incorreto na célula (2, 1)");
        assertEquals("Sarja", model.getValueAt(2, 2), "Valor incorreto na célula (2, 2)");
        assertEquals("40", model.getValueAt(2, 3), "Valor incorreto na célula (2, 3)");
        assertEquals("Jeans", model.getValueAt(2, 4), "Valor incorreto na célula (2, 4)");
        assertEquals("P", model.getValueAt(2, 5), "Valor incorreto na célula (2, 5)");
    }
}