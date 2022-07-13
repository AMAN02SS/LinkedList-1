package com.company;

public class Main {

    public static void main(String[] args) {
	SinglyLinkedList sLL = new SinglyLinkedList();
	sLL.createSinglyLinkedList(5);
//        System.out.println(sLL.head.Value);
        sLL.insertInLinkedList(6,1);
//        System.out.println(sLL.head.Value);
        sLL.insertInLinkedList(7,3);
        sLL.insertInLinkedList(8,5);
        sLL.insertInLinkedList(6,7);
        sLL.traversingSLL();
        sLL.deleteNode(7);
        sLL.traversingSLL();
//        sLL.insertInLinkedList(10,9);
////        System.out.println(sLL.head.next.Value);
//
//        sLL.searchSLL(2);


    }
}
