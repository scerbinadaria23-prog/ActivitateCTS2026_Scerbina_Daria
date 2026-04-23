package ro.ase.cts.prototype;

public class MainPrototype {
    public static void main(String[] args) throws Exception {

        IProtorypeBautura sablon =
                new BauturaPresetata("Latte caramel", 350, 22.5, true);

        IProtorypeBautura b1 = sablon.copiaza();
        IProtorypeBautura b2 = sablon.copiaza();
        IProtorypeBautura b3 = sablon.copiaza();
        IProtorypeBautura b4 = sablon.copiaza();

        ((BauturaPresetata) b2).setVolum(400);
        ((BauturaPresetata) b3).setPret(30);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println("b2 si b3 sunt copii modificate");
    }
}