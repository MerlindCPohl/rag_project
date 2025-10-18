package org.example;
import java.util.*;


public class User {

        private String userId;
        private String passwordHash;
        private Profile profile;                  // Aggregation (1)
        private List<Post> posts = new ArrayList<>(); // 1..*
        private List<User> following = new ArrayList<>(); // n..m (follow)
        private List<Message> sentMessages = new ArrayList<>(); // send m
        private List<Message> receivedMessages = new ArrayList<>(); // receive n


        public void engage(Engagement engagement) {
            // Engage with post (Like or Comment)
        }

        public void post(Post post) {

        }

}
