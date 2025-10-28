public class Assignment7 {

    public static class Enemy {
        int health;
        int damage;

        public Enemy(int h, int d){
            health = h;
            damage = d;
        }

        void attack(){
            System.out.println("the enemy attacks");
        }
    }

    public static class Goblin extends Enemy {


        public Goblin(int h, int d) {
            super(h, d);
        }

        @Override
        void attack() {
            System.out.println("The Goblin Gobbles");
        }
    }

        public static class Wizard extends Enemy{
            String type;
            public Wizard(int h, int d, String t) {
                super(h, d);
                type = t;
            }
            void damageType(){
                if (this.type == "fire"){
                    System.out.println("this wizard shoots a fireball");
                } else if (this.type == "ice"){
                    System.out.println("this wizard shoots an iceball");
                } else System.out.println("Your wizard shoots a ball");

            }
        }


        public static void main(String[] args) {

            Enemy GenericHuman = new Enemy(2, 2);
            Wizard IceWizard = new Wizard(5,5, "ice");
            Wizard FireWizard = new Wizard(5,5, "fire");
            Wizard LameWizard = new Wizard(4,4, "nothing");
            Goblin GenericGoblin = new Goblin(3,3);

            GenericHuman.attack();
            IceWizard.damageType();
            FireWizard.damageType();
            LameWizard.damageType();
            GenericGoblin.attack();

            }
        }









