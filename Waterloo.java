import java.util.Scanner;

public class ChiliPeppers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        int result = 0;
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println("Pepper name: ");
            String pepperName = scanner.nextLine();
            
            switch (pepperName) {
                case "Poblano":
                    result += 1500;
                    break;
                case "Mirasol":
                    result += 6000;
                    break;
                case "Serrano":
                    result += 15500;
                    break;
                case "Cayenne":
                    result += 40000;
                    break;
                case "Thai":
                    result += 75000;
                    break;
                case "Habanero":
                    result += 125000;
                    break;
            }
        }

        System.out.println("Result: " + result);
    }
}
