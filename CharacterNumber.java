//wap to check whether the number is character or number or zero

package test.java;
import java.util.*;

public class CharacterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		char ch = 0;
		int num;
		System.out.println("enter the number or character: ");
		ch=sc.next().charAt(ch);
		int asc = (int)ch;
		
		if(asc>=49 && asc<=58){
			System.out.println(ch+" is a digit");
		}
		else if(asc>=65 && asc<=123){
			System.out.println(ch+" is a character value");
		}
		else if(asc==48){
			System.out.println(ch+" is zero");
		}
		
	}

}
