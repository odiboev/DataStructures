package Homework;

class BreadRiceNoodle
{
    public static void main(String[] args)
    {
        int startNum = 1;
        int finalNum = 111;
        int newLine = 0;
       
        while(startNum <= finalNum) 
        {
            System.out.print(startNum + " ");
            startNum++;
            newLine++;
            
            if(newLine%11 == 0){
                System.out.println("\n");
            }            
            if (startNum%3 == 0){
                System.out.print("Bread ");
            }
            if (startNum%5 == 0){
                System.out.print("Rice ");
            }
            if (startNum%7 == 0){
                System.out.print("Noodle ");
            }
            
            /*if ((startNum%3 == 0)||(startNum%5 == 0)||(startNum%7 == 0)){
                startNum++;
                newLine++;
            }*/
                             
        }
    }
}

