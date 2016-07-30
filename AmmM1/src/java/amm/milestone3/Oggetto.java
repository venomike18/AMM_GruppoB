/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3;

/**
 *
 * @author medas
 */
public class Oggetto {

    private int id;
    private String nome;
    private String descrizione;
    private String img;
    private Integer quantita;
    private Double prezzo;
    private String categoria;

    /**
     * @return e @param id
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return e @param Nome
     */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return e @param Descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * @return e @param Immagine
     */
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return e @param Quantità
     */
    public Integer getQuantita() {
        return quantita;
    }
    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    /**
     * @return e @param Prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * @return e @param Categoria
     */
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
