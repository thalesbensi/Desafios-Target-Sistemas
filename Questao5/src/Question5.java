
public class Question5 {
    public static void main(String[] args) {

        String string = "Target Sistemas";
        String result = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }

        System.out.println(result);
    }
}