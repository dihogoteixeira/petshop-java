package PetShop;

import javax.swing.*;
import java.io.Serializable;

public class PetShop extends Animal implements Serializable {

    // Atributos

    private double vacinar;
    private double banhar;
    private double examinar = 70;
    private double total;
    private Animal animal;

    // Métodos

    public void detalhesDoPedido(){
        JOptionPane.showMessageDialog(null,
                "Pet Nome: "+getNomeDoAnimal()+
                        "\nPorte do Pet: "+getPorteDoAnimal()+
                        "\nTipo do Pet: "+getTipoDoAnimal()+
                        "\nTotal: R$ "+this.total, "..:: Detalhes do pedido ::.. ",1);
    }

    public double totalDoCliente(){
        setTotal(examinar + vacinar + banhar);
        return this.total;
    }

    public void realizarBanho() {
        int confirmarBanho = JOptionPane.showConfirmDialog(null, "Deseja dar Banho em seu Pet?", ".: Banho :.", JOptionPane.YES_NO_OPTION);
        if (confirmarBanho == JOptionPane.YES_OPTION) {
            if (getPorteDoAnimal().toUpperCase().equals("PEQUENO")) {
                setBanhar(40);
            } else if (getPorteDoAnimal().toUpperCase().equals("MEDIO")) {
                setBanhar(50);
            } else if (getPorteDoAnimal().toUpperCase().equals("GRANDE")) {
                setBanhar(60);
            } else {
                setBanhar(0);
            }
        }
    }


    public void vacinarAnimal() {
        int confirmarVacina = JOptionPane.showConfirmDialog(null, "Deseja Vacinar seu Pet?", ".: Vacina :.", JOptionPane.YES_NO_OPTION);
        if (confirmarVacina == JOptionPane.YES_OPTION) {
            if (getTipoDoAnimal().toUpperCase().equals("CACHORRO") || getTipoDoAnimal().toUpperCase().equals("GATO")) {
                setVacinar(100);
            } else if (getTipoDoAnimal().toUpperCase().equals("OUTROS")){
                setVacinar(150);
            } else {
                setVacinar(0);
            }
        }
    }

    // Geters and Setters

    public double getVacinar() {
        return vacinar;
    }

    public void setVacinar(double vacinar) {
        this.vacinar = vacinar;
    }

    public double getBanhar() {
        return banhar;
    }

    public void setBanhar(double banhar) {
        this.banhar = banhar;
    }

    public double getExaminar() {
        realizarBanho();
        vacinarAnimal();
        totalDoCliente();
        return examinar;
    }

    public void setExaminar(double examinar) {
        this.examinar = examinar;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
