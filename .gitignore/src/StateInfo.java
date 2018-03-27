/*
 *File: StateInfo.java
 *Author: Eric Allen
 *Date: 4/30/17
 *Purpose: To provide the state bird and flower based on user input
 */

//import packages
import java.util.Scanner;

public class StateInfo {

    public static int getInfo(String stateInfo[][],String state)
   {
       int position = -1;
       boolean found = false;
       //checks input
       for (int index=0; index<stateInfo.length && !found; index++)
       {
           if(stateInfo[index][0].equalsIgnoreCase(state))
               position=index;              
       }
       return position;
   }

    //main 
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String[][] stateInformation = new String[][] {
            {"Alabama", "Yellowhammer", "Camelia"},
            {"Alaska", "Willow Ptarmigan", "Forget-Me-Not"},
            {"Arizona", "Cactus Wren", "Saguaro Cactus Blossom"},
            {"Arkansas", "Mockingbird", "Apple Blossom"},
            {"California", "California Valley Quail", "California Poppy"},
            {"Colorado", "Lark Bunting", "Rocky Mountain Columbine"},
            {"Connecticut", "Robin", "Mountain Laurel"},
            {"Delaware", "Blue Hen Chicken", "Peach Blossom"},
            {"Florida", "Mockingbird", "Orange Blossom"},
            {"Georgia", "Brown Thrasher", "Cherokee Rose"},
            {"Hawaii", "Nene", "Pua Aloalo"},
            {"Idaho", "Mountain Bluebird", "Syringa, Mock Orange"},
            {"Illinois", "Cardinal", "Purple Violet"},
            {"Indiana", "Cardinal", "Peony"},
            {"Iowa", "Eastern Goldfinch", "Wild Praire Rose"},
            {"Kansas", "Western Meadowlark", "Sunflower"},
            {"Kentucky", "Cardinal", "Goldenrod"},           
            {"Louisiana", "Eastern Brown Pelican", "Magnolia"},
            {"Maine", "Chickadee", "Pine Cone and Tassel"},
            {"Maryland", "Baltimore Oriole", "Black-Eyed Susan"},
            {"Massachusetts", "Chickadee", "Trailing-Arbutus"},
            {"Michigan", "American Robin", "Apple Blossom"},
            {"Minnesota", "Common Loon", "Pink and White Lady's Slippper"},
            {"Mississippi", "Mockingbird", "Magnolia"},
            {"Missouri", "Bluebird", "Hawthorn"},
            {"Montana", "Western Meadowlark", "Bitterroot"},
            {"Nebraska", "Western Meadowlark", "Goldenrod"},
            {"Nevada", "Mountain Bluebird", "Sagebrush"},
            {"New Hampshire", "Purple Finch", "Purple Lilac"},
            {"New Jersey", "Eastern Goldfinch", "Violet"},
            {"New Mexico", "Roadrunner", "Yucca Flower"},
            {"New York", "Bluebird", "Rose"},
            {"North Carolina", "Cardinal", "American Dogwood"},
            {"North Dakota", "Western Meadowlark", "Wild Prairie Rose"},
            {"Ohio", "Cardinal", "Scarlet Carnation"},
            {"Oklahoma","Scissor-tailed Flycatcher","Mistletoe"},            
            {"Oregon", "Western Meadowlark", "Oregon Grape"},
            {"Pennsylvania", "Ruffed Grouse", "Mountain Laurel"},
            {"Rhode Island", "Rhode Island Red", "Violet"},           
            {"South Carolina", "Great Carolina Wren", "Yellow Jessamine"},
            {"South Dakota", "Ring-necked Pheasant", "Pasque Flower"},
            {"Tennessee", "Mockingbird", "Iris"},
            {"Texas", "Mockingbird", "Bluebonnet"},
            {"Utah", "Common American Gull", "Sego Lily"},
            {"Vermont", "Hermit Thrush", "Red Clover"},
            {"Virginia","Cardinal"," American Dogwood"},
            {"Washington", "Willow Goldfinch", "Coast Rhododendrum"},
            {"West Virginia", "Cardinal", "Rhododendron"},
            {"Wisconsin", "Robin", "Wood Violet"},
            {"Wyoming", "Western Meadowlark", "Indian Paintbrush"}
        };

        while(true) {
            System.out.println("Enter a State or None to exit:");
            String stateName = userInput.next();

            if(stateName.equalsIgnoreCase("None")) {
                System.out.println("**** Thank you *****");
                System.exit(0);
            }
            else {
                int position = getInfo(stateInformation, stateName);
                if(position != -1) {
                    System.out.println("Bird: " + stateInformation[position][1]);
                    System.out.println("Flower: " + stateInformation[position][2]);                   
                }
                //if misspelled or wrong entry
                else {
                    System.out.println("Invalid State Entered");
                }                
            }            
        }
    }
}
