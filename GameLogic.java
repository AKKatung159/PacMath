import java.util.Random;

public class GameLogic {
    private Random r = new Random();
    private static int score=0;
    public static int getScore(){return score;};
    public GameLogic(){
        int l =r.nextInt(5,10);
        System.out.println(l);
        for(int h=0;h<l;h++){
            int[] answer = new int[2];
            for(int i=0;i<2;i++){
                int x=r.nextInt(6);
                int a=0;
                int k=0;
                String b="";
                if(x<3){
                    a=r.nextInt(1,50);
                }
                else if(x>2){
                    a=r.nextInt(1,5);
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
                System.out.print(b+a+"\t");
            }
            System.out.print("\nAns : ");
//            String ans=sc.nextLine().trim();
//            switch(ans){
//                case "L"->score=answer[0];
//                case "R"->score=answer[1];
//            }
            System.out.println("Score : "+score);
            if(score<0){
                System.out.println("Game Over");
                break;
            }
        }
    }
}
