import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int evenSum=0,oddSum=0;
		while(n!=0){
			int rem=n%10;
			if(rem%2==0){
				evenSum +=rem;
			}else{
				oddSum +=rem;
			}
			n/=10;
		}
		System.out.println(evenSum + " " +oddSum);


	}
}
