package clase2.ejemplos;

public class ThreadsTable {

    void printTable(int n, String nm){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(nm + " -> " + n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }//end of the method syncronized
    }

}
