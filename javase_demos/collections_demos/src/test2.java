/**
 * @Classname test2
 * @Description TODO
 * @Date 2020/7/30 15:12
 * @Author 曹珂
 */
public class test2 {
    class test2 {
        public boolean isPalindrome(ListNode head) {
            List<Integer> vals = new ArrayList<>();

            // Convert LinkedList into ArrayList.
            ListNode currentNode = head;
            while (currentNode != null) {
                vals.add(currentNode.val);
                currentNode = currentNode.next;
            }

            // Use two-pointer technique to check for palindrome.
            int front = 0;
            int back = vals.size() - 1;
            while (front < back) {
                // Note that we must use ! .equals instead of !=
                // because we are comparing Integer, not int.
                if (!vals.get(front).equals(vals.get(back))) {
                    return false;
                }
                front++;
                back--;
            }
            return true;
        }

}
