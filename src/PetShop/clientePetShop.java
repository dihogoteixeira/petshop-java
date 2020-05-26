package PetShop;

import javax.swing.*;

public class clientePetShop {

    public static void main(String[] args) {
        int cadastrarCliente = JOptionPane.showConfirmDialog(null, "Deseja cadastar um cliente?", ".: Cadastro de Cliente :.", JOptionPane.YES_NO_OPTION);
        if (cadastrarCliente == JOptionPane.YES_OPTION) {
            int i = 0;
            while (i<5){
                // Entrada de dados do Cliente

                PetShop idCliente = new PetShop();
                String nome = JOptionPane.showInputDialog(null, "Nome do seu Pet:", "..:: Detalhes do pedido ::.. ", 1);
                idCliente.setNomeDoAnimal(nome);
                String porte = JOptionPane.showInputDialog(null, "Porte do animal [Pequeno, Médio ou Grande]", "..:: Detalhes do pedido ::.. ", 1);
                idCliente.setPorteDoAnimal(porte);
                String tipo = JOptionPane.showInputDialog(null, "Tipo do animal [Cachorro, Gato ou Outros]", "..:: Detalhes do pedido ::.. ", 1);
                idCliente.setTipoDoAnimal(tipo);
                idCliente.getExaminar();

                // JOptionPane.showMessageDialog

                idCliente.detalhesDoPedido(); // total R$210
                i++;
            }
        }
    }
}
