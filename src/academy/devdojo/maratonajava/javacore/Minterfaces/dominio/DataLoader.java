package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
