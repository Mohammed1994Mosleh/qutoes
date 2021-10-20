package qutoes;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Qutos {
    @SerializedName("tags")
    ArrayList<String> tags;
    @SerializedName("author")
    String author;
    @SerializedName("likes")
    String likes;
    @SerializedName("text")
    String text;

    public Qutos (String author, String likes, String text, ArrayList<String> tags){
        this.tags = tags;
        this.author=author;
        this.likes=likes;
        this.text=text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "text:'" + text + '\'' +
                ", author:'" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", tags=" + tags +
                '}';
    }

}
