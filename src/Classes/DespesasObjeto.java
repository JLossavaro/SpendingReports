/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jclos
 */
public class DespesasObjeto implements Serializable{

    private ArrayList<Despesa> despesa = new ArrayList<Despesa>();

    public DespesasObjeto() {
    }

    public ArrayList<Despesa> getDespesa() {
        return despesa;
    }

}
