package org.example.abstractfactory;

public class OrcKingdomFactory implements  KingdomFactory{
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }
}
