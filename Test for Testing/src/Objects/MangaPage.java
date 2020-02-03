package Objects;

public class MangaPage {
    private boolean isColored;
    private boolean isInteresting;

    public MangaPage(boolean isColored, boolean isInteresting){
        this.isColored = isColored;
        this.isInteresting = isInteresting;
    }

    public MangaPage(boolean isColored){
        this.isColored = isColored;
        this.isInteresting = true;
    }

    public MangaPage(){
        this.isColored = false;
        this.isInteresting = true;
    }

    public MangaPage(MangaPage mangaPageCopy){
        this.isColored = mangaPageCopy.isColored;
        this.isInteresting = mangaPageCopy.isInteresting;
    }
}
