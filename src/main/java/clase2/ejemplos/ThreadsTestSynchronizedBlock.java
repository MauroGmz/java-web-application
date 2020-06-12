package clase2.ejemplos;

public class ThreadsTestSynchronizedBlock {

    public static void main(String args[]){
        ThreadsTable obj = new ThreadsTable();//only one object
        ThreadsMyThread t1=new ThreadsMyThread(obj, 5, "T1");
        ThreadsMyThread t2=new ThreadsMyThread(obj, 100, "T2");
        t1.start();
        t2.start();
    }

}
