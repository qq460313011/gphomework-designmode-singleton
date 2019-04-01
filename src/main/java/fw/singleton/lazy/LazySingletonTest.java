package fw.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 16:58
 * @Description:
 */
public class LazySingletonTest {

    public static void main(String[] args) throws Exception {

        LazyInnerClassSingleton singleton=LazyInnerClassSingleton.getInstance();

        Constructor<LazyInnerClassSingleton> constructor=LazyInnerClassSingleton.class.getDeclaredConstructor();
        //取消java语言限制检查，使得私有构造函数可以被访问
        constructor.setAccessible(true);
        LazyInnerClassSingleton singleton1=constructor.newInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
