package edu.uoc.ds.adt.util;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.Stack;

public class ContainerFiller {
    public static void pr1FillQueue(Queue<Integer> queue) {
        for (int i = 1; i <= 15; i++) {
            int v = i%4;
            queue.add(v*v);
        }
    }

    public static void pr1FillStack(Stack<Integer> stack) {
        for (int i = 1; i <= 15; i++) {
            int v = i%4;
            stack.push(v*v);
        }
    }
}
