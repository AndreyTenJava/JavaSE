package TextFile.GoodItem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS [1] LIST GOODS");
            System.out.println("PRESS [2] BUY GOOD");
            System.out.println("PRESS [3] LIST BUY HISTORY");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0; i < goodItems.size(); i++){
                    System.out.println((i + 1) + ") " + goodItems.get(i));
                }
            }else if(choice==2){
                System.out.println("Choice goodName: ");
                String goodName = in.next();
                int goodPrice = 0;
                boolean isHave = false;
                ArrayList<GoodItem> goodList = getGoodItemList();
                for(int i = 0; i < goodList.size(); i++){
                    if(goodList.get(i).getName().equals(goodName)){
                        goodPrice = goodList.get(i).getPrice();
                        isHave = true;
                    }
                }
                if(isHave){
                    BuyHistory bh = new BuyHistory(goodName, goodPrice);
                    ArrayList<BuyHistory> buyHistory = getBuyHistory();
                    buyHistory.add(bh);
                    saveBuyHistory(buyHistory);
                }else{
                    System.out.println("We don't have that good");
                }
            }else if(choice==3){
                ArrayList<BuyHistory> buyHistory = getBuyHistory();
                for(int i = 0; i < buyHistory.size(); i++){
                    System.out.println((i + 1) + ") " + buyHistory.get(i));
                }
            }else if(choice==0){
                System.exit(0);
            }else{
                System.out.println("Wrong command!!!");
            }
        }
    }
    public static ArrayList<GoodItem> getGoodItemList() {
        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("goodItems.txt"));
            String name = "";
            while ((name = br.readLine()) != null) {
                int price = Integer.parseInt(br.readLine());
                goodItems.add(new GoodItem(name, price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goodItems;
    }
    public static ArrayList<BuyHistory> getBuyHistory() {
        ArrayList<BuyHistory> buyHistory = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("buyHistory.txt"));
            String line = "";
            while ((line = br.readLine()) != null) {
                int goodPrice = Integer.parseInt(br.readLine());
                String date = br.readLine();
                buyHistory.add(new BuyHistory(line, goodPrice));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buyHistory;
    }
    public static void saveBuyHistory(ArrayList<BuyHistory> buyHistory) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buyHistory.txt"));
            for (BuyHistory bh : buyHistory) {
                bw.write(bh.getGoodName() + "\n");
                bw.write(bh.getGoodPrice() + "\n");
                bw.write(bh.getBuyTime() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

