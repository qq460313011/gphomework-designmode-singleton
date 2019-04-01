package fw.singleton.register;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 17:17
 * @Description:
 */
public class EnumSingletonTest {


    //枚举模式满足线程安全的原因是，ENUM_SINGLETON被声明为static,所以是线程安全的，java规范规定每一个枚举类型在其定义的jvm中都是唯一的
    //序列化时java仅仅是将枚举对象的name属性输出到结果中，反序列化的时候通过java.lang.enum的valueOf方法根据名字查枚举对象
    //也就是说序列化的时候只将DATASOURCE这个名字输出，反序列化的时候再通过这个名称，查找对应的枚举类型，因此序列化也不会破坏单例
    public static void main(String[] args) {
        Object object1=EnumSingleton.ENUM_SINGLETON.getObject();
        Object object2=EnumSingleton.ENUM_SINGLETON.getObject();
        System.out.println(object1==object2);
    }

}
