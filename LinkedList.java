
public class LinkedList
{
	Node head;
	
	public void insert(int data)
	{
		Node node=new Node();  //way to creating new node as well as node is an object
		node.data=data;        //data passes by user
		node.next=null;
		
		if(head==null)     //1st object is inserting and head is null
		{
			head=node;     //node itself as a head
		}
		else               //what if this is not  1st object
		{
			Node n=head;   //create new node and mention as a head
			
			while(n.next!=null)
			{
				n=n.next;  //check and if it is not null jumped 1st,2nd ,3rd 
			}
			n.next=node;  //moving stop get null at the end 
		}
	}
	public void show()    //print all value
	{
		Node node=head;    
		while(node.next!=null) //traverse and print
		{
			System.out.println(node.data);
			node=node.next;  //shift the next node
		}
	}

}
