package test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler{

    private Object targetClass;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start");
        Object result = method.invoke(proxy,args);
        System.out.println("end");
        return result;
    }

    private Object getJdkProxy(Object targetClass){
        this.targetClass = targetClass;
        return Proxy.newProxyInstance(targetClass.getClass().getClassLoader(),targetClass.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        TargerClass targetClass = new TargerClass();
        UserManager userManager = (UserManager) jdkProxy.getJdkProxy(targetClass);
        userManager.insertUser("zhangsan");
        userManager.delUser("zhangsan");
    }
}
