package org.example.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Knight implements Prototype {
    private String name;
    private String weapon;

    public Knight(String name) {
        this.name = name;
        this.weapon = "Sword"; // Default weapon for a knight
    }

    @Override
    public Prototype clone() {
        try {
            return (Knight) super.clone();
        } catch (CloneNotSupportedException e) {
            // Handle the exception appropriately
            return null;
        }
    }
}