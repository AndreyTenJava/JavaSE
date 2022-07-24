package Threads;

public class Operation extends Thread{
    String operationName;
    int operationTime;

    public Operation(String operationName, int operationTime){
        this.operationName = operationName;
        this.operationTime = operationTime;
    }
    public void run(){
        try{
            for(int i = 0; i < operationTime; i++){
                System.out.println("Operation" +" "+ operationName + ":" + " " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
