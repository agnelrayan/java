package com.expertzlab.Collections.HashSetSample;

public class BookHashSetEx {

    int bookId;
    String bookName;
    String bookAuthor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookHashSetEx that = (BookHashSetEx) o;

        if (bookId != that.bookId) return false;
        if (bookName != null ? !bookName.equals(that.bookName) : that.bookName != null) return false;
        return bookAuthor != null ? bookAuthor.equals(that.bookAuthor) : that.bookAuthor == null;

    }

   /*@Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (bookAuthor != null ? bookAuthor.hashCode() : 0);
        return result;
    }*/



    public BookHashSetEx(int bookId,String bookName,String bookAuthor){
        this.bookId=bookId;
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
    }
}
