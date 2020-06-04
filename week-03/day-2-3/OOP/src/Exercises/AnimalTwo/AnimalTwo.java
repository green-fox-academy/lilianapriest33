package DataStructures.AnimalTwo;

public class AnimalTwo {
        int hunger;
        int thirst;

        public AnimalTwo(int hunger, int thirst) {
            this.hunger = hunger;
            this.thirst = thirst;
        }

        public void eat() {
            this.hunger -= 10;
        }

        public void drink() {
            this.thirst -= 10;
        }

        public void play() {
            this.hunger += 20;
            this.thirst += 20;
        }
    }
