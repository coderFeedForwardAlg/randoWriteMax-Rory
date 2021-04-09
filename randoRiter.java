/* 
max scott 
Random writer progect
April 5th 2020
*/ 

/*     
        ** STEPS ** 

WRIGHT DATA []
READ DATA []
MAKE LL AND AmRRAYS [X]
LODE DATA INTO ARRAYS [] 
GENERATE A NEW PECE OF WRIGHTING[]
GET TIME [] 


*/

//TODO: MAKE ARRAYLIST OF UNEQUE INTO AN ARRAY 







import java.io.*;
import java.util.*;


  



    public class randoRiter {

    public static void main(String[] args) {



        // insted of reading words from a file I just creatd a fake list 
            //of words to go through to test the LL and array structers 
        //String[] testData = {"hi", "sdfhjl", "h", "a" ,"sdf" , "h", "b", "sdfdhjl" ,"ssdf" , " dasdf",  "sdfsfhjl" ,"sdweff" , " srfvdf", "h", "c", "h", "d"};
        String[] testData = {"a" , "b", "c" , "e", "b", "c" , "e", "a", "c", "e", "a", "b", "e", "c", "b", "a"};

        long startTime;
        long stopTime;
        startTime = System.currentTimeMillis();




        ArrayList<LinkedList> follows = new ArrayList<LinkedList>(1000);    // liked lists of words that follow a particular word 
        for(int i =0; i < 1000; i++){
            follows.add(new LinkedList<String>());
        }
        ArrayList<String> unique = new ArrayList<String>();         // an araay of unequ words that have already been incounterd 
        
        

            // add words from testdata if they are not already their 
        for(int i =0; i < testData.length-1; i++){
            if(!unique.contains(testData[i])){
                unique.add(testData[i]);
            }

 
               


        }

        for(int i =0; i < testData.length-1; i++){
                // add falowing word to follows list 
            follows.get(unique.indexOf(testData[i])).add(testData[i+1]);
        }



            // look at it for testing purpusis 
        for(int i =0; i <unique.size(); i++){
            System.out.println(  unique.get(i) + "\t" + "\t" + follows.get(i).toString());
        }


        System.out.println(makeWords(unique, follows));
        System.out.println("");
        System.out.println("");
        System.out.println("");




            

        stopTime = System.currentTimeMillis();
        System.out.println("Elapsed time = "+(stopTime-startTime)+" msecs.");
        System.out.println("");
        
        System.out.println("this program ran");
    }







    public static String makeWords(ArrayList<String> unique, ArrayList<LinkedList> follows){
        String text = "";
            // MAKE THE RANDOM WRITING FROM THE LISTS 
                // get a word from the unequ

                int r = (int) (Math.random() * unique.size());
                int index = unique.indexOf(unique.get(r));
                Object tempWord = unique.get(index);
                for(int i =0; i < 10; i++){
                    
        
                        // get a random following word from the follows 
                   
                    
                    System.out.println(" the curent word is "+ tempWord);  
                    text += " " + tempWord;

                    
                    int rando = (int) (Math.random() *   (follows.get(index).size() -1 )  ) ;

                    System.out.println("the next word is " + follows.get(unique.indexOf(tempWord)).get( rando )); 
                            

                    tempWord = follows.get(unique.indexOf(tempWord)).get(rando);
                    index = unique.indexOf(tempWord);
                    
                    
           
                    
                    System.out.println(" ");  
                    System.out.println(" ");  
                }
                return(text);
    }



        
    
}
