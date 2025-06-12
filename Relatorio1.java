package Questao03;

import java.util.List;

public class Relatorio1 {
    public static void gerarRelatorio(List<Empresa> lista) {
        System.out.println("Relatório:");
        for (Empresa f : lista) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: R$ " + f.calculandoSalario());
            System.out.println("Ativo: " + f.getAtivo());
            System.out.println();
        }
    }
}
