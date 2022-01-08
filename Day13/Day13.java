package HackerRankChallange;


	class Day13 extends Book {
	    int price;

	    Day13 (String title, String author, int price) {
	        super(title, author);
	        this.price = price;
	    }
	    void display() {
	        String title;
			System.out.println("Title: " + title);
	        String author;
			System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	    }
	}


