
import java.util.Scanner;

class Main{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0){

            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

    private static Node insert(Node head, int data){
        

        if (head == null){

            head = new Node(data);

        }
        else {

            Node currentHead = head;

            while (currentHead.next != null){

                currentHead = currentHead.next;
            }

            currentHead.next = new Node(data);


        }

        return head;
    }

    private static void display(Node head) {

        Node start = head;
        while (start != null){

            System.out.print(start.data + " ");
            start = start.next;
        }
    }

}


class Node {

    Node next;
    int data;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

