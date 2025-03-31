import java.util.Scanner;

public class SubMain {

    Library lib = new Library();
    public SubMain(){
        int eingabe;
        Scanner scan = new Scanner(System.in);
        System.out.println("Was wollen sie machen?");

        System.out.println("1.Buch hinzufügen?");
        System.out.println("2.Buch suchen?");
        System.out.println("3.Bucher anzeigen?");
        System.out.println("4.Buch entfernen?");
        eingabe = scan.nextInt();

        switch (eingabe){
            case 1:
                addBook();
                break;
            case 2:
                findBook();
                break;
            case 3:
                showAllBooks();
                break;
            case 4:
                deleteBook();
                break;
        }
    }

    public void addBook(){

    }

    public void showAllBooks(){

    }

    public void findBook(){

    }

    public void deleteBook(){
    }
    //user abfrage

    //user suche (abfrage auf die book klasse)

    //hinzufügen eines buches( ebenfalls mit usage from book class)
}