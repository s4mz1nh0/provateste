/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pandora(SSQ)
 */
public class Requerimento {

    Data dataRequerimento;
    Aluno aluno;
    String descricao;
    
    void mostrar(){
    System.out.println(dataRequerimento);
    System.out.println(aluno);
    System.out.println(descricao);
    }
    
    void informarTipo(String S){
    this.descricao = S;
    }

    
}
