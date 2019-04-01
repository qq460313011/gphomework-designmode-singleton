package fw.singleton.seriable;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 17:33
 * @Description:
 */
public class SeriableSingleton implements Serializable {

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    //重写readResolve方法，防止序列化破坏单例,因为在ObjectInputStream中的readOrdinaryObject如果对象序列化了，会调用对象的无参构造方法
    //而重写readResolve方法，会在接下来判断，如果实例有readResolve方法会通过反射调用这个readResovle方法，在这个方法中返回之前的已经实例化的对象就可以避免序列化破坏单例
    private Object readResolve() {
        return INSTANCE;
    }


}
