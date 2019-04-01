package fw.singleton.register;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 17:12
 * @Description:
 */
public enum EnumSingleton {

    ENUM_SINGLETON;
    private Object object;
    private EnumSingleton(){
        object=new Object();
    }

    public Object getObject(){
        return object;
    }

}
