// This class represents players sitting in a circle in a counting game.
// Objects of type 'Player' are stored in a ring list (all nodes have a successor node != null).
// The first player starts counting "1", the second counts "2", etc., until the player, who reaches the
// specified dropout number. This player is removed from the game and the player next to his position
// starts counting again with "1" in the next round.
//
// Example (4 Players, dropout number is 3):
//
// Round 1:
// Player1      Player2     Player3     Player4
// "1"
//              "2"
//                          "3!"
// -> Player3 removed
//
// Round 2:
// Player1      Player2     Player4
//                          "1"
// "2"                      ⤶
//              "3!"
// -> Player2 removed
//
// Round 3:
// Player1      Player4
//              "1"
// "2"          ⤶
//              "3!"
// -> Player4 removed
// Player1 wins!
//
// TODO: define further classes for the implementation of the ring list, if needed (either in this
//  file or in separate files).
//  Implement this class without the use of classes from the Java Collection framework.
//
public class GameCircle {
    static class RingDListNode {
        private RingDListNode next, prev;

        private Player player;

        public RingDListNode(Player p) {
            this.player = p;
        }
    }

    private RingDListNode head, tail;
    private RingDListNode current;

    // Initializes this GameCircle with the players created according to
    // 'playerNames'. The player playerNames[i] gets the number i+1.
    // playerNames[0] is the player who will start counting.
    // Preconditions: 'playerNames' is not null and has no 'null'-entries (need not be checked).
    public GameCircle(String[] playerNames) {
        for (String player : playerNames) {
            ringListAdd(new Player(player));
        }
    }

    private void ringListAdd(Player p) {
        RingDListNode newNode = new RingDListNode(p);

        if (head == null) {
            head = tail = newNode;
            head.prev = head;
            head.next = head;

            current = head;

        } else {
            tail.next = newNode;
            newNode.prev = tail;

            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    // This method simulates one round of the counting game with
    // dropout number 'dropOutCount'. It returns the player who is removed
    // in this round. Returns 'null' if there is no player in the game circle.
    // Note that the starting position for counting depends on the previous round!
    // Precondition: dropOutCount > 0 (needs not be checked).
    public Player play(int dropOutCount) {
        if(head == tail) {
            Player p = head.player;
            head = tail = null;

            return p;
        } else {
            int c = 1;
            while (c != dropOutCount) {
                current = current.next;
                c++;
            }
            Player p = current.player;

            RingDListNode prev = current.prev;
            RingDListNode next = current.next;

            prev.next = next;
            next.prev = prev;

            if(current == head) {
                head = next;
            } else if(current == tail) {
                tail = prev;
            }

            this.current = next;


            return p;
        }
    }

    // Returns 'true' if there is no player in the game circle.
    public boolean isEmpty() {
        return this.head == null;

    }

    // Returns a representation of this game circle with all its (remaining) players in
    // brackets in order of their insertion (player with smallest number is left).
    // The player that starts counting in the next round is marked by '*'.
    // Returns "[]" if the circle is empty.
    public String toString() {
        RingDListNode start = this.head;
        String s = "[";



        while (start != this.tail) {
            if(start == this.current) {
                s += "*" + start.player.toString() + "* ";
                start = start.next;
            } else {
                s += start.player.toString() + " ";
                start = start.next;
            }
        }
        if(tail != null) {
            s += (tail == current) ? "*" + start.player.toString() + "*" : start.player.toString();
        }

        return s + "]";
    }
}

