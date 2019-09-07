package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SqMaxTest {
    @Test
    public void firstTo2To3To4(){
        int result = SqMax.max(1,3,2,6);
        assertThat(result, is (6));
    }


}