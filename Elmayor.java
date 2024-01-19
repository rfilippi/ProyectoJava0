import java.util.*;
public class Elmayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa el Numero 1");
		
		n1=entrada.nextInt();
		
		System.out.println("Ingresa el Numero 2");
		
		n2=entrada.nextInt();		
		
		System.out.println("Ingresa el Numero 3");
		
		n3=entrada.nextInt();
		
		if(n1>n2) {
			if(n3>n1) {
				System.out.println(n3+" > "+n1+" > "+n2);
			}
			else if(n2>n3){
				System.out.println(n1+" > "+n2+" > "+n3);
			}
		}
		else if(n3>n2) {
			System.out.println(n3+" > "+n2+" > "+n1);
		}
		else if(n3>n1){
			System.out.println(n2+" > "+n3+" > "+n1);
		}
		else {
			System.out.println(n2+" > "+n1+" > "+n3);
		}

	}

}
