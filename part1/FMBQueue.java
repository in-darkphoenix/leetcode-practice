package part1;
// https://leetcode.com/problems/design-front-middle-back-queue/

import java.util.LinkedList;

class FMBQueue {
    LinkedList<Integer> q = null;

    public FMBQueue() {
        q = new LinkedList<Integer>();
    }

    public void pushFront(int val) {
        q.addFirst(val);

    }

    public void pushMiddle(int val) {
        q.add(q.size() / 2, val);
    }

    public void pushBack(int val) {
        q.addLast(val);
    }

    public int popFront() {
        if (q.isEmpty())
            return -1;
        return q.removeFirst();
    }

    public int popMiddle() {
        if (q.isEmpty())
            return -1;
        if (q.size() % 2 == 0)
            return q.remove((q.size() / 2) - 1);
        else
            return q.remove(q.size() / 2);
    }

    public int popBack() {
        if (q.isEmpty())
            return -1;
        return q.removeLast();
    }
}