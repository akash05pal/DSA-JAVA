// // package linkedlist;
// // public class entry {
    

// //     public static void main(String[] args) {
// //         int[] arr={12,3,2,4};
// //         Node head  = convertArr2LL(arr);
// //         Node temp= head;
// //         while(temp != null){
// //             System.out.print(temp.data + " ");
// //             temp=temp.next;
// //         }
// //        // System.out.println(head.data);

// //     }
// // }
// class Node {
//     int data;
//     Node next;

//     Node(int data1, Node next1){
//         this.data = data1;
//         this.next = next1;
//     }
//     Node(int data1){
//         this.data =data1;
//         this.next = null;
//     }
// }

// // 

// public class deletionnodeLL {
//     private static Node convertArr2LL(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i=1;i<arr.length;i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover=temp;
    
//         }
//         return head;
//     }

//     private static void print(Node head){
//         Node temp = head;
//         while(head != null){
//             System.out.print(head.data + " ");
//             head = head.next;
//         }
//     }

//     private static Node removesHead(Node head){
//         if(head == null){
//             return head;
//         head = head.next;
//         return head;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr={12,3,2,4};
//         Node head  = convertArr2LL(arr);
//         head = removesHead(head);
//         print(head);
//        // System.out.println(head.data);
//     }


// }
class Node {
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class deletionnodeLL {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    
    private static void print(Node head){
        Node temp = head;
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    private static Node removesHead(Node head){
        if(head == null){
            return head;
        }  // This closing brace was missing
        head = head.next;
        return head;
    }
    
    public static void main(String[] args) {
        int[] arr={12,3,2,4};
        Node head = convertArr2LL(arr);
        head = removesHead(head);
        print(head);
    }
}
