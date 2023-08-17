	package linked.list;

class NodeDLL {
	int data;
	NodeDLL next;
	NodeDLL prev;
}
public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDLL head1 = null; 
		head1 = Insert(head1,1);
		printList(head1);
		head1 = Insert(head1,2);
		printList(head1);
		head1 = Insert(head1,4);
		printList(head1);
		head1 = Insert(head1,5);
		printList(head1);
		//head1 = SortedDLLInsert(head1,3);
		//printList(head1);
		head1 = SortedDLLReverse(head1);
		printList(head1);
		
	}
	static void printList(NodeDLL head)
    {
		NodeDLL temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.println();
    }
	static NodeDLL Insert(NodeDLL head,int data){
		NodeDLL new_node = new NodeDLL();
		new_node.data = data;
		new_node.next = null;
		new_node.prev = null;
		
		if(head == null){
	        head = new_node;
		}else{
			NodeDLL current = head;
		    while (current.next != null)
	            current = current.next;
		    new_node.prev = current;
	        current.next = new_node;
		}
		return head;
	}
	static NodeDLL SortedDLLInsert(NodeDLL head,int data){
		NodeDLL new_node = new NodeDLL();
		new_node.data = data;
		new_node.next = null;
		new_node.prev = null;
		NodeDLL current = head;
		NodeDLL previous= null;
		while(current != null && current.data < data){
			previous = current;
			current = current.next;
		}
		new_node.next = current;
		new_node.prev = previous;
		previous.next = new_node;
		current = previous;
		return head;
	}
	static NodeDLL SortedDLLReverse(NodeDLL head){
		NodeDLL temp = null;
		NodeDLL current = head;
 
        /* swap next and prev for all nodes of 
         doubly linked list */
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
 
        /* Before changing head, check for the cases like empty 
         list and list with only one node */
        if (temp != null) {
            head = temp.prev;
        }
		return head;
	}
}
