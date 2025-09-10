
public class Task7 {
    public static void main(String[] args) {
        String s = "a12bc34d5";
        int sum = 0;
        String num = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num += c;
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if (!num.isEmpty()) sum += Integer.parseInt(num);

        System.out.println("Sum = " + sum);
    }
}

