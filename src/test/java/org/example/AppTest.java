package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;;
import java.io.FileNotFoundException;

class AppTest {

    private App application;

    @Before
    public void init() {
        application= new App();
    }

    @After
    public void tearDown() {
        application = null;
    }

    @Test
    void TestApp() {
        assertEquals(1, 1);
    }

    @Test
    public void ReadMatrix() throws Exception {
        double[][] matrix = {{2,1},{2,1}};
        assertArrayEquals(matrix, application.ReadMatrix());
    }

    @Test
    public void Summ() {
        double[][] matrixfirst = {{2,4},{2,4}};
        double[][] matrixsecond = {{4,2},{4,2}};
        double[][] result = {{6,6},{6,6}};
        assertArrayEquals(result, application.Summ(matrixfirst, matrixsecond));
    }

    @Test
    public void Multiply() {
        double[][] matrixfirst = {{2,4},{2,4}};
        double[][] matrixsecond = {{4,2},{4,2}};
        double[][] result = {{16,8},{16,8}};
        assertArrayEquals(result, application.Multiply(matrixfirst, matrixsecond));
    }

    @Test
    public void Subtraction() {
        double[][] matrixfirst = {{2,4},{2,4}};
        double[][] matrixsecond = {{4,2},{4,2}};
        double[][] result = {{-2,2},{-2,2}};
        assertArrayEquals(result, application.Subtraction(matrixfirst, matrixsecond));
    }

    @Test
    public void Division() {
        double[][] matrixfirst = {{2,4},{2,4}};
        double[][] matrixsecond = {{4,2},{4,2}};
        double[][] result = {{1.5,3},{1.5,3}};
        assertArrayEquals(result, application.Division(matrixfirst, matrixsecond));
    }

    @ParameterizedTest

    @ValueSource(strings = { "0, 1, 1, 1, 0 ", "0, 0, 1, 0, 0 ", "0, 0, 1, 0, 0 ", "0, 1, 1, 1, 0 "})
    void Palindrome(String date) {
        assertTrue(App.Palindrome(date));
    }

    @Test
    public void Transpose() {
        double[][] matrix = {{4,2},{4,2}};
        double[][] result = {{4,4},{2,2}};
        assertArrayEquals(result, application.Transpose(matrix));
    }

    @Test
    public void Determinant() throws FileNotFoundException {
        double[][] matrix = {{2,4},{4,2}};
           assertEquals(-12, application.Determinant(matrix));
    }

    @Test
    public void Minor() {
        double[][] matrixfirst = {{2,4},{2,4}};
        double[][] matrixsecond = {{2}};
        assertArrayEquals(matrixsecond, application.Minor(matrixfirst,1,1));
    }

    @Test
    public void Сomparison() {
        double[][] matrixfirst = {{2,4},{4,2}};
        double[][] matrixsecond = {{4,2},{2,4}};
        int result = application.Comparison(matrixfirst, matrixsecond);
        Assert.assertEquals(-1, result);
    }

}
