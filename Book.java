public class Book{
    private int bookId;
    private String title;
     private String author;
      private String publisher;
       private int year;
        private int totalCopies;
         private int availableCopies;

         public Book(int id,String title,String author,String publisher,int year,int copies){
            this.bookId=id;
            this.title=title;
            this.author=author;
            this.publisher=publisher;
            this.year=year;
            this.totalCopies=copies;
            this.availableCopies=copies;
         }
         public int getBookId(){
            return bookId;
         }
         public String getTitle(){
            return title;
         }
         public String getAuthor(){
            return author;
         }
         public String getPublisher(){
            return publisher;
         }
         public int getYear(){
            return year;
         }
         public int getTotalCopies(){
            return totalCopies;
         }
         public int getAvailableCopies(){
            return availableCopies;
         }
         public void increaseCopies(){
            availableCopies++;
         }
          public void decreaseCopies(){
            if(availableCopies>0){
            availableCopies--;
        }
         }
         public String fullDetails(){
            return "Book ID:"+ bookId +"| Title:"+ title +"| Author:"+ author +"| Publisher:"+ publisher +"| Year:"+ year +"| Copies:"+ availableCopies +"/"+ totalCopies;
         }

}