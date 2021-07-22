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
public class DespesaServico extends Despesa implements Serializable {

    private String cnpj;
    private String desc;

    public DespesaServico(String cnpj, String desc, String data, double valor) {
        super(data, valor);
        this.cnpj = cnpj;
        this.desc = desc;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
