package com.ivanshestakov.lab1.oop.model.book;

import java.util.Objects;

public class ProgrammerBook {

    private String language;
    private int level;

    @Override
    public int hashCode() {
        var result = 31 + ((language == null) ? 0 : language.hashCode());
        result = 31 * result + level;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgrammerBook that = (ProgrammerBook) o;

        if (level != that.level) return false;
        return Objects.equals(language, that.language);
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language='" + language + '\'' +
                ", level=" + level +
                '}';
    }
}
