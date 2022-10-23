
public class Teste {
	
	public static void main(String[] args) {
		
		
		Conta contaDoDani = new Conta();
		Cliente dani = new Cliente();
		
		Conta contaDaBela = new Conta();
		Cliente bela = new Cliente();
		
		contaDaBela.setTitular(bela);
		contaDaBela.getTitular().setNome("bela");
		
		
		contaDoDani.setTitular(dani);
		contaDoDani.getTitular().setNome("Dani");
	
		contaDoDani.setAgencia(256);
		contaDoDani.setNumero(010101);
		contaDoDani.setSaldo(1000);
		
		
		
		contaDoDani.transfere(500, contaDaBela);
		contaDaBela.saca(499);
		
		System.out.println(contaDoDani.getTitular().getNome());
		System.out.println(contaDoDani.getSaldo());
		
		System.out.println(contaDaBela.getTitular().getNome());
		System.out.println(contaDaBela.getSaldo());
	}

}
