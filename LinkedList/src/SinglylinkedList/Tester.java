package SinglylinkedList;

import java.util.Scanner;

import SinglylinkedList.SinglyLinkedList.Node;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
		SinglyLinkedList l1 = new SinglyLinkedList();
		l1.addatEnd(10);l1.addatEnd(20);l1.addatEnd(30);l1.addatEnd(40);l1.addatEnd(50);
		
		boolean flag = false;
		
		do {
			try {
				System.out.println("0/Exit 1/Add at end 2/Add at start 3/Show all List 4/Add any position"
						+ "/5 delete at start /6 delete Last /7 deleteAsPos(int pos) /8 delete ALL \n /9 reverse");
				
				
				 
			switch (sc.nextInt()) {
			case 1:
	
				System.out.println("Enter data to add ");
				l1.addatEnd(sc.nextInt());
				
				break;
			case 2://Add at start
				System.out.println("Enter data to add ");
				l1.addatFirst(sc.nextInt());
				
				break;
			case 3:
				l1.show();
				break;
			case 4:
				System.out.println("Enter the postion and DATA you want to ADD");
				l1.addanyposition(sc.nextInt(), sc.nextInt());
				break;
			case 5 :
				l1.deleteFirst();
				break;
			case 6:
				l1.deleteLast();
				break;
			case 7:
				System.out.println("at position to remove data");
				l1.deleteAsPos(sc.nextInt());
				break;
			case 8:
				l1.deleteAll();
				break;
			case 9:
				l1.reverselist();
				break;
			case 10:
				l1.recureverselist();
				break;
			case 11 :
				Node data = new Node(60);
				Node data1 = new Node(data,70);
				Node data2 = new Node(data1,80);
				Node data3 = new Node(data2,90);
				l1.addatEnd(data3);
				break;
			case 0:
				flag = true;
				break;

			default:
				break;
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		} while (flag != true);

		}
	}

}
