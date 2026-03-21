package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

// 기본 Iterator
public class BookShelfIterator implements Iterator<Book> {
    protected BookShelf bookShelf;
    protected int index; // 책꽂이에서 현재 위치를 나타내는 변수

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() { // 책꽂이에서 꺼내올 다음 책이 있는지 확인하는 메소드
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() { // 책꽂이에서 다음 책을 꺼내오는 메소드
        if (!hasNext()) {
            throw new NoSuchElementException(); // 더 이상 꺼내올 책이 없을 때 예외를 던짐
        }
        Book book = bookShelf.getBookAt(index); // 책꽂이에서 현재 위치의 책을 가져옴
        index++;
        return book;
    }
}

// 장르 필터 Iterator
class IteratorByGenre extends BookShelfIterator implements Iterator<Book> {
    private String genre;

    public IteratorByGenre(BookShelf bookShelf, String genre) {
        super(bookShelf);
        this.genre = genre;
    }

     @Override
    public boolean hasNext() {  // 책꽂이에서 꺼내올 다음 책이 있는지 확인하는 메소드 - 장르 확인
        while (index < bookShelf.getLength()) {
            if (bookShelf.getBookAt(index).getGenre().equals(genre)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() { // 책꽂이에서 다음 책을 꺼내오는 메소드
        if (!hasNext()) {
            throw new NoSuchElementException(); // 더 이상 꺼내올 책이 없을 때 예외를 던짐
        }
        Book book = bookShelf.getBookAt(index); // 책꽂이에서 현재 위치의 책을 가져옴
        index++;
        return book;
    }
}

// 출판연도 역순 Iterator
class IteratorByYear extends BookShelfIterator implements Iterator<Book> {

    public IteratorByYear(BookShelf bookShelf) {
        super(bookShelf);
    }

    @Override
    public boolean hasNext() { // 책꽂이에서 꺼내올 다음 책이 있는지 확인하는 메소드
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() { // 책꽂이에서 다음 책을 꺼내오는 메소드
        if (!hasNext()) {
            throw new NoSuchElementException();    // 더 이상 꺼내올 책이 없을 때 예외를 던짐
        }

        BookShelf sortedBook=new BookShelf(10);
        Book[] temp=new Book[bookShelf.getLength()];

        for(int i=0;i<bookShelf.getLength();i++){ // 책꽂이의 책을 임시 배열에 복사
            temp[i]=bookShelf.getBookAt(i);
        }

        for(int i=0;i<bookShelf.getLength()-1;i++){ // 출판연도 역순으로 정렬
            for(int j=i+1;j<bookShelf.getLength();j++){
                if(temp[i].getYear()<temp[j].getYear()){
                    Book t=temp[i];
                    temp[i]=temp[j];
                    temp[j]=t;
                }
            }
        }

        for(int i=0;i<bookShelf.getLength();i++){ // 정렬된 책을 새로운 책꽂이에 추가
            sortedBook.appendBook(temp[i]);
        }

        Book book = sortedBook.getBookAt(index); // 책꽂이에서 현재 위치의 책을 가져옴
        index++;
        return book;
    }        
}