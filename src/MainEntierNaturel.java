public class MainEntierNaturel {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(10);
            System.out.println("Valeur initiale: " + entier.getVal());

            entier.decrementer();
            System.out.println("Après décrémentation: " + entier.getVal());

            entier.setVal(-5); // Cela générera une exception
        } catch (NombreNegatifException e) {
            System.out.println("Erreur: " + e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeurErronee());
        }
    }
}