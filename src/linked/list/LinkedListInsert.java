package linked.list;

class Node{
	int data;
	Node next; 
}
public class LinkedListInsert {
	//Node head;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = null; 
		head1 = InsertAtFirst(head1,1);
		printList(head1);
		head1 = InsertAtFirst(head1,2);
		printList(head1);
		head1 = InsertAtFirst(head1,3);
		printList(head1);
		head1 = InsertAtFirst(head1,4);
		printList(head1);
		head1 = InsertAtFirst(head1,5);
		printList(head1);
		head1 = InsertAtMiddle(head1,6,0);
		printList(head1);
		head1 = DeleteAtMiddle(head1,3);
		printList(head1);
		//PrintReverse(head1);
		head1 = ReverseLinkedList(head1);
		printList(head1);
	}
	static void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.println();
    }
static Node Insert(Node head,int data){
	//Node current = head;
	Node new_node = new Node();
	new_node.data = data;
	new_node.next = null;
	
	if(head == null){
        head = new_node;
	}else{
		Node current = head;
	    while (current.next != null)
            current = current.next;
        current.next = new_node;
	}
	return head;
}

static Node InsertAtFirst(Node head,int data){
	Node new_node = new Node();
	new_node.data = data;
	new_node.next = null;
	if(head == null){
        head = new_node;
	}else{
		Node current = head;
		new_node.next = current;
		head = new_node;
	}
	return head;
}

static Node InsertAtMiddle(Node head,int data,int position){
	Node new_node = new Node();
	new_node.data = data;
	new_node.next = null;
	if(head == null){
        head = new_node;
	}else{
		Node current = head;
		int count =1;
	    while (current.next != null && position != 0){
	    	if(position == count){
	    		break;
	    	}
	    	count++;
	    	current = current.next;
	    }
        if(position == 0){
        	new_node.next = current;
    		head = new_node;
        }else{
        new_node.next = current.next;
        current.next = new_node;
        }
	}
	return head;
}
static Node DeleteAtMiddle(Node head,int position){
	Node current = head;
	Node prev = null;
	int count =0;
	if(position == 0){
    	return head.next;
    }
    while (current.next != null && position != count){
    	count++;
    	prev = current;
    	current = current.next;
    }
     prev.next = current.next;   
	return head;
}
static void PrintReverse(Node head){
	if(head == null)
		return;
	PrintReverse(head.next);
	System.out.println(head.data);
}

static Node ReverseLinkedList(Node head){
	Node current = head;
	Node cur = null;
	Node prev = null;
	while(current != null){
		cur = current.next;
		current.next = prev;
		prev = current;
		current = cur;
	}
	head = prev;
	return head;
}

}
