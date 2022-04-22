import java.util.Random;

public class GameLogic {
    private static Random r = new Random();
    private static int score=0;
    private static final int lap=r.nextInt(8,10);
    private static int k=0;
    private static String[] numberForChoose = new String[]{"", ""};
    private static int[] answer = new int[2];
    public static int getScore(){return score;};

    public static int getLap(){return lap;}
    public GameLogic(){
        int lape =r.nextInt(5,10);
        //System.out.println(lape);
        //for(int h=0;h<lape;h++){//สุ่มจำนวนรอบของประตู

            numberForChoose[0]=" ";
            numberForChoose[1]=" ";
            for(int i=0;i<2;i++){
                int x=r.nextInt(6);//สุ่มเครื่องหมาย
                int a=0;

                String b="";
                if(x<3){
                    a=r.nextInt(1,50);//สุ่มตัวเลข
                }
                else if(x>2){
                    a=r.nextInt(1,5);//สุ่มตัวเลข
                }
                if(x<2){
                    b="+";k=score+a;
                }
                else if(x==2){
                    b="-";k=score-a;
                }
                else if(x==3){
                    b="*";k=score*a;
                }
                else if(x==4){
                    b="*";k=score*a;
                }
                else if(x==5){
                    b="/";k=score/a;
                }
                answer[i]=k;
                k=0;
                numberForChoose[i]=b+a;
                //System.out.print(b+a+"\t");
            //}
            //System.out.print("\nAns : ");
            //String ans=GameDisplay.getKeyMove();

            //System.out.println("Score : "+score);
//            if(score<0){
//                //System.out.println("Game Over");
//                break;
//            }
        }
    }
    public static void checkScore(String s){
        switch(s){
            case "L"->score=answer[0];
            case "R"->score=answer[1];
        }
    }
    public static void hitEnemy(){
        score-=10;
        Sound s=new Sound();
        s.setFile(3);
        s.play();
    }
    public static void setScore(int s){
        score=0;
        k=0;
        new GameLogic();
    }
    public static String[] getNumberForChoose(){return numberForChoose;}
}
