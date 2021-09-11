/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.util.Scanner; // import Scanner class

public class TestSportsTeamApp {

    /* Main method to test Team class */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object for user input
        char cont = 'y'; // determines whether to continue while loop

        while(cont == 'y') {

            /* User enters team name */
            System.out.print("\n    Enter a team name: ");
            String teamName = input.nextLine();
            Team testTeam =  new Team(teamName);

            /* User enters player names separated by comma */
            System.out.print("\n    Enter player names\n      Hint: Use commas for multiple players\n    ");
            String playerNames = input.nextLine();

            String[] players = playerNames.split(","); // splits player names into array String objets

            for(int i = 0; i < players.length; i++)
                testTeam.addPlayer(players[i]); // passes player names to testTeam players array
            

            displayTeamInfo(testTeam); // passes testTeam to method to display team info

            System.out.print("\n\n    Add another team? [y/n]: ");
            cont = input.nextLine().charAt(0); 
        }


        System.out.println("\n    Bye!\n");
    }

    /**
     * Method to display team info
     * @param team Team object
     */

    public static void displayTeamInfo(Team team) {
        String teamName = team.getTeamName();
        int playerCount = team.getPlayerCount();
        String[] players = team.getPlayers();

        System.out.print("\n    -- " + teamName + " Team Summary --\n    Number of players: " + playerCount + "\n    Players: ");

        for(int i = 0; i < playerCount; i++) {
            if(i + 1 != playerCount)
                System.out.print(players[i] + ", ");
            else
                System.out.print(players[i]);
        }
    }

}
