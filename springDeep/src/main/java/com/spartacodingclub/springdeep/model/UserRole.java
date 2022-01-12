package com.spartacodingclub.springdeep.model;

public enum UserRole {
    USER(Authroity.USER),  // 사용자 권한
    ADMIN(Authroity.ADMIN);  // 관리자 권한

    private final String authroity;

    UserRole(String authroity){
        this.authroity = authroity;
    }

    public String getAuthroity() {
        return this.authroity;
    }

    public static class Authroity {
        public static final String USER = "ROLE_USER";
        public static final String ADMIN = "ROLE_ADMIN";
    }

}
