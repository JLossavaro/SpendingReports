/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jclos
 */
public class Despesa implements Serializable {

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    private String data;
    private double valor;

    public Despesa(String data, double valor) {
        this.data = data;
        this.valor = valor;
    }



}
