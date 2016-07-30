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
public class VenditoreClass {
    public String nome;
    public String cognome;
    public String username;
    public String password;
    public String codiceFiscale;
    public String dataNascita;
    public Double saldo;

    
    /**
    * @return e @param Saldo Nome
    */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /**
    * @return e @param Cognome
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
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    
    /**
    * @return e @param Password
    */
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
    * @return e @param Saldo
    */
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}

