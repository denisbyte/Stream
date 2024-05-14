package model.entity;

public class Episode {
    private int id_episode;
    private int nombre_episode;

    private Saison saison;

    public Episode(int id_episode, int nombre_episode) {
        this.id_episode = id_episode;
        this.nombre_episode = nombre_episode;
    }

    public Episode(int id_episode, int nombre_episode, Saison saison) {
        this.id_episode = id_episode;
        this.nombre_episode = nombre_episode;
        this.saison = saison;
    }

    public int getId_episode() {
        return this.id_episode;
    }

    public void setId_episode(int id_episode) {
        this.id_episode = id_episode;
    }

    public int getNombre_episode() {
        return this.nombre_episode;
    }

    public void setNombre_episode(int nombre_episode) {
        this.nombre_episode = nombre_episode;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "id_episode=" + id_episode +
                ", nombre_episode=" + nombre_episode +
                ", saison=" + saison +
                '}';
    }
}
