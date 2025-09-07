package stackperson;

import java.util.Scanner;
public class TicketCounterStack {                            
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = null;
		
	    System.out.println("choose initialization:");
        System.out.println("1. Empty stack with size");
        System.out.println("2. Stack initialized with array of Persons");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter size: ");
            int size = sc.nextInt();
            st = new Stack(size);
        }
        else if (choice == 2) {
            System.out.print("Enter number of Persons: ");
            int n = sc.nextInt();
            Person arr[] = new Person[n];
            st= new Stack(n);
            for (int i = 0; i < n; i++) {
            	sc.nextLine();
            	System.out.println("enter details for person" +(i+1));
            	System.out.print("name:");
            	String name =sc.nextLine();
            	System.out.print("age:");
            	int  age  =sc.nextInt();
            	System.out.print("Gender (FEMALE/MALE/OTHER):");
            	String g=sc.next().toUpperCase();
            	arr[i]=new Person(name,age,Gender.valueOf(g));
            }
            st=new Stack (arr);
        }

            int option;
            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Push one Person");
                System.out.println("2. Push two Persons");
                System.out.println("3. Pop one Person");
                System.out.println("4. Pop multiple Persons");
                System.out.println("5. Display all Persons");
                System.out.println("6. Display top n Persons");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                option = sc.nextInt();
                switch(option) {
                case 1:
                   sc.nextLine();
                   System.out.print("enter name:");
                   String name1=sc.nextLine();
                   System.out.print("enter age:");
                   int age1=sc.nextInt();
                   System.out.print("enter gender(MALE/FEMALE/OTHER:");
                   String g1=sc.next().toUpperCase();
                   Person p1 =new Person(name1,age1,Gender.valueOf(g1));                 
                   st.push(p1);
                     break;
                case 2:
                	  sc.nextLine();
                	  System.out.println("enter details of person1:");
                	  System.out.print("name:");
                	  String name=sc.nextLine();
                	  System.out.print("age:");
                	  int age=sc.nextInt();
                	  System.out.print("enter gender(MALE/FEMALE/OTHER:");
                	  String g2=sc.next().toUpperCase();
                	  sc.nextLine();
                	  
                	  System.out.println("enter details of person2:");
                	  System.out.print("name:");
                	  String name2=sc.nextLine();
                	  System.out.print("age:");
                	  int age2=sc.nextInt();
                	  System.out.print("enter gender(MALE/FEMALE/OTHER:");
                	  String g3=sc.next().toUpperCase();
                	  
                	  Person per1= new Person(name,age,Gender.valueOf(g2));
                	  Person per2= new Person(name2,age2,Gender.valueOf(g3));	
                	  st.push(per1,per2);
                      break;

                case 3:
                    Person popped = st.pop();
                    if (popped != null) popped.displayPerson();
                    break;

                case 4:
                    System.out.print("Enter number of Persons to pop: ");
                    int nPop = sc.nextInt();
                    st.pop(nPop);
                    break;

                case 5:
                    st.display();
                    break;

                case 6:
                    System.out.print("Enter number of top Persons: ");
                    int topN = sc.nextInt();
                    st.display(topN);
                    break;

                case 7:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } 
            while(option != 7);
            sc.close();
    		
    }
	}


            


	


