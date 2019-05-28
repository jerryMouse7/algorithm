package theMethodOfPrograming.unit01;

import java.util.Scanner;

/**
 *  单词翻转
 * @author lenovo
  *  创建时间 2019年5月28日下午5:43:05
 *
 */

public class ReverseWords {
	
	public static void main(String[] args) {
		ReverseWords reverseWords = new ReverseWords();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("请输入一个字符串：");
			char[] string = in.nextLine().toCharArray();
			reverseWords.reverseWords(string);
			String result= new String(string);
			System.out.println("翻转后的字符串： "+result);
		}
		
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
	
	public void reverseWords(char[] string) {
		int left = 0, right = 0;
		int length = string.length;
		while(right <= length) {
			while(right < length && string[right] != ' ') {
				right++;
			}
			reverseString(string,left,right - 1);
			left = ++right;
			
		}
		reverseString(string, 0, length - 1);
	}
}
