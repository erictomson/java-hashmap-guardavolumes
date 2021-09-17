// Criar a classe GuardaVolumes , que contenha como variável um dicionário
// e um contador que será utilizado como identificador. As chaves do
// dicionário serão Integer e, como valor, haverá uma lista de peças.

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GuardaVolumes {

    Map<Integer,List<Peca>>secoes = new HashMap<>();

    private Integer identificadorAtual = 0;

    // Criar o método public Integer guardarPecas(List<Peca> listaDePeca) na
    // Classe GuardaVolumes, que recebe uma lista de peças adiciona essa lista
    // de peças em nosso dicionário e retorna o número de identificação, ou seja,
    // a chave do dicionário onde guardamos as peças, que neste caso é o nosso
    // contador.
    public Integer guardarPecas(List<Peca> listaDePecas) {
        identificadorAtual+=1;
        secoes.put(identificadorAtual, listaDePecas);
        return identificadorAtual;
    }

    // Criar o método public void mostrarPecas() na Classe GuardaVolumes,
    // que imprime na tela todas as peças que estão no guarda-volumes, junto
    // com o número correspondente.
    public void mostrarPecas() {
        // Para cada chave em seções
        for(Integer chave: secoes.keySet()) {
            // Chamar a sobrecarga do método
            // para imprimir as peças, passando a chave
            mostrarPecas(chave);
        }
    }

    // Criar o método public void mostrarPecas(Integer numero) na Classe
    // GuardaVolumes, que imprima as peças que estão associadas ao número
    // recebido
    // Sobrecarga do método mostrarPecas
    public void mostrarPecas(Integer chave) {
        // Recuperar peças referentes a chave atual
        List<Peca> pecas = secoes.get(chave);
        // Mostrar chave atual e, em seguida, suas peças
        System.out.println("Chave: " + chave);
        // Imprimir as peças
        // Para cada peça na lista de peças, imprima
        int pecaAtual=0; // Controlar peça atual dentro da chave
        for(Peca peca: pecas) {
            pecaAtual++;
            System.out.println("Peca: " + pecaAtual);
            System.out.println(peca);
        }
    }

    // Criar o método public void devolverPecas(Integer numero) na Classe
    // GuardaVolumes, que remova a lista de peças que esta associada ao
    // número recebido.
    public void devolverPecas(Integer chave) {
        secoes.remove(chave);
    }

    // Getters e Setters do atributo identificador
    public Integer getIdentificador() {
        return identificadorAtual;
    }

    public void setIdentificador(Integer identificador) {
        this.identificadorAtual = identificador;
    }


}
