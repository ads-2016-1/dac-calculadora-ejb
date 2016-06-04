/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.web;

import br.edu.ifpb.dac.shared.Calculadora;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jederson
 */

@Named
@RequestScoped
public class ControladorCalculadora{
    
    @EJB
    private Calculadora calculadora;
    
    private int a;
    private int b;
    private int resultado;
    
    public String somar(){
        resultado = calculadora.somar(a, b);
        return null;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
}
