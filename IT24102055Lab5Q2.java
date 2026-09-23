import java.util.Scanner;

public class IT24102055Lab5Q2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int newMembers = Scanner.nextInt();

        if (newMembers < 0) {
            System.out.println("Invalid input. The number of new members should be 0 or greater.");
        } else {
            String prize;

            switch(newMembers) {
                case 0:
                 prize = "No prize";
                break;

                case 1:
            prize ="Pen";
             break;
             case 2:
             prize ="Umbrella";
             break;
             case 3:
              prize = "Bag";
               break;
                case 4:
                 prize = "Travelling Chair";
                  break;
                   default:
                    prize ="Headphone";
                     break;

    }System.out.println("Prize is a: " + prize);
}    

    Scanner.close();

   }
}  