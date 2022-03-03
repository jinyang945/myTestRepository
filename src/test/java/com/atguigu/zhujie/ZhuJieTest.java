package com.atguigu.zhujie;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class ZhuJieTest {

    @Test
    public void test1() throws NoSuchMethodException {
        Class<ZhuJieTest> clazz = ZhuJieTest.class;
        Method test01 = clazz.getMethod("test2");
        MyAnnotation[] mas = test01.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation ma : mas) {
            System.out.println(ma.value());
        }

    }


    @MyAnnotation("Hello")
    @MyAnnotation("World")
    public void test2(){

    }
}
