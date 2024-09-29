package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static edu.uoc.ds.adt.util.ContainerFiller.pr1FillQueue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr1q;

    @Before
    public void setUp() {
        this.pr1q = new PR0Queue();

        assertNotNull(this.pr1q.getQueue());
        pr1FillQueue(this.pr1q.getQueue());
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr1q.CAPACITY, this.pr1q.getQueue().size());
        Assert.assertEquals(1, pr1q.poll());
        Assert.assertEquals(4, pr1q.poll());
        Assert.assertEquals(9, pr1q.poll());
        Assert.assertEquals(0, pr1q.poll());
        Assert.assertEquals(1, pr1q.poll());
        Assert.assertEquals(4, pr1q.poll());
        Assert.assertEquals(9, pr1q.poll());
        Assert.assertEquals(0, pr1q.poll());
        Assert.assertEquals(1, pr1q.poll());
        Assert.assertEquals(4, pr1q.poll());
        Assert.assertEquals(9, pr1q.poll());
        Assert.assertEquals(0, pr1q.poll());
        Assert.assertEquals(1, pr1q.poll());
        Assert.assertEquals(4, pr1q.poll());
        Assert.assertEquals(9, pr1q.poll());
        assertEquals(0, this.pr1q.getQueue().size());
    }


}
