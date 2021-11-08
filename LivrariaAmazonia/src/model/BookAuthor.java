package model;

public class BookAuthor {
    private String isbn;
    private Integer authorId;
    private Integer seqNo;
    
    public BookAuthor(String isbn, Integer authorId, Integer seqNo) {
        this.isbn = isbn;
        this.authorId = authorId;
        this.seqNo = seqNo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }
    
    
}
