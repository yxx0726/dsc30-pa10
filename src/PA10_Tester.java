/**
 * Name: Xin Yu
 * PID: 14494949
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

import static org.junit.Assert.*;

public class PA10Tester {

    @org.junit.Test
    public void mergeLists() {
        LinkedList<Integer> test1 = new LinkedList<>();
        LinkedList<Integer> test2 = new LinkedList<>();
        test1.add(1);
        test1.add(3);
        test1.add(5);
        test2.add(2);
        test2.add(4);
        test2.add(6);
        LinkedList<Integer> result = new LinkedList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        assertEquals(result, PA10.mergeLists(test1, test2));

        LinkedList<Integer> test3 = new LinkedList<>();
        LinkedList<Integer> test4 = new LinkedList<>();
        test3.add(5);
        test3.add(10);
        test3.add(20);
        test4.add(7);
        test4.add(9);
        test4.add(10);
        test4.add(19);
        test4.add(200);
        test4.add(300);
        LinkedList<Integer> result1 = new LinkedList<>();
        result1.add(5);
        result1.add(7);
        result1.add(9);
        result1.add(10);
        result1.add(10);
        result1.add(19);
        result1.add(20);
        result1.add(200);
        result1.add(300);
        assertEquals(result1, PA10.mergeLists(test3, test4));

        LinkedList<Integer> test5 = new LinkedList<>();
        LinkedList<Integer> test6 = new LinkedList<>();
        LinkedList<Integer> result2 = new LinkedList<>();
        assertEquals(result2, PA10.mergeLists(test5, test6));

        LinkedList<Integer> test7 = new LinkedList<>();
        LinkedList<Integer> test8 = new LinkedList<>();
        LinkedList<Integer> result3 = new LinkedList<>();
        test7.add(10);
        result3.add(10);
        assertEquals(result3, PA10.mergeLists(test7, test8));

    }

    @org.junit.Test
    public void paranChecker() {
        String test1 = "()()()";
        assertEquals(true, PA10.paranChecker(test1));

        String test2 = "()()(";
        assertEquals(false, PA10.paranChecker(test2));

        String test3 = "(((()))";
        assertEquals(false, PA10.paranChecker(test3));
    }

    @org.junit.Test
    public void stackMax() {
        Stack<Integer> test1 = new Stack<>();
        test1.add(1);
        test1.add(2);
        test1.add(3);
        test1.add(7);
        test1.add(1);
        int result = 7;
        assertEquals(result, PA10.stackMax(test1));

        Stack<Integer> test2 = new Stack<>();
        test2.add(1);
        test2.add(2);
        test2.add(3);
        test2.add(10);
        test2.add(100);
        int result1 = 100;
        assertEquals(result1, PA10.stackMax(test2));

        Stack<Integer> test3 = new Stack<>();
        int result2 = 0;
        assertEquals(result2, PA10.stackMax(test3));

    }

    @org.junit.Test
    public void elemNumHeap() {
        PriorityQueue<Integer> test1 = new PriorityQueue<>();
        int val1 = 5;
        test1.add(1);
        test1.add(3);
        test1.add(4);
        test1.add(5);
        test1.add(7);
        test1.add(3);
        int result = 4;
        assertEquals(result, PA10.elemNumHeap(test1, val1));

        PriorityQueue<Integer> test2 = new PriorityQueue<>();
        int val2 = 5;
        int result1 = 0;
        assertEquals(result1, PA10.elemNumHeap(test2, val2));

        PriorityQueue<Integer> test3 = new PriorityQueue<>();
        test3.add(0);
        test3.add(20);
        test3.add(12);
        test3.add(100);
        int val3 = 100;
        int result2 = 3;
        assertEquals(result2, PA10.elemNumHeap(test3, val3));
    }

    @org.junit.Test
    public void findMissing() {
        int[] test1 = new int[4];
        test1[0] = 1;
        test1[1] = 1;
        test1[2] = 2;
        test1[3] = 2;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(3);
        result.add(4);
        assertEquals(result, PA10.findMissing(test1));

        int[] test2 = new int[6];
        test2[0] = 1;
        test2[1] = 2;
        test2[2] = 3;
        test2[3] = 4;
        test2[4] = 2;
        test2[5] = 2;
        ArrayList<Integer> result1 = new ArrayList<>();
        result1.add(5);
        result1.add(6);
        assertEquals(result1, PA10.findMissing(test2));

        int[] test3 = new int[0];
        ArrayList<Integer> result2 = new ArrayList<>();
        result2.add(0);
        assertEquals(result2, PA10.findMissing(test3));

        int[] test4 = new int[5];
        test4[0] = 1;
        test4[1] = 2;
        test4[2] = 3;
        test4[3] = 4;
        test4[4] = 5;
        ArrayList<Integer> result3 = new ArrayList<>();
        result3.add(0);
        assertEquals(result3, PA10.findMissing(test4));

    }
}