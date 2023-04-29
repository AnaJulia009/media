import java.util.Scanner;

//instrução1  Perguntar  ao usuário qual e a primeira nota
//instrução2  Guardar a primeira nota
//instrução3  Perguntar ao usuário a segunda nota
//instrução4  Guardar a segunda nota
//instrução5  Perguntar ao usuário a terceira nota 
//instrução6  Guardar a terceira nota
//instrução7  Perguntar ao usuário a quarta  nota
//instrução8  Guardar a quarta nota
//instrução9  Somar todas as notas
//instrução10 Dividiro total pela quantidade de notas
//instrução11 Printar para o usuário o resultado
//...

class Media {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
			  Double nota1;
			  Double nota2;
			  Double nota3;
			  Double nota4;
			  Double Soma;
			  Double media;
			 
            System.out.printf("Digite a nota do primeiro bimestre:\n");
            nota1 = teclado.nextDouble();
			
			System.out.printf("Digite a nota do segundo bimestre:\n"); 
			nota2 = teclado.nextDouble();
			
			System.out.printf("Digite a nota do terceiro bimestre:\n"); 
			nota3 = teclado.nextDouble();
			
			System.out.printf("Digite a nota do quarto bimestre:\n"); 
			nota4 = teclado.nextDouble();
			//instrução6
			Soma = nota1 + nota2 + nota3 + nota4 ; 
			
			media = Soma / 4;
	
    		System.out.printf(" A média do aluno com as notas informadas e:%f\n", media); 

    		System.exit(0);
		
	}

}
