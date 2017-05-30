package structural.adapter;


public class Adapter extends MusicManager implements Database{

    @Override
    public void create() {
        addNewSong();
    }

    @Override
    public void read() {
        loadNewSong();
    }

    @Override
    public void update() {
        editSong();
    }

    @Override
    public void delete() {
        deleteSong();
    }
}
