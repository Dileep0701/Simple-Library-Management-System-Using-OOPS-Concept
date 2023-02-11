
package oops;
public class lb { //creating class and assigning variables
	String Name;
	long No;
	int Age;
	String BookName;
	String Aurthour;
	int BookNo;
	String RegistrationNo;
	String Message;
	
	//for every set of variables create a method 
	//creating method for user
	 
	void user(String Name1,long No1,int Age1) { //this pointer
		Name=Name1;
		No=No1;
		Age=Age1;
	}
	 //creating method for Book
	 
	void Book(String BookName1,String Aurthour1,int BookNo1) { //this pointer
		 BookName=BookName1;
		 Aurthour=Aurthour1;
		 BookNo=BookNo1;
	 }
	 //creating method for card
	 
	void card(String RegistrationNo1) {
		 RegistrationNo=RegistrationNo1;
	 }
	 //creating method for RemainderMessage
	 
	void RemainderMEssage(String Message1) {
		 Message=Message1;
	 }
	void displayinformation1() {
		System.out.println( "Name is: "  +Name);
		System.out.println( "No is: "  +No);
		System.out.println( "Age is: "  +Age);
	}
	void displayinformation2() {
		System.out.println("BookName is:"+BookName);
		System.out.println("Aurthour is:"+Aurthour);
		System.out.println("Book no is: "+BookNo);
	}
	void displayinformation3() {
		System.out.println("RegistrationNo is :"+RegistrationNo);
	}
	void displayinformation4() {
		System.out.println("Message is: "+Message);
	}
	//Assigning values and printing the values
	
	public static void main(String[] args) {
		 lb u1=new lb();
		 lb b1=new lb();
		 lb c1=new lb();
		 lb rm1=new lb();
		 u1.user("Dileep", 630221263, 21);
		 b1.Book("LOVE TRIANGLE","DileepReddy",100);
		 c1.card("19MIC0064");
		 rm1.RemainderMEssage("Please Return After Completion");
		 u1.displayinformation1();
		 b1.displayinformation2();
		 c1.displayinformation3();
		 rm1.displayinformation4();
		 
	}
}
