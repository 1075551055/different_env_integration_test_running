package com.test;

import junit.category.Env1;
import junit.category.Env2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ITTest extends TestBase{

    @Test
    @Category(Env1.class)
    public void test1(){
        Assert.assertEquals(1, 1);
    }

    @Test
    @Category(Env2.class)
    public void test2(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test3(){
        Assert.assertEquals(1, 1);
    }
}
