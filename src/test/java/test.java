import org.example.Main.LinkedStack;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class test {
    LinkedStack ls = new LinkedStack();
    @Test
    public void start_test(){
        Assertions.assertEquals(0, ls.getSize());
        Assertions.assertTrue(ls.isEmpty());
        Assertions.assertEquals("EMPTY", ls.toString());
    }
    @Test
    public void work_test(){
        int i = 3;
        Assertions.assertEquals(0, ls.getSize());
        ls.push(i);
        Assertions.assertEquals(1, ls.getSize());
        Assertions.assertEquals(i, ls.pop());
        ls.push(i);
        ls.push(i);
        ls.push(i);
        ls.push(i);
        Assertions.assertEquals(4, ls.getSize());
        Assertions.assertFalse(ls.isEmpty());

    }
    @Test
    public void final_test(){
        for (int i = 0; i < 30; i++) {
            ls.push(i);
        }
        Assertions.assertEquals(30, ls.getSize());
        Assertions.assertFalse(ls.isEmpty());
        for (int i = 1; i < 31; i++) {
            Assertions.assertEquals(30 - i, ls.pop());
        }
    }
    @Test
    public void hamcrest_start_test(){
        MatcherAssert.assertThat(ls.getSize(), Matchers.equalTo(0));
        MatcherAssert.assertThat(ls.isEmpty(), Matchers.equalTo(true));
        MatcherAssert.assertThat(ls.toString(), Matchers.equalTo("EMPTY"));
    }
    @Test
    public void hamcrest_work_test(){
        int i = 3;
        MatcherAssert.assertThat(ls.getSize(), Matchers.equalTo(0));
        ls.push(i);
        MatcherAssert.assertThat(ls.getSize(), Matchers.equalTo(1));
        MatcherAssert.assertThat(ls.pop(), Matchers.equalTo(i));
        ls.push(i);
        ls.push(i);
        ls.push(i);
        ls.push(i);
        MatcherAssert.assertThat(ls.getSize(), Matchers.equalTo(4));
        MatcherAssert.assertThat(ls.isEmpty(), Matchers.equalTo(false));
    }
    @Test
    public void hamcrest_final_test(){
        for (int i = 0; i < 30; i++) {
            ls.push(i);
        }
        MatcherAssert.assertThat(ls.getSize(), Matchers.equalTo(30));
        MatcherAssert.assertThat(ls.isEmpty(), Matchers.equalTo(false));
        for (int i = 1; i < 31; i++) {
            MatcherAssert.assertThat(ls.pop(), Matchers.equalTo(30 - i));
        }
    }
}
