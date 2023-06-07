/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fudbalskiklubovi.a9;

import java.net.URL;

/**
 *
 * @author Korisnik
 */
class KlubDO {

    String naziv;
    StadionDO stadion;
    URL sajt;
    String amblem;
    int ID;

    @Override
    public String toString() {
        return  naziv;
    }
    
}
