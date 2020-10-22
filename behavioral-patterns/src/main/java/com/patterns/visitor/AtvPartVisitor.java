package com.patterns.visitor;

interface AtvPartVisitor {
    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);
    void visit(PartsOrder partsOrder);
}