/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author jclos
 */
public class DespesaProduto extends Despesa implements Serializable {

    private String desc;
    private String cnpj;
    private int qtd;


    public DespesaProduto(String desc, String cnpj, String data, double valor, int qtd) {
        super(data, valor);
        this.desc = desc;
        this.cnpj = cnpj;
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public String getDesc() {
        return desc;
    }

    public String getCnpj() {
        return cnpj;
    }

}
