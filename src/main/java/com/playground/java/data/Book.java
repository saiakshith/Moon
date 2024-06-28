package com.playground.java.data;

import java.util.ArrayList;
import java.util.List;

public final class Book {
    private String title;
    private String author;
    private int pageCount;
    private final List<String> genres;

    public Book(String title, String author, int pageCount, List<String> genres) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genres = new ArrayList<>(genres);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public List<String> getGenres() {
        return new ArrayList<>(genres);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", genres=" + genres +
                '}';
    }
}