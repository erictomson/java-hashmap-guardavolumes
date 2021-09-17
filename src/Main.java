// A SaveTheRoupa S.A. é uma empresa que deseja implementar um sistema
// informatizado de guarda-volumes de nível mundial. O sistema permite que uma
// pessoa guarde seus pertences no guarda-volumes e depois os retire de maneira
// simples, bastando apresentar o número de identificação recebido.
// Os pertences são representados no sistema por algo abstrato chamado peça ,
// que tem marca e modelo. Assim, se a pessoa perder o número, também poderia
// retirá-los com essas informações.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaVolumes guardaVolumes = new GuardaVolumes();

        // Na classe Main, criar um cenário em que alguém guarda duas peças,
        // recebe o código e depois retira suas peças.

        // Criando listas de peças
        List<Peca> lista = new ArrayList<>();
        List<Peca> lista2 = new ArrayList<>();

        // Criando e inicializando peças
        Peca peca1 = new Peca();
        peca1.setMarca("Hering");
        peca1.setModelo("Camiseta");
        Peca peca2 = new Peca();
        peca2.setMarca("Hering");
        peca2.setModelo("Bermuda");
        Peca peca3 = new Peca();
        peca3.setMarca("Hering");
        peca3.setModelo("Top");
        Peca peca4 = new Peca();
        peca4.setMarca("Hering");
        peca4.setModelo("Saia");

        // Adicionando peças às listas
        // Lista de Peças 1
        lista.add(peca1);
        lista.add(peca2);
        // Lista de Peças 2
        lista2.add(peca3);
        lista2.add(peca4);

        // Guardando peças gerando uma chave de controle
        System.out.println("Chave: " + guardaVolumes.guardarPecas(lista));
        System.out.println("Chave: " + guardaVolumes.guardarPecas(lista2));

        // Mostrar todas as pecas do guarda volumes
        guardaVolumes.mostrarPecas();
        // Mostrar somente as pecas do guarda volumes com a chave 1
        guardaVolumes.mostrarPecas(1);
        // Mostrar somente as pecas do guarda volumes com a chave 2
        guardaVolumes.mostrarPecas(2);

        System.out.println("Removendo peça");
        guardaVolumes.devolverPecas(1);
        System.out.println("Peças guardadas");
        guardaVolumes.mostrarPecas();
    }
}
