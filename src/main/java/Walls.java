public class Walls extends Element {
    private int x,y;

    public Walls(int x,int y) {
        this.x=x;
        this.y=y;
    }

    public boolean equals(Walls wall) {
        if (this == wall) return true;

        if (wall == null) return false;

        if (this.getClass() != wall.getClass()) return false;

        Position p = new Position (wall);       //ERA ASSIM QUE ERA SUPOSTO FAZER O CAST PARA POSIÇÃO, BASICAMENTE CRIAR UMA NOVA?? STATIC CAST DAVA ERRO
        return this.x == p.getX() && this.y == p.getY();
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

}
