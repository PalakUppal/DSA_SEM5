// Last updated: 10/5/2026, 5:27:55 PM
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        Queue<Integer> q = new LinkedList<>();
4        for (int student : students) {
5            q.add(student);
6        }
7
8        int sI = 0;
9        int rot = 0;
10        while (!q.isEmpty() && rot < q.size()) {
11            if (q.peek() == sandwiches[sI]) {
12                q.poll();
13                sI++;
14                rot = 0;
15            } else {
16                q.add(q.poll());
17                rot++;
18            }
19        }
20        return q.size();
21    }
22}