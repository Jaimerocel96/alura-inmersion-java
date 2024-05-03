package models;

public class Title {
    private String name;
    private int releaseDate;
    private double rating;
    private boolean basicIncluded;
    private String synopsis;
    private int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isBasicIncluded() {
        return basicIncluded;
    }

    public void setBasicIncluded(boolean basicIncluded) {
        this.basicIncluded = basicIncluded;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void showInfo(){
        System.out.println("*** FICHA TÉCNICA ***");
        System.out.println("Nombre: " + getName());
        System.out.println("Estreno: " + getReleaseDate());
        System.out.println("Duración: " + getDuration() + " minutos");
    }

}
