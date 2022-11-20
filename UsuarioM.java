package ProjetoLoja;

public class UsuarioM {
     //simulação de banco de dados onde guardamos informações dos usuarios
	public static void main(String[] args) {
	Usuario u1 = new Usuario();
		
		u1.nome = "Maria";
		u1.CPF = 12323445634l;
		u1.idade = 24;
		u1.email = "mariajose@gmail.com";
		u1.saldo = 405.54f;
		
	    Usuario u2 = new Usuario();
		
		u2.nome = "Pedro";
		u2.CPF = 12309090932l;
		u2.idade = 19;
		u2.email = "pedro12@gmail.com";
		u2.saldo = 120.90f;
		
		Usuario u3 = new Usuario();
		
		u3.nome = "Ana Beatriz";
		u3.CPF = 21356723456l;
		u3.idade = 34;
		u3.email = "aninha123@gmail.com";
		u3.saldo = 1523.90f;
		
		
	}

}
