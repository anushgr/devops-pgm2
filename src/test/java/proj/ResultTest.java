package proj;

import org.testng.Assert;

import org.testng.annotations.Test;
public class ResultTest {
@Test
public void testPass() {
Assert.assertEquals(pgm1.display(55), "Pass");
}
@Test
public void testFail() {
Assert.assertEquals(pgm1.display(35), "Fail");
}
@Test
public void testInvalid() {
Assert.assertEquals(pgm1.display(-5), "Invalid");
}
}