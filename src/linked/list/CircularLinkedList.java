package linked.list;

class NodeCLL {
	int data;
	NodeCLL next;
}

public class CircularLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeCLL head1 = null; 
		head1 = Insert(head1,1);
		printList(head1);
		head1 = Insert(head1,2);
		printList(head1);
		head1 = Insert(head1,3);
		printList(head1);
		head1 = Insert(head1,4);
		printList(head1);
		System.out.println(hasLoop(head1));
		head1 = InsertCLL(head1,5);
		System.out.println(hasLoop(head1));
		//printList(head1);
	}
	static void printList(NodeCLL head)
    {
		NodeCLL temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.println();
    }
static NodeCLL Insert(NodeCLL head,int data){
	//Node current = head;
	NodeCLL new_node = new NodeCLL();
	new_node.data = data;
	new_node.next = null;
	
	if(head == null){
        head = new_node;
	}else{
		NodeCLL current = head;
	    while (current.next != null)
            current = current.next;
        current.next = new_node;
	}
	return head;
}
static NodeCLL InsertCLL(NodeCLL head,int data){
	NodeCLL new_node = new NodeCLL();
	new_node.data = data;
	
	
	if(head == null){
        head = new_node;
	}else{
		NodeCLL current = head;
	    while (current.next != null)
            current = current.next;
	    
	    new_node.next = head.next;
        current.next = new_node;
	}
	return head;
}
static boolean hasLoop(NodeCLL head) {

    if(head == null) // list does not exist..so no loop either.
        return false;

    NodeCLL slow, fast; // create two references.

    slow = fast = head; // make both refer to the start of the list.

    while(true) {

        slow = slow.next;          // 1 hop.

        if(fast.next != null)
            fast = fast.next.next; // 2 hops.
        else
            return false;          // next node null => no loop.

        if(slow == null || fast == null) // if either hits null..no loop.
            return false;

        if(slow == fast) // if the two ever meet...we must have a loop.
            return true;
    }
}
}