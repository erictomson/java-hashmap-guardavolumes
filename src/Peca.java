// Criar a classe abstrata Peça , que contenha as variáveis marca e modelo,
// ambas de tipo String e um método abstrato chamado retirada.
// Classe modificada para geral pois precisará ser instanciada
public class Peca {
    // Atributos da classe Peça
    private String marca;
    private String modelo;

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Imprimir dados da peça
    @Override
    public String toString() {
        return "marca=" + marca + ", modelo=" + modelo;
    }

    //public abstract void retirar();
}
