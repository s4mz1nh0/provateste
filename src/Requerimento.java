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
    System.out.println(dataRequerimento.dia+"/"+dataRequerimento.mes+"/"+dataRequerimento.ano);
    //System.out.println(aluno.Nome+" "+aluno.Cpf+" "+aluno.Rg+" "+aluno.DatadeNascimento.dia+"/"+aluno.DatadeNascimento.mes+"/"+aluno.DatadeNascimento.ano);
    aluno.mostrar();
    System.out.println(descricao);
    }
    
    void informarTipo(String S){
    this.descricao = S;
    }

    
}
