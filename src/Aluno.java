/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pandora(SSQ)
 */
public class Aluno {
    String Nome;
    int Cpf;
    int Rg;
    Data DatadeNascimento;
    
    void mostrar(){
    System.out.println(Nome);
    System.out.println(Cpf);
    System.out.println(Rg);
    DatadeNascimento.mostrar();
    //System.out.println(DatadeNascimento.dia+"/"+DatadeNascimento.mes+"/"+DatadeNascimento.ano);
    }
}
