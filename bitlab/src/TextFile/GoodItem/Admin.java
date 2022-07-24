package TextFile.GoodItem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        while(true){
            System.out.println("PRESS [1] ADD GOOD");
            System.out.println("PRESS [2] LIST GOODS");
            System.out.println("PRESS [3] DELETE GOOD");
            System.out.println("PRESS [0] TO EXIT");

            int choice = in.nextInt();
            if(choice==1){
                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert price: ");
                int price = in.nextInt();
                GoodItem g = new GoodItem(name, price);
                ArrayList<GoodItem> goodItems = getGoodItemList();
                goodItems.add(g);
                saveGoodItems(goodItems);
            }else if(choice==2){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0; i < goodItems.size(); i++){
                    System.out.println((i + 1) + ") " + goodItems.get(i));
                }
            }else if(choice==3){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0; i < goodItems.size(); i++){
                    System.out.println((i + 1) + ") " + goodItems.get(i));
                }
                System.out.println("Insert index of user to delete: ");
                int index = in.nextInt();
                goodItems.remove(index - 1);
                saveGoodItems(goodItems);
            }else if(choice==0){
                System.exit(0);
            }else{
                System.out.println("Wrong command!!!");
            }
        }
    }
    public static void saveGoodItems(ArrayList<GoodItem> goodItems){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("goodItems.txt"));
            for(GoodItem g: goodItems){
                bw.write(g.getName() + "\n");
                bw.write(g.getPrice() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static ArrayList<GoodItem> getGoodItemList(){
        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("goodItems.txt"));
            String name = "";
            while ((name = br.readLine())!=null){
                int price = Integer.parseInt(br.readLine());
                goodItems.add(new GoodItem(name, price));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return goodItems;
    }
}
