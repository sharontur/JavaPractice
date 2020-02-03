import Objects.MangaPage;

public class Manga {
    private int numberOfPages;
    private MangaPage page;

    public Manga(int numberOfPages, MangaPage page){
        this.numberOfPages = numberOfPages;
        this.page = page;
    }

    public Manga(int numberOfPages){
        this.numberOfPages = numberOfPages;
        this.page = new MangaPage();
    }
     public Manga(MangaPage page){
        this.numberOfPages = 1;
        this.page = page;
     }

    public Manga(){
        this.numberOfPages = 1;
        this.page = new MangaPage();
    }

    public Manga(Manga mangaCopy){
        numberOfPages = mangaCopy.numberOfPages;
        page = new MangaPage(mangaCopy.page);
    }
    }




