package capituloquatro;

import java.util.Scanner;

public class ExercicioCincoCapQuatro {

	public static void main(String[] args) {
		int num1, num2, num3, num4;
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Digite três números em ordem crescente: ");
		num1 = entrada.nextInt();		
		num2 = entrada.nextInt();		
		num3 = entrada.nextInt();		
		
		System.out.println("Digite um número (fora de ordem): ");
		
		num4 = entrada.nextInt();		
		
		if (num4 > num3)
   		System.out.println("A ordem decrescente dos números é: "+num4+" - "+num3+" - "+num2+" - "+num1);
		if (num4 > num2 && num4<num3)
   		System.out.println("A ordem decrescente dos números é: "+num3+" - "+num4+" - "+num2+" - "+num1);
		if (num4 > num1 && num4 < num2)
   		System.out.println("A ordem decrescente dos números é: "+num3+" - "+num2+" - "+num4+" - "+num1);
		if (num4 < num1)
   		System.out.println("A ordem decrescente dos números é: "+num3+" - "+num2+" - "+num1+" - "+num4);	

	}

}
