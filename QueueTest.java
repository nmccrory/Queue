import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
/**
 * Author: Nick McCrory
 * Date: 3/9/2017
 */
public class QueueTest {

    @Test
    public void shouldCreateEmptyQueue(){
        Queue q = new Queue();
        assertThat(q.isEmpty(), is(true));
    }
    
}
