package fw.singleton.threadlocal;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 17:49
 * @Description:
 */
public class ThreadLocalSingleton {

    //每个线程有自己的单例对象，这个单例对象是在自己线程中的，其他线程不能修改
    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }

}
