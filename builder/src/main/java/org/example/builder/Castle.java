package org.example.builder;

import lombok.Getter;

@Getter
class Castle {
    private int numberOfWalls;

    private Castle(Builder builder) {
        this.numberOfWalls = builder.numberOfWalls;
    }

    static class Builder {
        private int numberOfWalls;

        public Builder numberOfWalls(int numberOfWalls) {
            this.numberOfWalls = numberOfWalls;
            return this;
        }

        public Castle build() {
            return new Castle(this);
        }
    }
}
