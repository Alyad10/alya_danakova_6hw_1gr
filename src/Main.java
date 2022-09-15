public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(400);
        boss.setDamage(40);
        boss.getGiveWeapon().setType(WeaponType.GUNSHOT);
        boss.getGiveWeapon().setName("Gun");
        System.out.println("Boss: " + "health " + boss.getHealth() + " " + "Damage " + boss.getDamage());
        System.out.println("Boss has a weapon: " + WeaponType.GUNSHOT +" " + boss.getGiveWeapon().getName());

        System.out.println("Boss : " + boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(750);
        skeleton.setDamage(36);
        skeleton.getGiveWeapon().setType(WeaponType.RANGEDWEAPON);
        skeleton.getGiveWeapon().setName("Rifle");
        skeleton.setArrows(4);

        System.out.println("Skeleton: " + skeleton.printInfo());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(350);
        skeleton2.setDamage(25);
        skeleton2.getGiveWeapon().setType(WeaponType.STEELARMS);
        skeleton2.getGiveWeapon().setName("Sword");
        skeleton2.setArrows(7);

        System.out.println("Skeleton2: " + skeleton2.printInfo());







    }
}
