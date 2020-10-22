package com.patterns.visitor;

interface AtvPart {
    void accept(AtvPartVisitor visitor);
}
