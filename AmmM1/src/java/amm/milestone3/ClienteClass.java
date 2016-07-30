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


/**
 * Modellazione dell'utente Cliente
 */
public class ClienteClass {

    public String nome;
    public String cognome;
    public String usr;
    public String psw;
    public String codiceFiscale;
    public String dataNascita;
    public Saldo saldo;

    /**
    * @return e @param nome
    */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    /**
    * @return e @param cognome
    */
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
    * @return e @param Username
    */
    public String getUsr() {
        return usr;
    }
    public void setUsr(String usr) {
        this.usr = usr;
    }
    
    /**
    * @return e @param Password
    */
    public String getPsw() {
        return psw;
    }
    public void setPsw(String psw) {
        this.psw = psw;
    }
    
    /**
    * @return e @param C.F.
    */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    
    /**
    * @return e @param Data di Nascita
    */
    public String getDataNascita() {
        return dataNascita;
    }
    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    /**
    * @return e @param Saldo disponibile
    */
    public Double getSaldo() {
        return saldo.getSaldo();
    }
    public void setSaldo(Double saldo) {
        this.saldo = new Saldo(saldo);
    }

}
