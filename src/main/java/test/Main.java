package test;

public class Main{

    int cnt = 0, cntNull = 0;

    public static void main(String[] args) { 
        new Main().test();
    }

    public void test(){
        for( Integer idx = 0; idx < 200000; idx++ )
        {
            loseType(0.45642f, idx);
        }
        System.out.println(cnt + " error1");
        System.out.println(cntNull + " null");
    }

    public void loseType(Object data, Integer i){
        try{
            int d=0;
            int i1 = 5 / d;
        } catch(Exception e){
          //  System.out.println(e.getMessage());
            cnt++;
            if(e.getMessage() == null){
                cntNull++;
                System.out.println(e.getCause());

            }
        }
    }

    public void gainType(Double x){

    }
}