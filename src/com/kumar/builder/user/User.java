package com.kumar.builder.user;

public class User {
    private final String userId;
    private final String userName;
    private final String emailId;

    public User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    // create static userBuilder class
    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        UserBuilder(){

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
