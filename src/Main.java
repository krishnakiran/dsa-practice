public class Main {
    public static void main(String[] args) {
        String input = "0P";
       /* input=input.toLowerCase();
        input= input.replaceAll("[^a-zA-Z0-9]", "");
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse= reverse+input.charAt(i);
        }
        if(reverse.equals(input)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("no palindrome");
        }*/
        Main main = new Main();
        System.out.println(main.palindrome("0P"));
    }

    private boolean palindrome(String input){
        input=input.toLowerCase();
        input= input.replaceAll("[^a-zA-Z0-9]", "");

        int left=0;
        int right=input.length()-1;

        while (left<=right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}