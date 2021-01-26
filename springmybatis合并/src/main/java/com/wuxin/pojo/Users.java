package com.wuxin.pojo;

public class Users {
    //此处一定要小心,成员变量的名称一定要与表单元素的name属性值一致
    private String uname;
    private int age;

    @Override
    public String toString() {
        return "Users{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Users(String uname, int age) {
        this.uname = uname;
        this.age = age;
    }

    public Users() {
    }
}
