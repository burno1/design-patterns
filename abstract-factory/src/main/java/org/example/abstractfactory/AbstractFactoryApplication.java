package org.example.abstractfactory;



public class AbstractFactoryApplication {

    private static final Kingdom kingdom = new Kingdom();

    public static void main(String[] args) {
        AbstractFactoryApplication.run();
    }

    public static void run() {
        System.out.println("elf kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());

        System.out.println("orc kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());
    }

    /**
     * Creates kingdom.
     *
     * @param kingdomType type of Kingdom
     */
    public static void createKingdom(final Kingdom.FactoryMaker.KingdomType kingdomType) {
        final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
    }
}
