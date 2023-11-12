import java.util.Scanner;

import linked.ListaLigada;
import linked.No;
import list.EstruturaElementar;

public class Main {
    public static void main(String[] args) {
        No no = new No(10);
        System.out.println(no.getInfo());
        EstruturaElementar e = new ListaLigada();
        e.insereInicio(10);


        ListaLigada lista = new ListaLigada();
        lista.insereInicio(1);
        lista.insereInicio(0);
        int a = lista.buscaIndice(1);
        System.out.println(a);
        lista.insereElementoPosicao(10, 5);
    }
}
