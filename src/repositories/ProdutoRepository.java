package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Produto;

public class ProdutoRepository {
	
	public void exportar(Produto produto) throws Exception {
		
		String path = "C:\\Temp\\produtos\\produto.txt";
		
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File(path), true));
		
		printWriter.write("\n\nDADOS DO PRODUTO:");
		printWriter.write("\nID.........: " + produto.getIdProduto());
		printWriter.write("\nNOME.......: " + produto.getNome());
		printWriter.write("\nDESCRICAO..: " + produto.getDescricao());
		printWriter.write("\nPRECO......: " + produto.getPreco());
		printWriter.write("\nQUANTIDADE.: " + produto.getQuantidade());
		
		printWriter.flush();
		printWriter.close();
	}
	
}
