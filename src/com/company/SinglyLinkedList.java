package com.company;

import java.nio.file.attribute.PosixFileAttributes;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int Size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.Value = nodeValue;
        head = node;
        tail = node;
        Size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.Value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
        }
        else if(location >= Size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else{
            Node tempNode = head;
            int index =0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        Size++;
    }

    public void traversingSLL(){
        if(head == null){
            System.out.println("SLL not exists");
        }
        else{
            Node tempNode = head;
            for(int i=0;i<Size;i++){
                System.out.print(tempNode.Value);
                if(i != Size-1){
                    System.out.print("--->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    public boolean searchSLL(int searchValue){
       if(head != null) {
           Node currentNode = head;
           for (int i = 0; i < Size; i++) {
               if (currentNode.Value == searchValue) {
                   System.out.println("Value is found at position " + i);
                   return true;
               }
               currentNode = currentNode.next;
           }
       }
       System.out.println("Value did not exist in the Linked List");
       return false;
    }

    public void deleteNode(int location){
        if(head == null){
            System.out.println("Linked List is not Exist");
        }
        else{
            if(location == 0){
                head = head.next;
                Size--;
                if(Size == 0) {
                    tail = null;
                }
            }
            else if(location >= Size){
                Node tempNode = head;
                for(int i=0;i<Size-1;i++){
                    tempNode = tempNode.next;
                }
                if(tempNode == head){
                    tail = head = null;
                    Size--;
                    return;
                }
                tempNode.next = null;
                tail = tempNode;
                Size--;
            }
            else{
                Node tempNode = head;
                for(int i=0;i<location-1;i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                Size--;
            }
        }
    }


}
