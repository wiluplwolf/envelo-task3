package pl.wiluplwolf;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Connecting to API
        // https://api.kanye.rest/
        Connect connection = new Connect("https://api.kanye.rest");
        // Get sentence from API
        Kanye west = new Kanye(connection);
        String input = "next";
        Scanner sc = new Scanner(System.in);
        
        // Displaying result
        while(input.equals("next")) {
            System.out.println(west.nextWest());
            System.out.print("Enter \"next\" for more, or press enter: ");
            input = sc.nextLine();
        }
    }
}
