import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
/**
 * Author: Nick McCrory
 * Date: 3/9/2017
 */
public class QueueTest {

    @Test
    public void shouldCreateEmptyQueue() {
        Queue q = new Queue();
        assertThat(q.isEmpty(), is(true));
    }

    @Test
    public void shouldCreateNonEmptyQueue() {
        Queue q = new Queue(8);
        assertThat(q.isEmpty(), is(false));
    }

    @Test
    public void shouldAddNodesToQueue() {
        Queue q = new Queue();
        q.add(0);
        q.add(-10);
        q.add(100);
        q.add(99999);
        assertThat(q.peek(), is(0));
        assertThat(q.getCount(), is(4));
    }

    @Test
    public void shouldPeekToFirstNodeData() {
        Queue q = new Queue();
        q.add(10);
        q.add(-10);
        assertThat(q.peek(), is(-10));
    }

    @Test
    public void shouldRemoveNodeFromQueue() {
        Queue q = new Queue();
        q.add(10);
        q.add(-10);
        q.remove();
        assertThat(q.getCount(), is(1));
    }
}
