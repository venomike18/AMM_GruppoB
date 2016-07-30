/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3;

import java.util.ArrayList;

public class ClienteFactory {
    private static ClienteFactory singleton;
    //lista clienti
    ArrayList<ClienteClass> listaClienti = new ArrayList();

    public static ClienteFactory getInstance() {
        if (singleton == null) {
            singleton = new ClienteFactory();
        }
        return singleton;
    }

    //Dati clienti
    private ClienteFactory() {
        ClienteClass cliente1 = new ClienteClass();
        cliente1.setNome("Michele");
        cliente1.setCognome("Medas");
        cliente1.setDataNascita("24/02/1990");
        cliente1.setCodiceFiscale("MDSMHL90B24E281S");
        cliente1.setUsr("michelemedas");
        cliente1.setPsw("sabatodipioggia");
        cliente1.setSaldo(1000000.0);
        listaClienti.add(cliente1);

        ClienteClass cliente2 = new ClienteClass();
        cliente2.setNome("Ace");
        cliente2.setCognome("Ventura");
        cliente2.setDataNascita("11/08/1975");
        cliente2.setCodiceFiscale("ACVNTR75B08S11L");
        cliente2.setUsr("ace");
        cliente2.setPsw("spumeggiante");
        cliente2.setSaldo(100.0);
        listaClienti.add(cliente2);

        ClienteClass cliente3 = new ClienteClass();
        cliente3.setNome("Alex");
        cliente3.setCognome("DelPiero");
        cliente3.setDataNascita("09/11/1975");
        cliente3.setCodiceFiscale("ALSDLP55B112B33");
        cliente3.setUsr("capitano");
        cliente3.setPsw("campioniditalia");
        cliente3.setSaldo(999999.0);
        listaClienti.add(cliente3);
    }

    public ArrayList<ClienteClass> getClientiList() {
        return listaClienti;
    }

}
