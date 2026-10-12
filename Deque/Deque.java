package Queue;
import java.util.*;

public class Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        System.out.println(dq); 
        dq.addFirst(20);
        System.out.println(dq);
        dq.addLast(30);
        System.out.println(dq);
        dq.addLast(40);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
	}

}
