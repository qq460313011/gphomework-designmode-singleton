package fw.singleton.lazy;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 16:48
 * @Description:
 */
public class LazyDoubleCheckSingleton implements Serializable {

    private LazyDoubleCheckSingleton(){}

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    //双重检查，即使有多个线程进入了第一次if判断，在同步块中再进行一次if判断，可以保证单例的线程安全
    public static LazyDoubleCheckSingleton getInstance(){

        //存在jvm乱序执行的问题

        if (lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton==null)
                    lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
