public class Domino {
    private int top;
    private int bottom;

    Domino(){
        this.top = 0;
        this.bottom = 0;
    }
    Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public String toString() {
        return top + "/" + bottom;
    }

    public void flip(){
        int oldTop = top;
        int oldBottom = bottom;

        this.top = oldBottom;
        this.bottom = oldTop;
    }

    public void settle(){
        if(top > bottom){
            flip();
        }
    }

    public int compareTo(Domino other){
        this.settle();
        other.settle();

        if(this.top == other.top){
            if(this.bottom == other.bottom){
                return 0;
            }
            if(this.bottom > other.bottom){
                return 1;
            }
            if(this.bottom < other.bottom){
                return -1;
            }
        }
        if(this.top > other.top) {
            return 1;
        }
        else{
            return -1;
        }
    }

    public int compareToWeight(Domino other){
        //top then bottom
        if(this.top > other.bottom + other.top){
            return 1;
        }
        if(this.bottom > other.bottom + other.top){
            return 1;
        }
        if(other.top > this.bottom + this.top){
            return 1;
        }
        if(other.bottom > this.bottom + this.top){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean canConnect(Domino other){
        boolean value = false;
        if(this.top == other.top){
            value = true;
        }
        if(this.top == other.bottom){
            value = true;
        }
        if(this.bottom == other.bottom){
            value = true;
        }
        if(this.bottom == other.top){
            value = true;
        }
        return value;
    }

}
