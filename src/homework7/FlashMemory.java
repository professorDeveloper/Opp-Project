package loyihaFlashMemory;


public class FlashMemory {
    int size;
    private int emptySize;
    private int currentMemory;
    private int countMusic = 0;
    private int countVideo = 0;

    private Music[] musicArray;
    private Video[] videoArray;

    public FlashMemory(int size) {
        this.size = size;
        musicArray = new Music[size];
        videoArray = new Video[size];
    }

    public boolean addFile(Music music) {
        if (currentMemory <= size && !(size - currentMemory <= 0)) {
            this.musicArray[countMusic++] = music;
            currentMemory += music.getSize();

            return true;
        }
        return false;
    }

    public boolean addFile(Video video) {
        if (currentMemory <= size && !(size - currentMemory <= 0)) {
            this.videoArray[countVideo++] = video;
            currentMemory += video.getSize();
            return true;
        }
        return false;
    }

    public int infoMemory() {
        if (size - currentMemory <= 0)
            return 0;
        else {
            return currentMemory;
        }
    }

    public boolean isFull() {
        return currentMemory >= size;

    }

    public boolean isEmpty() {
        return currentMemory == size;
    }
}
