package fw.singleton.lazy;

/**
 * 懒汉模式
 *
 * @Auther: Administrator
 * @Date: 2019/4/1 16:37
 * @Description:
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazySimpleSingleton = null;

    //1.最基本的单例模式，存在线程安全问题，如果一个线程进入if判断，new操作还未执行，另一个线程也进入if,会产生多个实例
    public static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

    //2.加上synchronized关键字保证线程安全，但每个线程获取类的实例的时候，执行getInstance都要等待同步，效率不高
    public static synchronized LazySimpleSingleton getInstance2() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
    //3.将new的过程加synchronized，但在进入synchronized同步块之前，同样存在会有多个线程进入if判断的问题
    public static  LazySimpleSingleton getInstance3() {
        if (lazySimpleSingleton == null) {
            synchronized (LazySimpleSingleton.class) {
                lazySimpleSingleton = new LazySimpleSingleton();
            }
        }
        return lazySimpleSingleton;
    }

}
