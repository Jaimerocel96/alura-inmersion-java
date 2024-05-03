package models;

public class Serie extends Title {

    private int seasons;
    private int chapterPerSeason;
    private int chapterDuration;

    @Override
    public int getDuration() {
        return chapterDuration * chapterPerSeason * seasons;
    }

    @Override
    public void showInfo() {
        System.out.println("*** FICHA TÉCNICA ***");
        System.out.println("Nombre: " + getName());
        System.out.println("Estreno: " + getReleaseDate());
        System.out.println("Temporadas: " + getSeasons());
        System.out.println("Capítulos por temporada: " + getChapterPerSeason());
        System.out.println("Duración: " + getDuration() + " minutos");
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getChapterPerSeason() {
        return chapterPerSeason;
    }

    public void setChapterPerSeason(int chapterPerSeason) {
        this.chapterPerSeason = chapterPerSeason;
    }

    public int getChapterDuration() {
        return chapterDuration;
    }

    public void setChapterDuration(int chapterDuration) {
        this.chapterDuration = chapterDuration;
    }
}
