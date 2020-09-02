package org.example;

    public class City {
        private int population;
        private String name;
        public static final Long MAX_NUMBER_OF_PEOPLE = 2000000L;

        public void printInfo () {
            System.out.println("В городе " + name + " жыве " + population + " невероятных чнловек");
            System.out.println("А когда-то в нем было " + MAX_NUMBER_OF_PEOPLE + " человек");
        }

        public City () {
            this.population = 1600000;
            this.name = "Минск";
        }

        public City (int population, String name) {
            this.population = population;
            this.name = name;
        }
    }



