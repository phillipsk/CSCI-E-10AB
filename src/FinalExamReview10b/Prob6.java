
public class Prob6 {
	public static void main(String[] args) {
		ListNode list = new ListNode();
		list.setData(1);
		
		ListNode list4 = new ListNode();
		list4.setData(4);
		
		ListNode list3 = new ListNode();
		list3.setData(3);
		list3.setLink(list4);

		ListNode list2 = new ListNode();
		list2.setData(2);
		list2.setLink(list3);
		
		list2.getLink().getLink().setLink (list); // 2-> 3-> 4-> 1 -> null
		list = list2.getLink (); // 3-> 4-> 1 -> null
		list.getLink().getLink().setLink (null);// 3->4->1-null
		list.getLink().setData (17);// 3-> 17-> 1 -> null

		System.out.println("done");
	}
}
