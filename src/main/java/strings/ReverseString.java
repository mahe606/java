package strings;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("mahesh");
    }


    // method to reverse the string
    public static void reverseString(String inp){
        char[] chars = inp.toCharArray() ;

        StringBuilder str = new StringBuilder();
        for(int i = chars.length-1;i>=0;i--){
            str.append(chars[i]);
        }
        System.out.println(str);
    }
}


