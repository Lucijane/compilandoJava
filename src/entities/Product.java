package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	//CONSTRUTOR EM JAVA GERALMENTEVEM DEPOIS DOS ATRIBUTOS
	// A PALAVRA PUBLIC E O NOME DA CLASSE E POSSO COLOCAR O PARAMETRO TBM 
	// SO NAO TER O TIPO DE RETORNO E É O QUE É EXECULTADO NO MOMENTO DA INSTANCIACAO DO MEU OBJETO
	
	public Product(String name, double price, int quantity) {//	OS MESMOS NOMES POR CONVENCAO
	//	EU VOU OBRIGAR A INICIAR COM OS ATRIBUTOS  NO MOMENTO DA INSTANCIAÇAO

		this.name = name;
		this.price= price;
		this.quantity = quantity;
		
	}
	
	//SOBRECARGA
	public Product(String name, double price) {

			this.name = name;
			this.price= price;
			//this.quantity = quantity; // COMO POR PADRAO O JAVA INICIA VALORES COM 0 ENTAO COLCOAR = A 0 É OPCIONAL
			
		}
	
	//pegar o nome
	
	public String getName() {// ELE N TEM PARAMETRO PQ ELE NAO VAI RECEBER NADA, 
			return name;
		
	}
	public double getPrice() {
		   return price;
	}
	
	public int getQuatity() { // CRIO SÓ O GET, PARA NAO ALTERAR NADA SÓ MUDA QUANDO TIVER ENTRADA E SAIDA E NAO PELO MEOTODO SET.
		return quantity;
		
	}
	public void setPrice(double price) {
		   this.price = price;
	}
	
	// alterar o nome
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double totalValueInStock() {
		return price * quantity;
		
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //this = palavra reservada para eu acessar o atributo da classe
	}
	
	public void RemoveProductsQuantity(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {// IMPLEMENTAR A MINHA VERSAP DO TOSTRING, ELE É CMANDO NA CLASSE MAIN
		return name + ", $ " + String.format(" %.2f ",price) +","+ quantity + " units, " + " $ "+ String.format("Total: %.2f", totalValueInStock());
		
		
	}
	
	}
