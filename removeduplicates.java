import java.util.*;
class Node
{
  int data;
  Node next;
  public Node(int data)
  {
    this.data=data;
    next=null;
  }
}
class removeduplicates
{
  public static void display(Node head)
  {
     Node temp=head;
     while(temp.next!=null)
     {
        System.out.print(temp.data+"-->");
        temp=temp.next;
     }
     System.out.println(temp.data);
  }
  
 public static Node removeDuplicates(Node head)
 {
     HashSet<Integer> hs=new HashSet<Integer>();
     Node temp=head,prev=null;
     if(head==null)
       return null;
     if(head.next==null)
       return head;
     while(temp!=null)
     {
         int val=temp.data;
         if(!hs.contains(val))
          {
            hs.add(val);
            prev=temp;
            temp=temp.next;
          }
          else
          {
            prev.next=temp.next;
            temp=temp.next;
          }
     }
    return head;
 }

  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     Node head=null;
     int n=sc.nextInt();
     int ele;
     while(n-->0)
     {
        ele=sc.nextInt();
        Node n1=new Node(ele);
        if(head==null)
             head=n1;
        else
         {
            Node curr=head;
	    while(curr.next!=null)
	       curr=curr.next;
	    curr.next=n1;
            
         }
     }
     //System.out.println("Before Removal of duplicates");
     //display(head);
     //head=removeDuplicates(head);
  
     System.out.println("After Removal of duplicates");
     display(head); 
    
  }
}

