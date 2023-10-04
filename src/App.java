import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Peca peca = new Peca();
        peca.quantidadeEstoque = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o código da peça:");
        peca.codigo = teclado.nextInt();
        System.out.println("Digite o nome da peça:");
        peca.nome = teclado.next();
        System.out.println("Digite a  descrição da peça:");
        peca.descricao = teclado.next();
        System.out.println("Digite o preço unitário da peça:");
        peca.precoUnitario = teclado.nextDouble();
       


        System.out.println("código:" + peca.codigo);
        System.out.println("Nome:" + peca.nome);
        System.out.println("Descrição:" + peca.descricao);
        System.out.println("Preç Unitario:" + peca.precoUnitario);
        System.out.println("Quandidade em estoque:" + peca.quantidadeEstoque);

        System.out.println("Quantidade em estoqu:" + peca.quantidadeEstoque);
        System.out.println("Digitar a quantidade a ser adicionada ao estoque:");
        int quantidadeAdicionada = teclado.nextInt();
        System.out.println("Quandidade anterior: " + peca.alterarEstoque(quantidadeAdicionada));
        System.out.println("Quantidade atual: " + peca.quantidadeEstoque);
        System.out.println("Digitar a quantidade a ser retirada do estoque:");
        int quantidadeRetirada = teclado.nextInt();
        System.out.println("Quantidade anterior: " + peca.alterarEstoque(quantidadeRetirada));
        System.out.println("Quantidade atual: " + peca.quantidadeEstoque);


        teclado.close();




    }
}
