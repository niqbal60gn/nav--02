package pkg;

import org.testng.annotations.Test;

public class ParallelTest {
    
    // Priority 1 tests - will run first (lower number = higher priority)
    @Test(priority = 1, groups = {"smoke", "regression"})
    public void test1() {
        System.out.println("Test1 - Smoke & Regression");
    }
    
    @Test(priority = 1, groups = {"smoke"})
    public void test2() {
        System.out.println("Test2 - Smoke Only");
    }
    
    // Priority 2 tests - will run after priority 1 tests
    @Test(priority = 2, groups = {"regression"})
    public void test3() {
        System.out.println("Test3 - Regression Only");
    }
    
    @Test(priority = 2, groups = {"regression", "integration"})
    public void test4() {
        System.out.println("Test4 - Regression & Integration");
    }
    
    // Priority 3 tests - will run last
    @Test(priority = 3, groups = {"integration"})
    public void test5() {
        System.out.println("Test5 - Integration Only");
    }
    
    // Test with no priority (defaults to 0) and no groups
    @Test
    public void test6() {
        System.out.println("Test6 - No Group, Priority 0");
    }
}
