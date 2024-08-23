package ex03;

public class Book {
	 String title; //제목
	 String author; //저자
	 int page; //페이지 수
	 
	 Book(){ }
	 
	 Book(String title, String author){
		 this(title,author,0);
		 System.out.println("생성자");
	 }

	 Book(String title, String author,int page){
		 this.title = title;
		 this.author = author;
		 this.page = page;
		 
		 //page = this.page; 오류
	 }	 
	 
	 void displayInfo() {
		 System.out.println("title : " + this.title);
		 System.out.println("author : " + author);
		 System.out.println("page : " + page);
	 }

	 
}