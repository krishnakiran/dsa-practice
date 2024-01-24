import java.util.Arrays;

public class URLify {
    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        char[] inputArray = input.toCharArray();
        urlify(inputArray,13);
        System.out.println(Arrays.toString(inputArray));
    }

    private static void urlify(char[] input,int trueLength){
        int spaceCount=0;
        for(int i=0;i<trueLength;i++){
            if(input[i] == ' '){
                spaceCount++;
            }
        }
        int index = trueLength+spaceCount*2;
        for(int i=trueLength-1;i>0;i--){
            if(input[i] == ' '){
                input[index-1]='0';
                input[index-2]='2';
                input[index-3]='%';
                index=index-3;
            }
            else {
                input[index-1]=input[i];
                index--;
            }
        }
    }
}
