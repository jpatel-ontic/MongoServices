public class SingleTon {

    private  static SingleTon obj=null;
    private SingleTon(){}
    public static SingleTon ObjectCreationMethod(){
        if(obj==null){
            obj=new SingleTon();
        }
        return obj;
    }
    public void display(){
        System.out.println("single ton obj is created");
    }

    public static void main(String[] args) {
        SingleTon myobj =SingleTon.ObjectCreationMethod();
        myobj.display();
        System.out.println(myobj);
    }
}
