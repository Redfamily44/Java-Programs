package javaRevision;

import java.io.PrintWriter;
import java.util.Scanner;

public class WritingFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		PrintWriter file=new PrintWriter("read me.txt"); //creating file
		
		file.println("Tip:- use ctrl+F11 to run a program in eclipse :)"); //chumma txt
		
		Scanner scan=new Scanner(System.in);
//		int n=1;
//		
//		System.out.println("how many lines do you want ?");
//		int i=scan.nextInt();
		
		System.out.println("start entering your text...");
		String txt="dummy";
		String alert="stop";
		
		while(! txt.equals(alert)){
		 txt=scan.nextLine();
		 if(txt.equals(alert)) {
			 break;
		 }
		 file.println(txt);
	  //  n++;
	    }
		
		
		file.println("----END OF FILE----");
		
		scan.close();
		file.close();
	

	}

}
