public class Car {
    public static void main(String[] args){
        // vamos criar nosso objeto, que vem da class Carros
        Carros carros = new Carros("BMW", "X6", 2024, 120_000);

        // trocar o modelo do X6 para X5
        carros.setModelo("X5");

        System.out.println(carros.getMarca());
        System.out.println(carros.getModelo());
        System.out.println(carros.getAno());
        System.out.println("Valor da venda final do carro é: R$ " + carros.valorVenda());
    }
}
