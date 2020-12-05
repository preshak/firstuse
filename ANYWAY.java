 class ANYWAY extends Thread{
    public void run(){
      System.out.println(Thread.currentThread().getName()) ; 
System.out.println("do");
    }
public static void main(String ar[]){
    a obj=new a();
    a obj1=new a();
    obj.setPriority(Thread.MAX_PRIORITY);
    obj1.setPriority(Thread.MIN_PRIORITY);
    obj.start();
    obj1.start();
}}