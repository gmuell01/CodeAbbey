import java.util.HashMap;

public class MazePlayer {

    public char bearing = 'a';
    public HashMap<Character, Character> translate = new HashMap<>();

    public MazePlayer(char bearing) {
        this.bearing = bearing;
        translate.put('d','w');
        translate.put('a','s');
        translate.put('s','d');
        translate.put('w','a');

    }

    public char choose(){
        char move;
        move = translate.get(getBearing());
        if
        return 'w';
    }

    public char getBearing() {
        return bearing;
    }
}
