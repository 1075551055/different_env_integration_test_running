package com.test;

import org.junit.Before;

public class TestBase extends TestWatcherRule {

//    @Rule
//    public MethodRule watchman = new TestWatchman() {
//        public void starting(FrameworkMethod method) {
//            System.out.println("Starting test: " + method.getName());
//            Category annotation = method.getAnnotation(Category.class);
//            System.out.println(annotation.value()[0] == Env2.class);
//        }
//    };

//    @Rule
//    public TestRule watcher = new TestWatcher() {
//        protected void starting(Description description) {
//            Category annotation = description.getAnnotation(Category.class);
//            System.out.println("Starting test: " + description.getMethodName());
//            if(annotation != null && annotation.value()[0] == Env1.class){
////                An assumption failure causes the test to be ignored.
//                org.junit.Assume.assumeTrue(false);
//            }
//        }
//    };

    @Before
    public void setUp(){
        //Conditionally ingore test case in run time:https://stackoverflow.com/questions/1689242/conditionally-ignoring-tests-in-junit-4
//        org.junit.Assume.assumeTrue(false);
    }

}
