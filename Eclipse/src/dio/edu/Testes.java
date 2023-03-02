package dio.edu;


import dio.edu.Gato;

public class Testes {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Jeremy", "Pardo", 2);
		System.out.println(gato.getCor());
		System.out.println(gato.getNome());
		System.out.println(gato.getIdade());
		

	}

}
