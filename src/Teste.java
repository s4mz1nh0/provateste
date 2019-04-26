/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pandora(SSQ)
 */
public class Teste {
    public static void main(String[] args){
    
        Aluno a1 = new Aluno();
        a1.Nome = "Thais e Sam";
        a1.Cpf = 2;
        a1.Rg = 123456;

        Data d1 = new Data();
        d1.dia = 29;
        d1.mes = 03;
        d1.ano = 2019;
        a1.DatadeNascimento = d1;
        
        Aluno a2 = new Aluno();
        a2.Nome = "Sam e Thais";
        a2.Cpf = 1;
        a2.Rg = 654321;
        
        Data d2 = new Data();
        d2.dia = 02;
        d2.mes = 10;
        d2.ano = 2019;
        a2.DatadeNascimento = d2;
        
       
        Requerimento r = new Requerimento();
        r.aluno = a1;
        Data d3 = new Data();
        d3.dia = 14;
        d3.mes = 04;
        d3.ano = 2019;
        r.dataRequerimento = d3;
        r.descricao = "exemplo";
        a1.mostrar();
        a2.mostrar();
        r.informarTipo("Inserido novos usuarios");
        r.mostrar();

    }

    
}
