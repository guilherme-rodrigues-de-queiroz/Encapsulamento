public class Carros {
    // criar nossos atributos
    private String marca;
    private String modelo;
    private int ano;
    private int valor;

    // criamos nosso construtor para depois associarmos e os objetos
    Carros(String marca, String modelo, int ano, int valor){
        this.marca = marca; // apontamento de um parâmetro a um atributo, utilizo this
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public double valorVenda(){
        double valorFinal = (valor * 0.1) + valor;
        return valorFinal;
    }

    // vamos criar um novo comportamento(método) sendo "ele" uma string
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
