package com.eashwar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num=JOptionPane.showInputDialog("enter the size fo array");
		int size=Integer.parseInt(num);
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			String input=JOptionPane.showInputDialog("enter element: "+i);
			arr[i]=Integer.parseInt(input);
		
		}
		JOptionPane.showInternalMessageDialog(null,"the array values are"+"\n"+Arrays.toString(arr));
		
		
	}

}
