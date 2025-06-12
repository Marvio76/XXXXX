package Questao03;

import Refatorando_02.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Saida {
    public static void main(String[] args) {
       Empresa f1 = new CLT1("João", true, 3000.0, 500.0);
       Empresa f2 = new CLT1("Ana", true, 3000.0, 700.0);
       Empresa f3 = new CLT1("MArvio",false, 2000.0,500.0 );
       PJ1 f4 = new PJ1("Julia", true, "Sistema de Estoque", 800.0);
       PJ1 f5 = new PJ1("Vale", true, "Sistema de Eletricidade", 900.0);

       f4.registrarProjeto("locadora", 3000.0);
        List<Double> novosProjetos = new ArrayList<>();
        novosProjetos.add(1500.0);
        novosProjetos.add(800.0);
        f4.registrarProjeto(novosProjetos);


        List<Empresa> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);

        for (Empresa f : funcionarios) {
            f.realizarPagamento();
        }

        Relatorio1.gerarRelatorio(funcionarios);

    }
}
