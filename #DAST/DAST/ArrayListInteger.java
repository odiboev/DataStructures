/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicallab7;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ArrayListInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> myList = new ArrayList <Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        
        for (int i=0; i<myList.size();i++){
        System.out.println(myList.get(i));
        }
    }
        
    public static int sumValues(ArrayList<Integer>myList){
        int sum = 0;
        for(int j=0; j<myList.size();j++){
            sum = sum+myList.get(j);
            
        }
        return sum;
    }
        // TODO code application logic here
    
    
}
