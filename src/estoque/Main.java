package estoque;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter product data");
		System.out.print("Enter name: ");
		String name = sc.nextLine(); // FAÇO A LEITURA DO NOME E GUARDO DENTRO DA VARIAVEL PRODUCT NO CAMPO NAME
		System.out.print("Price ");
		double price = sc.nextDouble();
		
		/*QUANDO EU INSTANCIEI UM CONTRUTOR COM ARGUMENTO EU OBRIGO O PROGRAMADOR A 
		  INFORMAR OS DADOS DO PRODUTO NO MOMENTO DA INSTANCIACAO DELE.*/
		
		Product product = new Product(name, price);
		//ATRIBUIR NO OBJETO PRODUCT NO CAMPO NAME UM NOVO NOME
		product.setName("Computador");
		product.setPrice(500.00);
		System.out.println("Update name: "+ product.getName());
		System.out.println("Updat price: "+product.getPrice());
		
		System.out.println();
		System.out.println("Product enter data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be add in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updata: " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be remove from stock: ");
		quantity = sc.nextInt();
		product.RemoveProductsQuantity(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
	}

} 
