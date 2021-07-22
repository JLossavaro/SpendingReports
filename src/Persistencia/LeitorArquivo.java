/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Classes.DespesasObjeto;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.io.ObjectInputStream;

/**
 *
 * @author jclos
 */
public class LeitorArquivo {

    public DespesasObjeto lerConfig() {

        File f = new File("./despesas.dat"); //Atribui o caminho das configurações a um File
        if (f.exists() && !f.isDirectory()) {

            ObjectInputStream inp;
            try {
                inp = new ObjectInputStream(new FileInputStream("./despesas.dat"));
                DespesasObjeto despesas = (DespesasObjeto) inp.readObject();
                inp.close();
                return despesas;
            } catch (IOException ex) {

            } catch (ClassNotFoundException ex) {

            }

        }
        DespesasObjeto despesas = new DespesasObjeto();
        return despesas;
    }
}
