package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static edu.uoc.ds.adt.util.ContainerFiller.pr1FillStack;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr1s;

    @Before
    public void setUp() {
        this.pr1s = new PR0Stack();

        assertNotNull(this.pr1s.getStack());
        pr1FillStack(this.pr1s.getStack());
    }

    @After
    public void release() {
        this.pr1s = null;
    }


    @org.junit.Test
    public void stackTest() {
        assertEquals(this.pr1s.CAPACITY, this.pr1s.getStack().size());
        Assert.assertEquals(9, pr1s.pop());
        Assert.assertEquals(4, pr1s.pop());
        Assert.assertEquals(1, pr1s.pop());
        Assert.assertEquals(0, pr1s.pop());
        Assert.assertEquals(9, pr1s.pop());
        Assert.assertEquals(4, pr1s.pop());
        Assert.assertEquals(1, pr1s.pop());
        Assert.assertEquals(0, pr1s.pop());
        Assert.assertEquals(9, pr1s.pop());
        Assert.assertEquals(4, pr1s.pop());
        Assert.assertEquals(1, pr1s.pop());
        Assert.assertEquals(0, pr1s.pop());
        Assert.assertEquals(9, pr1s.pop());
        Assert.assertEquals(4, pr1s.pop());
        Assert.assertEquals(1, pr1s.pop());
        assertEquals(0, this.pr1s.getStack().size());
    }
}
