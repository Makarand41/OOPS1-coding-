import java.util.*;

public class Main {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Motel[] motels = new Motel[4];
        for (int i = 0; i < 4; i++)
        {
            int motelId = sc.nextInt();sc.nextLine();
            String motelName = sc.nextLine();
            String dateOfBooking =sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();sc.nextLine();
            String cabFacility = sc.nextLine();
            double totalBill = sc.nextDouble();sc.nextLine();
            motels[i] = new Motel(motelId, motelName, dateOfBooking, noOfRoomsBooked, cabFacility, totalBill);
        }
        String cabFacilityInput = sc.nextLine();

        int totalRoomsBooked = totalNoOfRoomsBooked(motels, cabFacilityInput);
        if (totalRoomsBooked > 0)
        {
            System.out.println(totalRoomsBooked);
        }
        else
        {
            System.out.println("No such rooms booked");
        }
    }

    public static int totalNoOfRoomsBooked(Motel[] motels, String cabFacilityInput)
    {
        int totalRoomsBooked = 0;
        for (int i=0;i< motels.length;i++)
        {
            if (motels[i].getCabFacility().equalsIgnoreCase(cabFacilityInput) && motels[i].getNoOfRoomsBooked() > 5)
            {
                totalRoomsBooked += motels[i].getNoOfRoomsBooked();
            }
        }
        return totalRoomsBooked;
    }
}





class Motel
{
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill)
    {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    public int getMotelId()
    {
        return motelId;
    }
    public String getMotelName()
    {
        return motelName;
    }
    public String getDateOfBooking()
    {
        return dateOfBooking;
    }
    public int getNoOfRoomsBooked()
    {
        return noOfRoomsBooked;
    }
    public String getCabFacility()
    {
        return cabFacility;
    }
    public double getTotalBill()
    {
        return totalBill;
    }
    public void setMotelId(int motelId)
    {
        this.motelId = motelId;
    }
    public void setMotelName(String motelName)
    {
        this.motelName = motelName;
    }
    public void setDateOfBooking(String dateOfBooking)
    {
        this.dateOfBooking = dateOfBooking;
    }
    public void setNoOfRoomsBooked(int noOfRoomsBooked)
    {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }
    public void setCabFacility(String cabFacility)
    {
        this.cabFacility = cabFacility;
    }
    public void setTotalBill(double totalBill)
    {
        this.totalBill = totalBill;
    }
}





