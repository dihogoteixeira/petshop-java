package PetShop;

import javax.swing.*;

public class clientePetShop {

    public static void main(String[] args) {

        // Entrada de dados do Cliente

        PetShop cliente_01 = new PetShop();
        String nome = JOptionPane.showInputDialog(null ,"Nome do seu Pet:", "..:: Detalhes do pedido ::.. ", 1);
        cliente_01.setNomeDoAnimal(nome);
        String porte = JOptionPane.showInputDialog(null ,"Porte do animal [Pequeno, Médio ou Grande]", "..:: Detalhes do pedido ::.. ", 1);
        cliente_01.setPorteDoAnimal(porte);
        String tipo = JOptionPane.showInputDialog(null ,"Tipo do animal [Cachorro, Gato ou Outros]", "..:: Detalhes do pedido ::.. ", 1);
        cliente_01.setTipoDoAnimal(tipo);
        cliente_01.getExaminar();

        // JOptionPane.showMessageDialog

        cliente_01.detalhesDoPedido(); // total R$210
    }
}
