package weeks.week_12;

public class FootballClub {
    private double balance;
    private String clubName;
    private double ticketFee;
    private String stadiumName;
    private int stadiumCapacity;
    private Player[] players;


    public FootballClub() {
        this(0, "", 0, "", 0, null);
    }
    public FootballClub(double balance, String clubName){
        this(balance,clubName,0,"",0,null);
    }

    public FootballClub(double balance, String clubName, double ticketFee, String stadiumName, int stadiumCapacity, Player[] player) {
        this.balance = balance;
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.stadiumName = stadiumName;
        this.stadiumCapacity = stadiumCapacity;
        this.players = player;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public void setTicketFee(double ticketFee) {
        this.ticketFee = ticketFee;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getTicketFee() {
        return this.ticketFee;
    }

    public int getStadiumCapacity() {
        return this.stadiumCapacity;
    }

    public String getClubName() {
        return this.clubName;
    }

    public String getStadiumName() {
        return this.stadiumName;
    }

    public void sellTicket(int numberOfTicket) {
        if (numberOfTicket >= getStadiumCapacity()) {
            double value = getStadiumCapacity() * getTicketFee();
            balance += value;
            return;
        }
        double value = numberOfTicket * getTicketFee();
        balance += value;
    }

    public void sellPlayer(Player p) {
        if (havePlayerInTeam(p)) {

            balance += p.getFee();
            int index = findIndexOfPlayer(p);
            players[index] = null;

        } else {
            System.out.println("The player you are trying to sell is not in  your team!!\nDo not try to cheat the system!");
        }
    }

    public void buyPlayer(Player p) {
        if (haveSpaceInTeam()) {
            if (haveEnoughMoneyToBuyPlayer(p)) {
                balance -= p.getFee();
                placePlayer(p);
            } else {
                System.out.println("Too Broke!!!.Earn some money!");
            }
        } else {
            System.out.println("Too Crowd!!! Sell player to buy!");
        }
    }

    private void placePlayer(Player p) {
        for (int i = 0; i < this.players.length; i++) {
            if (players[i] == null) {
                players[i] = p;
                return;
            }
        }
    }

    private boolean havePlayerInTeam(Player p) {

        for (int i = 0; i < this.players.length; i++) {
            if (players[i] == null) continue;
            if (players[i].getName().equals(p.getName())) {
                return true;
            }
        }
        return false;
    }

    private int findIndexOfPlayer(Player p) {
        for (int i = 0; i < this.players.length; i++) {
            if (players[i] == null) continue;
            if (this.players[i].getName().equals(p.getName())) {
                return i;
            }
        }
        return -1;
    }

    private boolean haveSpaceInTeam() {
        for (int i = 0; i < this.players.length; i++) {
            if (players[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean haveEnoughMoneyToBuyPlayer(Player p) {
        return balance >= p.getFee();
    }

    public void displayPlayers() {

        System.out.printf("\n%-10s | %-10s\n", "NAME", "FEE");
        System.out.println("-----------------------");
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) continue;
            System.out.printf("%-10s | %-10d\n", players[i].getName(), players[i].getFee());
        }
    }

}
