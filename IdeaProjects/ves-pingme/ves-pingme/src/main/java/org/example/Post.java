package org.example;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Post {
    int postId;
    public Timestamp timestamp;
    public String content;
    private Repository repository;       // Aggregation (1)
    private List<Hashtag> hashtags = new ArrayList<>(); // m..n
    private List<Engagement> engagements = new ArrayList<>(); // 1..*

}
