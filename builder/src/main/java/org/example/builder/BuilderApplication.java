package org.example.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {




    public static void main(String[] args) {
        Castle castle = new Castle.Builder()
                .numberOfWalls(4)
                .build();

        // Displaying the details of the constructed castle
        System.out.println("Castle with " + castle.getNumberOfWalls() + " walls");    }


}
