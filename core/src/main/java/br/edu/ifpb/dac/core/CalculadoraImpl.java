/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.core;

import br.edu.ifpb.dac.shared.Calculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author jederson
 */
@Stateless
@Remote(Calculadora.class)
public class CalculadoraImpl implements Calculadora{

    @Override
    public int somar(int a, int b) {
        return a+b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a*b;
    }
    
}
