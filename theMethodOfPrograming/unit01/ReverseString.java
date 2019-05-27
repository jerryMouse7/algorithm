package theMethodOfPrograming.unit01;

import java.util.Scanner;

/**
 *字符串的旋转
 * @author 
 *
 */
public class ReverseString {
	public static void main(String[] args) throws Exception{
		ReverseString reverseString = new ReverseString();
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		char[] charArray = string.toCharArray();
		reverseString.leftRotateString(charArray,1);
		System.out.println(charArray);
	}
	
	public void reverseString(char[] string, int left, int right) {
		System.out.println("进入reverseString");
		char temp;
		while(left < right) {
			temp = string[left];
			string[left++] = string[right];
			string[right--] = temp;
			
		}
	}
	
	public void leftRotateString(char[] string, int offset) throws Exception  {
		int length = string.length;
		if(offset < 0 ) throw new RuntimeException();
		offset %= length;
		reverseString(string,0,offset - 1);
		reverseString(string, offset, length - 1);
		reverseString(string, 0, length - 1);
	}
	
}
