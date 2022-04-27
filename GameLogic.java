import java.util.Random;

public class GameLogic {
    private static Random r = new Random();
    private static int score=0;
    private static final int lap=r.nextInt(8,10);
    private static int k=0;
    private static String[] numberForChoose = new String[]{"", ""};
    private static int[] answer = new int[2];
    public static int getScore(){return score;};
    public int roundddd=0;
    public static int getLap(){return lap;}
    public GameLogic(){
        int lape =r.nextInt(5,10);
        //System.out.println(lape);
        //for(int h=0;h<lape;h++){//สุ่มจำนวนรอบของประตู

            numberForChoose[0]=" ";
            numberForChoose[1]=" ";
            if(GameDisplay.getRound()==0){
                System.out.println(GameDisplay.getRound());
                //System.out.println(roundddd);
                for(int i=0;i<2;i++){
                    int x=r.nextInt(2);//สุ่มเครื่องหมาย
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
                }
            }
            else{
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
        }
    }
    }

    public static void checkScore(String s){
        Sound so=new Sound();
        so.setFile(4);
        so.play();
        if(s.equals("L")){
            score=answer[0];
            if(answer[0]>answer[1]){
                so.setFile(4);
                so.play();
            }
            else {
                so.setFile(5);
                so.play();
            }
        }else if(s.equals("R")){
            score=answer[1];
            if(answer[1]>answer[0]){
                so.setFile(4);
                so.play();
            }
            else {
                so.setFile(5);
                so.play();
            }
        }
    }
    public static void hitEnemy(){
        score-=10;
        Sound s=new Sound();
        s.setFile(5);
        s.play();
    }
    public static void setScore(int s){
        score=0;
        k=0;
        new GameLogic();
    }
    public static String[] getNumberForChoose(){return numberForChoose;}
}
