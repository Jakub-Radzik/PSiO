package training.train1;

import java.io.*;

public class Piosenka {
    String title;
    String artist;
    int length;

    public Piosenka(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Piosenka{");
        sb.append("title='").append(title).append('\'');
        sb.append(", artist='").append(artist).append('\'');
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        


    }

}
