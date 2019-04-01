package fw.singleton.seriable;

import fw.singleton.lazy.LazyDoubleCheckSingleton;

import java.io.*;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 17:37
 * @Description:
 */
public class SeriableSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(LazyDoubleCheckSingleton.getInstance());
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) ois.readObject();
        //判断是否是同一个对象
        System.out.println(newInstance == LazyDoubleCheckSingleton.getInstance());


    }

}
