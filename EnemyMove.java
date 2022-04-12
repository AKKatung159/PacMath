public class EnemyMove {
    private static int SizeHeight = 60;
    private static int SizeLength = (int) (getSizeHeight()*5.6);
    private static int xmove = (int) (getSizeHeight()*3);
    private static int ymove = 0;
    public static int getXmove(){
        return xmove;
    }
    public static int getYmove(){
        return ymove;
    }
    public static int getSizeHeight(){
        return SizeHeight;
    }
    public static int getSizeLength(){
        return SizeLength;
    }

    public void move() {

    }
}
