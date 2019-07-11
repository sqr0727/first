package test.proxy;

public class TargerClass implements UserManager {
    @Override
    public void insertUser(String username) {
        System.out.println("添加了新用户"+username);
    }

    @Override
    public void delUser(String username) {
        System.out.println("删除了用户"+username);
    }
}
