import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        StringBuffer s= new StringBuffer("abcdefgh");
        System.out.println("Before reverse is: " + s);
        reverse(s);
        System.out.println("After reverse is: " + s);

    }

    public static void reverse(StringBuffer str)
    {

        int n = str.length();
        Stack obj = new Stack();


        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++)
        {
            char ch = (char) obj.pop();
            str.setCharAt(i,ch);
        }
    }
}
