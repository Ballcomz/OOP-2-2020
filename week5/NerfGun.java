public class NerfGun {
    private int ammunition;
    private int lable;

    public NerfGun() {
        ammunition = 0;
        lable = 1;
    }

    public NerfGun(int bullet) {
        ammunition = bullet;
        lable = 2;

    }

    public int reload(int ammo) {
        if (ammunition + ammo > 15) {
            System.out.println("Error!! the ammunition is overload");
            return ammunition;
        } else {
            ammunition += ammo;
            return ammunition;
        }
    }

    public void fire() {
        if (ammunition < 1) {
            System.out.println("There is no ammuition");
        }

        else {
            System.out.println("BANG !!!");
            ammunition--;
        }
    }

    public void displayNumberOfAmmunition() {
        System.out.println(ammunition + " bullet left");

    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + lable);
    }

}
