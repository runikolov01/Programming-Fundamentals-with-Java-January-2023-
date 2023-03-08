package ObjClArticle02;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String titleInp, String contentInput, String aothorInput){
        this.title = titleInp;
        this.content = contentInput;
        this.author = aothorInput;
    }

    public void edit(String newContent){
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void renameTitle(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
