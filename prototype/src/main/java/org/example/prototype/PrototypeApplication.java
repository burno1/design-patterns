package org.example.prototype;


import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PrototypeApplication {

    public static void main(String[] args) {
        // Creating an instance of Knight
        Knight originalKnight = new Knight("Sir Lancelot");

        // Cloning the original knight
        Knight clonedKnight = (Knight) originalKnight.clone();

        // Modifying the cloned knight
        clonedKnight.setName("Sir Gawain");
        clonedKnight.setWeapon("Axe");

        // Displaying the details of both knights
        System.out.println("Original Knight: " + originalKnight);
        System.out.println("Cloned Knight: " + clonedKnight);
    }


}
