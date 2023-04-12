import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Medicine[] medicine = new Medicine[4];
        String search;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < medicine.length; i++) {
            String medicineName = sc.nextLine();
            String batchNo = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            medicine[i] = new Medicine(medicineName, batchNo, disease, price);
        }

        search = sc.nextLine();


        Medicine[] price = medicinePriceForGivenDisease(medicine, search);

        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i].getPrice());
        }
    }

    public static Medicine[] medicinePriceForGivenDisease(Medicine[] arr,String disease)
    {
        Medicine[] help = new Medicine[0];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i].getDisease().equalsIgnoreCase(disease))
            {
                help = Arrays.copyOf(help,help.length+1);
                help[help.length-1] = arr[i];
            }
        }
        for(int i = 0 ; i < help.length ; i++)
        {
            for(int j = 0 ; j < help.length-i-1 ; j++)
            {
                if(help[j].getPrice() < help[j+1].getPrice() )
                {
                    Medicine temp = help[j];
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




class Medicine {
    private String medicineName;
    private String batchNo;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batchNo, String disease, int price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.disease = disease;
        this.price = price;
    }

    // Getters
    public String getMedicineName() {
        return medicineName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getDisease() {
        return disease;
    }

    public int getPrice() {
        return price;
    }

    // Setters
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
