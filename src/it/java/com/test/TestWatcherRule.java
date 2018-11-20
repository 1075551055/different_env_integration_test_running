package com.test;

import junit.category.ConfigUtil;
import junit.category.Env1;
import junit.category.Env2;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

//this class is to solve the issue that it will run failed in idea tool when a test class which contain "env1" and "env2" test case
public class TestWatcherRule {
    static {
//        load config here
    }
    @Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        public Statement apply(Statement base, Description description) {
            return new Statement() {
                @Override
                public void evaluate() throws Throwable {
                    Category methodAnnotation = description.getAnnotation(Category.class);
                    Category classAnnotation = description.getTestClass().getAnnotation(Category.class);
                    if(ConfigUtil.getEnvInfo().equals("env1")) {
                        if((classAnnotation != null && classAnnotation.value()[0] == Env2.class) || (methodAnnotation != null && methodAnnotation.value()[0] == Env2.class)){
                            //An assumption failure causes the test to be ignored. Ignore test method dynamically
                            Assume.assumeTrue(false);
                        }
                    }else if(ConfigUtil.getEnvInfo().equals("env2")) {
                        if((classAnnotation != null && classAnnotation.value()[0] == Env1.class) || (methodAnnotation != null && methodAnnotation.value()[0] == Env1.class)){
                            //An assumption failure causes the test to be ignored. Ignore test method dynamically
                            Assume.assumeTrue(false);
                        }
                    }
                    base.evaluate();
                }
            };
        }
    };
}
