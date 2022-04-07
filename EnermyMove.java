public class EnermyMove {
    private static int SizeHigh=60;
    private static int SizeWeight= (int) (getSizeHigh()*5.6);
    private static int xmove= (int) (getSizeHigh()*3);
    private static int ymove=0;
    public static int getXmove(){
        return xmove;
    }
    public static int getYmove(){
        return ymove;
    }
    public static int getSizeHigh(){
        return SizeHigh;
    }
    public static int getSizeWeight(){
        return SizeWeight;
    }
}
