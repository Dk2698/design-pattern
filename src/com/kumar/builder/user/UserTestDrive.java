package com.kumar.builder.user;

public class UserTestDrive {
    public static void main(String[] args) {
        final User user = new User.UserBuilder()
                .setUserId("1")
                .setUserName("kumar")
                .setEmailId("kumar@nomail.com")
                .build();

        System.out.println(user.toString());


        final User user1 = User.UserBuilder.builder()
                .setUserId("3")
                .setUserName("kumar1")
                .setEmailId("kumar1@nomail.com")
                .build();

        System.out.println(user1.toString());
    }
}
