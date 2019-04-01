package fw.singleton.hungry;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 17:04
 * @Description:
 */
public class HungrySingleton {


    private  HungrySingleton(){}

    //1.静态常量模式
    //private static final HungrySingleton SINGLETON=new HungrySingleton();

    private static HungrySingleton SINGLETON;
    //2.静态代码块模式
    static {
        SINGLETON=new HungrySingleton();
    }

    public HungrySingleton getInstance(){
        return SINGLETON;
    }

}
