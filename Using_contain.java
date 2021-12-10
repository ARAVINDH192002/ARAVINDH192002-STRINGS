import java.io.*;
import java.util.*;
 class Main {
public static void main(String [] args) {
	String sentence,search;
	Scanner sc = new Scanner(System.in);
	sentence = sc.nextLine();
	search = sc.nextLine();
	if(sentence.contains(search.trim())) {
		System.out.println("String is found in the sentence");
	}
	else {
		System.out.println("String is not found in the sentence");
	}
}
}
