public class Peca {
    public int codigo;
    public String nome;
    public String descricao;
    public double precoUnitario;
    public int quantidadeEstoque;
    


    public int aumentaEstoque(int quantidade){
        int quantidadeAnterior = quantidadeEstoque; 
        quantidadeEstoque = quantidadeEstoque + quantidade;
        return quantidadeAnterior;
    }


   

}
