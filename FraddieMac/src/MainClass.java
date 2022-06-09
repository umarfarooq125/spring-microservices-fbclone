
/*
Longest non repeating Substring
 output longest length
 input inpt string

 Example
 ABCD : 4
 ABCABCD : 4
 Jazz: 3

 */
class Processor {
    public  Processor(){}

    public int GetNonRepeatingSubString(String input) {

        if(input !=null && input.length()==0) return 0;

        int result = 0;
        String resultArray = "";

        for (int i =0; i < input.length(); i++) {

            String currentChar = input.charAt(i)+"";
            System.out.println("currentChar: " + currentChar);
            System.out.println("resultArray: " + resultArray);
            if(!resultArray.contains(currentChar)) {
                resultArray += currentChar;
            } else {
                int currentLength = resultArray.length();
                if(currentLength > result){
                    result = currentLength;
                    resultArray = "";
                }
            }
        }

        return result;
    }
}
public class MainClass {

    public static void main(String[] args) {

        String input = "ABAD";
        Processor proc = new Processor();

        System.out.println("Result: " + proc.GetNonRepeatingSubString(input));
    }
}













