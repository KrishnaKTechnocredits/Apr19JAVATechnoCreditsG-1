package jiniY;

import java.util.Scanner;

public class CharFreqInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		
		new CharFreqInString().freq(str);
	}
	void freq(String s)
	{
        char ch = 'i';
        int freq = 0;

        for(int i = 0; i < s.length(); i++) {
            if(ch == s.charAt(i)) {
                ++freq;
            }
        }

        System.out.println("char freq of " + ch + " = " + freq);
}
}
