import java.util.Scanner;
public class MayorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num == num2) {
			System.out.println("son iguales");
		} else {
		System.out.println(Math.max(num, num2));
		}

	}

}
