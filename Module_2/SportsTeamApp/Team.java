/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class Team {
    private String teamName = ""; // Defaults teamName to an empty String
    private String[] players = new String[20]; // players array initialized to 20 Strings
    private int playerCount = 0; // player counter defaults to 0 to assist adding players to array

    /**
     * Constructs a team by passing a team name
     * @param teamName String
     */

    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Method to add a player name to the array
     * @param player
     */

    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount++;
    }

    /**
     * Method to access player array
     * @return String[]
     */

    public String[] getPlayers() {
        return players;
    }

    /**
     * Method to access player count
     * @return int
     */

    public int getPlayerCount() {
        return playerCount;
    }

    /**
     * Method to access team name
     * @return String
     */

    public String getTeamName() {
        return teamName;
    }
}
