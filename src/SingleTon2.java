public class SingleTon2 {
    private static final SingleTon2 INSTANCE=new SingleTon2();
    SingleTon2(){}
    public static SingleTon2 getInstance(){
        return INSTANCE;
    }

}
