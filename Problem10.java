import java.util.Scanner;

public class Problem10 {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

class UsernameValidator {
    public static final String regularExpression = "^[[A-Z]|[a-z]][[\\w]|[_]]{7,29}$";
}