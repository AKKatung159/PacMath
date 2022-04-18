import java.util.Random;

public class EnemyMove {
    private static Random random = new Random();
    private static int SizeHeight = 60;
    private static int SizeLength = (int) (getSizeHeight()*5.6);
    private static int xmove = (int) (getSizeHeight()*3);
    private static int ymove = 0;

    public EnemyMove(){
    }
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
    public static int getEnemyPic(){
        int enemy;
        String st1=GameLogic.getNumberForChoose()[0].substring(0,1);
        String st2=GameLogic.getNumberForChoose()[1].substring(0,1);
        if(st1.equals("+")||st1.equals("*")){
            //++
            if(st2.equals("+")||st2.equals("*")){
                enemy=0;
            }
            //+-
            else {
                enemy= random.nextInt(3,4);
            }
        }else {
            //-+
            if(st2.equals("+")||st2.equals("*")){
                enemy=random.nextInt(1,3);
            }
            //--
            else {
                enemy= random.nextInt(5,8);
            }
        }
        return enemy;
    }
}
