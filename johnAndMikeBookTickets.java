import java.util.Scanner;

public class johnAndMikeBookTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int availableTickets = sc.nextInt();
        int johnRequiredTickets = sc.nextInt();
        int mikeRequiredTickets = sc.nextInt();

        if (availableTickets >= johnRequiredTickets) {
            availableTickets -= johnRequiredTickets;
            System.out.println("John: tickets booked: " + johnRequiredTickets);
        }
        else {
            System.out.println("John: not booked.");
        }

        if (availableTickets >= mikeRequiredTickets) {
            availableTickets -= mikeRequiredTickets;
            System.out.println("Mike: tickets booked: " + mikeRequiredTickets);
        }
        else {
            System.out.println("Mike: not booked.");
        }
    }
}

