package com.example;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/Controller;", "", "db", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "getDb", "()Lio/ebean/Database;", "test", "", "Lcom/example/model/Company;", "ebean_test"})
@io.jooby.annotations.Path(value = {"/"})
public final class Controller {
    @org.jetbrains.annotations.NotNull()
    private final io.ebean.Database db = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.jooby.annotations.GET(value = {"test"})
    public final java.util.List<com.example.model.Company> test() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.Database getDb() {
        return null;
    }
    
    public Controller(@org.jetbrains.annotations.NotNull()
    io.ebean.Database db) {
        super();
    }
}