package dev.a4j.mastering.data;

public class AuthorBuilder {

    private String nickname;
    private String name;
    private String profile;

    AuthorBuilder() {
    }

    public AuthorBuilder nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public AuthorBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AuthorBuilder profile(String profile) {
        this.profile = profile;
        return this;
    }

    public Author build() {
        return new Author(nickname, name, profile);
    }
}
