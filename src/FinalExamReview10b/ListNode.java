public class ListNode {
	private Integer data;
	private ListNode link;

	public ListNode() {
		link = null;
		data = null;
	}

	public ListNode(int newData, ListNode linkValue) {
		data = newData;
		link = linkValue;
	}

	public void setData(int newData) {
		data = newData;
	}

	public int getData() {
		return data;
	}

	public void setLink(ListNode newLink) {
		link = newLink;
	}

	public ListNode getLink() {
		return link;
	}
}