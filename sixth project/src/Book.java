
class Book{
    String title;
    String author;
    boolean isIssued;
    Book(String title,String author){
        this.title=title;
        this.author=author;
        this.isIssued=false;
    }

    @Override
    public String toString(){
        return title+" by "+author+(isIssued?"[Issude]":"[Available]");
    }
}
