/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3;

import java.util.ArrayList;

/**
 *
 * @author medas
 */
public class VenditoreFactory {

    private static VenditoreFactory singleton;
    
    //lista venditori
    private ArrayList<VenditoreClass> listaVenditori;

    public static VenditoreFactory getInstance() {
        if (singleton == null) {
            singleton = new VenditoreFactory();
        }
        return singleton;
    }

    private VenditoreFactory() {
        listaVenditori = new ArrayList();
        VenditoreClass seller1 = new VenditoreClass();
        seller1.setNome("Michele");
        seller1.setCognome("Medas");
        seller1.setUsername("mike");
        seller1.setPassword("juventus");
        seller1.setCodiceFiscale("MDSMHL90B24E281S");
        seller1.saldo = 333.5;
        listaVenditori.add(seller1);

        VenditoreClass seller2 = new VenditoreClass();
        seller2.setNome("Pavel");
        seller2.setCognome("Nedved");
        seller2.setUsername("pavel");
        seller2.setPassword("furiaceca");
        seller2.setCodiceFiscale("PVLNDV75C02B283V");
        seller2.saldo = 9999.9;
        listaVenditori.add(seller2);

        VenditoreClass seller3 = new VenditoreClass();
        seller3.setNome("David");
        seller3.setCognome("Trezeguet");
        seller3.setUsername("david");
        seller3.setPassword("france");
        seller3.setCodiceFiscale("DVDTZG88C22A283V");
        seller3.saldo = 731.2;
        listaVenditori.add(seller3);

    }

    public ArrayList<VenditoreClass> getVenditoriList() {
        return listaVenditori;
    }
}
