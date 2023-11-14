package net.patterns.behavioral.iterator;

interface Aggregate {
    Iterator<String> createIterator();
}