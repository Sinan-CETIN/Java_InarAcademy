package weeks.week_12;

public class Week12_02 {
    public static void main(String[] args) {
        Player messi = new Player("Messi", 100);
        Player ronaldo = new Player("Ronaldo", 80);
        Player mbappe = new Player("Mbappe", 50);
        Player halland = new Player("Halland", 120);
        Player alex = new Player("Alex", 40);
        Player hasanAli = new Player("hasanAli", 5);
        FootballClub sakaryaSpor = new FootballClub(400, "Sakarya Spor", 1, "Sakarya Arena", 8000, new Player[5]);

        sakaryaSpor.buyPlayer(ronaldo);
        sakaryaSpor.displayPlayers();
        System.out.println(sakaryaSpor.getBalance());

        sakaryaSpor.buyPlayer(mbappe);
        sakaryaSpor.buyPlayer(halland);
        sakaryaSpor.buyPlayer(alex);
        sakaryaSpor.buyPlayer(hasanAli);
        sakaryaSpor.displayPlayers();
        System.out.println(sakaryaSpor.getBalance());

        sakaryaSpor.sellPlayer(ronaldo);
        System.out.println(sakaryaSpor.getBalance());
        sakaryaSpor.sellPlayer(mbappe);
        sakaryaSpor.sellPlayer(ronaldo);
        System.out.println(sakaryaSpor.getBalance());

        sakaryaSpor.sellTicket(500);
        System.out.println(sakaryaSpor.getBalance());
        sakaryaSpor.displayPlayers();
        System.out.println(sakaryaSpor.getStadiumName());
    }
}
