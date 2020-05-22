package PetShop;

import java.io.Serializable;

public class Animal implements Serializable {

    // Atributos

    private String nomeDoAnimal;
    private String porteDoAnimal;
    private String tipoDoAnimal;

    // Geters and Setters

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public String getPorteDoAnimal() {
        return porteDoAnimal;
    }

    public void setPorteDoAnimal(String porteDoAnimal) {
        this.porteDoAnimal = porteDoAnimal;
    }

    public String getTipoDoAnimal() {
        return tipoDoAnimal;
    }

    public void setTipoDoAnimal(String tipoDoAnimal) {
        this.tipoDoAnimal = tipoDoAnimal;
    }
}
