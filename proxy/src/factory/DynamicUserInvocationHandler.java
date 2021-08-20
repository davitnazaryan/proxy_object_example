package factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class DynamicUserInvocationHandler implements InvocationHandler {
    private Map<String,Object> storage;

    public DynamicUserInvocationHandler() {
        this.storage = new HashMap<>();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.startsWith("set")){
            storage.put(methodName.substring(3),args[0]);
        }else if (methodName.startsWith("get")){
            return storage.get(methodName.substring(3));
        }else if (methodName.equals("toString")){
            StringBuilder stringBuilder = new StringBuilder("{");
            for (Map.Entry<String, Object> entry : storage.entrySet()) {
                stringBuilder.append("\"").append(entry.getKey()).append("\":").append(entry.getValue().toString());
            }
            return stringBuilder.append("}").toString();
        }
        return null;
    }
}
