public class Boss extends GameEntity{

    Weapon giveWeapon = new Weapon();

    public Weapon getGiveWeapon() {
        return giveWeapon;
    }

    public void setGiveWeapon(Weapon giveWeapon) {
        this.giveWeapon = giveWeapon;
    }
    public String printInfo(){

        return "health " + getHealth()  + " Damage " + getDamage() +
                " has a weapon: " + getGiveWeapon().getType() + " " + getGiveWeapon().getName();

    }
}
