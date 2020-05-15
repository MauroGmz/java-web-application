package clase2.ejemplos;

public class ThreadsMyThread extends Thread {
    ThreadsTable table;
    int value;
    String name;

    public ThreadsMyThread(ThreadsTable table, int value, String name){
        this.table = table;
        this.value = value;
        this.name = name;
    }

    public void run(){
        table.printTable(value, name);
        System.out.println("End " + name + " \r\n");
    }

}
