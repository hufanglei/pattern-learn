package com.example.proxy.dynamicproxy.jdkproxy;
import com.example.proxy.Person;
import com.example.proxy.staticproxy.Son;
import sun.misc.ProxyGenerator;
import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            //通过反编译工具可以查看源代码
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



//
//    Person obj = (Person) new JDKMeipo().getInstance(new Son());
//            obj.findLove();
//            Object obj = new JDKMeipo().getInstance(new Girl());

//            Method method = obj.getClass().getMethod("findLove",null);
//            method.invoke(obj);