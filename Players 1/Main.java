import java.util.*;

class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String country = sc.nextLine();
            String side = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            players[i] = new Player(id, country, side, price);
        }


        String search = sc.nextLine();

        Player[] result = searchPlayerForMatch(players,search);

        for(int i=0;i< result.length;i++)
        {
            System.out.println(result[i].getId());
        }




    }
    public static Player[]  searchPlayerForMatch(Player[] arr,String search)
    {
        Player[] help = new Player[0];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getSide().equalsIgnoreCase(search))
            {
                help = Arrays.copyOf(help,help.length+1);
                help[help.length-1] = arr[i];
            }
        }
        for(int i = 0 ; i < help.length ; i++)
        {
            for(int j = 0 ; j < help.length-i-1 ; j++)
            {
                if(help[j].getId() > help[j+1].getId() )
                {
                    Player temp = help[j];
                    help[j] = help[j+1];
                    help[j+1] = temp;
                }
            }
        }
        if(help.length > 0)
        {
            return help;
        }
        return null;
    }



}




class Player
{
    private int id;
    private String country;
    private String side;
    private double price;

    public Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
