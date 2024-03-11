import java.lang.reflect.Array;
import java.util.ArrayList;

public class DominoPile {
    ArrayList<Domino> pile = new ArrayList<>();

    DominoPile(){
        this.pile.clear();
    }

    public void newStack6(){
        int i = 0;
        int k = 1;

        pile.add(new Domino(0,0));

        while(i <= 6) { //top number
            while (k < 6) { //bottom number
                pile.add(new Domino(i, k));
                k++;
            }
            if (k == 6) {
                pile.add(new Domino(i, k));
                k = i + 1;
                i++;
            }
        }
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void shuffle(){
        //two for loops
    }
}
