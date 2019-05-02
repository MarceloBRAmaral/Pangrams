import java.util.Scanner;

public class Pangrams {

    public static void main(String[] args) {

        String allLettersLow = "abcdefghijklmnopqrstuvxywz";
        String allLettersUp = "ABCDEFGHIJKLMNOPQRSTUVXYWZ";

        String letterLow;//used to isolate a single letter (lower case or upper case)
        String letterUp;
        boolean inText = true;//used to test if a string contains a certain letter

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        for(int i=0;i<26;i++){//runs through all the letters
            letterLow = allLettersLow.substring(i,i+1);//picks one lower case letter at a time
            letterUp = allLettersUp.substring(i,i+1);//picks one upper case letter at a time
            inText = text.contains(letterLow)||text.contains(letterUp);//tests if the string has the specific letter
            if(!inText){break;}//if the string doesn't have the letter (neither lower nor upper) exits the loop
        }

        if(inText){
            System.out.println("pangram");}else{
            System.out.println("not pangram");
            }
    }
}