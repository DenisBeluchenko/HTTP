package Cat;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    public Cat(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("upvotes ") String upvotes,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user

    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        if(upvotes== null) {
            return "";
        }
        return "id: " + id + "\ntext: " + text + "\ntype: " + type + "\nuser: " + user + "\nupvotes: " + upvotes+"\n";
    }
}