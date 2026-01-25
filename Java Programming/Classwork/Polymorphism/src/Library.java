 
class Library
{
	 
    int libraryId;
    String libraryName;
    int totalBooks;

    
        Library() {
        this.libraryId = 0;
        this.libraryName = "Not Given";
        this.totalBooks = 0;
    }

    
    Library(int libraryId, String libraryName, int totalBooks) 
    {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
    }

    void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    int getLibraryId() {
        return libraryId;
    }

    String getLibraryName() {
        return libraryName;
    }

    int getTotalBooks() {
        return totalBooks;
    }

    int TotalBooks() {
        return totalBooks;
    }

    void display() {
        System.out.println();
        System.out.println("Library ID: " + this.libraryId);
        System.out.println("Library Name: " + this.libraryName);
        System.out.println("Total Books: " + this.totalBooks);
    }
}//class library ends here


class Book extends Library 
{
    int pages;

    
      Book() {
        super();
        this.pages = 0;
    }

   
    Book(int libraryId, String libraryName, int totalBooks, int pages) {
        super(libraryId, libraryName, totalBooks);
        this.pages = pages;
    }

    void setPages(int pages) {
        this.pages = pages;
    }

    int getPages() {
        return pages;
    }

    int TotalBooks() {
        return getTotalBooks() + pages; 
    }

    void display() {
        super.display();
        System.out.println("Pages: " + this.pages);
    }
}//class book ends here

class ReferenceBook extends Library {
    int referencePages;

    
    public ReferenceBook() {
        super();
        this.referencePages = 0;
    }

    ReferenceBook(int libraryId, String libraryName, int totalBooks, int referencePages) {
        super(libraryId, libraryName, totalBooks);
        this.referencePages = referencePages;
    }

    void setReferencePages(int referencePages) {
        this.referencePages = referencePages;
    }

    int getReferencePages() {
        return referencePages;
    }

    int TotalBooks() {
        return getTotalBooks() + referencePages; 
    }

    void display() {
        super.display();
        System.out.println("Reference Pages: " + this.referencePages);
    }
}//class referenceBook ends here
class TestLibrary {
    public static void main(String[] args) {

        Library lib = new Library(101, "City Library", 5000);
        lib.display();
        System.out.println("Total Books: " + lib.TotalBooks());

        lib = new Book(102, "Central Library", 3000, 400);
        lib.display();
        System.out.println("Total Books: " + lib.TotalBooks());

        lib = new ReferenceBook(103, "State Library", 2000, 250);
        lib.display();
        System.out.println("Total Books: " + lib.TotalBooks());
    }
}// class test ends here

