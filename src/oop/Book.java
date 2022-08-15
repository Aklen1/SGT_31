package oop;

public class Book {

    //Fields
    private String Title;
    private String Author;
    private int numbOfPages;

    //Setter methods
    public void setTitle(String Title){
        this.Title = Title;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public void setNumbOfPages(int numbOfPages) {
        //this.numbOfPages = numbOfPages;
        if(isNumberOfPagesCorrect(numbOfPages)){
            this.numbOfPages=numbOfPages;
        }else {
            System.out.println("The provided number of pages is incorrect" + numbOfPages);
        }
    }
    //Methods
    private boolean isNumberOfPagesCorrect(int numbOfPages) {
        return numbOfPages >10;
    }
    public void printBookInfo(){
        System.out.println("Title: "+Title);
        System.out.println("Author: "+Author);
        System.out.println("Number of pages: "+ numbOfPages);
    }
}