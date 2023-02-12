package principal;

import java.util.Scanner;

import entities.Produto;
import repositories.ProdutoRepository;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n *** CADASTRO DE PRODUTOS *** \n");
		
		Scanner scanner = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.print("Digite o id do produto: ");
		produto.setIdProduto(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Digite o nome do produto: ");
		produto.setNome(scanner.nextLine());
		
		System.out.print("Digite a descrição do produto: ");
		produto.setDescricao(scanner.nextLine());
		
		System.out.print("Digite o preço do produto: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));
		
		System.out.print("Digite a quantidade do produto: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));
		
		scanner.close();
		
		try {
			ProdutoRepository produtoRepository = new ProdutoRepository();
			produtoRepository.exportar(produto);
			
			System.out.println("\nPRODUTO CADASTRADO COM SUCESSO!");
			System.out.println("ID.........: " + produto.getIdProduto());
			System.out.println("NOME.......: " + produto.getNome());
			System.out.println("DESCRICAO..: " + produto.getDescricao());
			System.out.println("PRECO......: " + produto.getPreco());
			System.out.println("QUANTIDADE.: " + produto.getQuantidade());
		}
		catch(Exception e) {
			
			System.out.println("\nFALHA AO CADASTRAR PRODUTO.");
			e.printStackTrace();
			
		}
	}

}
