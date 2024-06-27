package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
 public static void main(String[] args) {
	imprimirSelecionados();
}
  static void imprimirSelecionados() {
	  String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO" };
	  System.out.println("Imprimindo a lista de candidatos infromando o indice do elemento");
  
	  for (int indice=0; indice < candidatos.length;indice++) {
		  System.out.println("o candidato de nº " + (indice+1) + " é o "+ candidatos[indice] );
	  }
  }
 static void selecaoCandidatos() {
	 String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JONAS"};
	 
	 int candidatosSelecionados = 0;
	 int candidatosAtual = 0;
	 double salarioBase=2000.0;
	 while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length ) {
		 String candidato = candidatos[candidatosAtual];
		 double salarioPretendido = valorPretendido();
		 
		 System.out.println("O candidato "+candidato+" Solicitou este valor de salário " + salarioPretendido);
		 if (salarioBase >= salarioPretendido) {
			 System.out.println("o candidato "+ candidato+" foi selecionado para a vaga.");
			 candidatosSelecionados++;
		 }
		 candidatosAtual++;
	 }
 }
 static double valorPretendido() {
	 return ThreadLocalRandom.current().nextDouble(1800, 2200);
 }
 static void analisarCandidato(double salarioPretendido) {
	 double salarioBase = 2000.0;
	 if(salarioBase > salarioPretendido) {
		 System.out.println("Ligar para o candidato");
		 
	 } else if (salarioBase==salarioPretendido) {
		 System.out.println("ligar para o candidato com contra proposta");
	 }else {
		 System.out.println("Aguardando o resultado dos demais candidatos");
	 }
	 
 }
}
