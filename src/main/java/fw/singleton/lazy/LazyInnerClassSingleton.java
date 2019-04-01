package fw.singleton.lazy;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 16:51
 * @Description:
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        //防止单例被反射破坏，在私有构造函数中再次判断实例是否被创建
        if (SingletonInstance.LAZY_INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("当前实例已经创建");
        }
    }

    private static class SingletonInstance {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance() {
        return SingletonInstance.LAZY_INNER_CLASS_SINGLETON;
    }

}
