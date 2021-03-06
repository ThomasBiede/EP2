// This class represents a Player in a counting game. Every player has a name
// and a unique number.
//
public class Player {

    // Use unique consecutive numbers for instances.
    // The first instance has number 1.
    private static int nextNumber = 1;
    private String name = "";
    private int id;

    // A constructor with the 'name' of the player.
    // Precondition: name != null (needs not be checked).
    public Player(String name) {
        this.name = name;
        this.id = nextNumber;
        nextNumber++;
    }

    // Returns the number of players that have been instantiated so far.
    public static int numberOfPlayers() {
        return nextNumber - 1;
    }

    // Returns a representation of this player with his name and his number in
    // parentheses, e.g.: Michael(5)
    public String toString() {
        return String.format("%s(%d)", this.name, this.id);
    }

}

