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



public class OggettoFactory {
    private static OggettoFactory singleton;
    public static OggettoFactory getInstance() {
        if (singleton == null) {
            singleton = new OggettoFactory();
        }
        return singleton;
    }
    
    //lista Birre in vendita
    ArrayList<Oggetto> listaOggetti = new ArrayList();
    
    //Dati birre
    public OggettoFactory(){
        Oggetto obj1 = new Oggetto();
        obj1.setCategoria("Birre Artigianali Rubiu");
        obj1.setId(1);
        obj1.setNome("Birra Triga");
        obj1.setDescrizione("È una Bière Blanche dal basso tenore alcolico, Gradazione alcolica 7%, temp 6-8° C");
        obj1.setImg("img/Birrificio_Rubiu/Birra_Artigianale_Triga.jpg");
        obj1.setPrezzo(25);
        obj1.setQuantita(10);
        listaOggetti.add(obj1);
        
        Oggetto obj2 = new Oggetto();
        obj2.setCategoria("Birre Artigianali Rubiu");
        obj2.setId(2);
        obj2.setNome("Birra Lido");
        obj2.setDescrizione("È una birra chiara, semplice nella ricetta, ma articolata nel gusto, una Golden Ale, Gradazione alcolica 6%, temp 6-8° C");
        obj2.setImg("img/Birrificio_Rubiu/Birra_Artigianale_Lido.jpg");
        obj2.setPrezzo(25.50);
        obj2.setQuantita(10);
        listaOggetti.add(obj2);
        
        Oggetto obj3 = new Oggetto();
        obj3.setCategoria("Birre Artigianali Rubiu");
        obj3.setId(3);
        obj3.setNome("Birra Rais");
        obj3.setDescrizione("È una birra colore rubino, una English Ale decisa e luppolata, dolce e caramellata, Gradazione alcolica 8%, temp 6-8° C");
        obj3.setImg("img/Birrificio_Rubiu/Birra_Artigianale_Rais.jpg");
        obj3.setPrezzo(28.30);
        obj3.setQuantita(15);
        listaOggetti.add(obj3);
        
        Oggetto obj4 = new Oggetto();
        obj4.setCategoria("Birre Artigianali Rubiu");
        obj4.setId(4);
        obj4.setNome("Birra Flavia");
        obj4.setDescrizione("È una Golden Strong Ale chiara, alcolica, complessa e appagante, Gradazione alcolica 8%, temp 6-8° C");
        obj4.setImg("img/Birrificio_Rubiu/Birra_Artigianale_Flavia.jpg");
        obj4.setPrezzo(29.90);
        obj4.setQuantita(17);
        listaOggetti.add(obj4);
        
        Oggetto obj5 = new Oggetto();
        obj5.setCategoria("Birre Artigianali Rubiu");
        obj5.setId(5);
        obj5.setNome("Birra Moresca");
        obj5.setDescrizione("Moresca è una Belgian Dark Ale color testa di moro, dal gusto avvolgente di frutta secca, caramello e dalle note di cacao. Gradazione alcolica 8%, temp 6-8° C ");
        obj5.setImg("img/Birrificio_Rubiu/Birra_Artigianale_Moresca.jpg");
        obj5.setPrezzo(14);
        obj5.setQuantita(19);
        listaOggetti.add(obj5);
        
    }

    public ArrayList<Oggetto> getOggettoList() {
        return listaOggetti;
    }
    
    	public Oggetto getOggettoById(int id){
        for(Oggetto obj : getOggettoList()){
            if(obj.getId() == id)
                return obj;
        }
        return null;
    }

}