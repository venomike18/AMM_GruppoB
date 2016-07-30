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
public class Saldo {
    private Double saldo;
    Saldo(Double saldo) {
        this.saldo = saldo;
    }

    
    /**
     * @return e @Param Saldo disponibile
     */
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
