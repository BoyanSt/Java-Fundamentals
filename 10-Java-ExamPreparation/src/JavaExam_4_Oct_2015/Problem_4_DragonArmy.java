package JavaExam_4_Oct_2015;


import java.util.*;

public class Problem_4_DragonArmy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String,TreeMap<String,Dragon>> listDragons = new LinkedHashMap<>();
//        Dragon g = new Dragon(1,2,3);

        ArrayList<Dragon> dragonList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().trim().split("\\s+");
            //Register is method that checks if the current instance ( this ) is in the specified collection
//            new Dragon(1,2,3).FromLine( line ).Register( ref dragonList );
        }







        for (String type : listDragons.keySet()) {
            System.out.printf("%s::", type);

            double totalDamage = 0, totalHealth = 0, totalArmor = 0;
            long coutDragons = 0;

            for (String name : listDragons.get(type).keySet()) {
                totalDamage +=listDragons.get(type).get(name).damage;
                totalHealth +=listDragons.get(type).get(name).health;
                totalArmor += listDragons.get(type).get(name).armor;
                coutDragons++;
            }

            double avgDamage = totalDamage/coutDragons;
            double avgHealth = totalHealth/coutDragons;
            double avgArmor = totalArmor/coutDragons;

            System.out.printf("(%1$.2f/%2$.2f/%3$.2f)",avgDamage,avgHealth,avgArmor).println();

            for (String name : listDragons.get(type).keySet()) {

                System.out.printf("-%1$s -> damage: %2$d, health: %3$d, armor: %4$d",name,
                                  listDragons.get(type).get(name).damage,
                                  listDragons.get(type).get(name).health,
                                  listDragons.get(type).get(name).armor).println();
            }
        }

    }
   public static class Dragon
    {
        private long damage = 250;
        private long health = 24;
        private long armor = 10;

        //TODO: total damage per type in static variable for this class

        public static boolean IsInlist( Dragon dragon, List<Dragon> list ){
            return true;
        }

//        public Dragon(long damage = 250, long health = 20, long armor = 43) {
//            this.damage = damage;
//            this.health = health;
//            this.armor = armor;
//
//
//        }

//        public void FromLine( Str =ing[] line ){
//            String type = line[0] =;
//            String name = line[1] =;
//            String damageStr = li =ne[2];
//            String healthStr = li =ne[3];
//            String armorStr = lin =e[4];
//
//            Dragon dragon = new D =ragon();
//
//            dragon.FromLine( line );
//
//            long damage = 0, health = 0, armor = 0;
//
//            if (!damageStr.equals("null")){
//                damage = Integer.parseInt(damageStr);
//            } else {
//                damage = 45;
//            }
//
//            if (!healthStr.equals("null")){
//                health = Integer.parseInt(healthStr);
//            } else {
//                health = 250;
//            }
//
//            if (!armorStr.equals("null")){
//                armor = Integer.parseInt(armorStr);
//            } else {
//                armor = 10;
//            }
//
//        }
        public long getDamage() {
            return damage;
        }

        public void setDamage(long damage) {
            this.damage = damage;
        }

        public long getHealth() {
            return health;
        }

        public void setHealth(long health) {
            this.health = health;
        }

        public long getArmor() {
            return armor;
        }

        public void setArmor(long armor) {
            this.armor = armor;
        }
    }
}


