package org.example.abstractfactory;

public class ElfKingdomFactory implements KingdomFactory{

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }
}
