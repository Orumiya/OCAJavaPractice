package soccer;

public class League {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.playerName = "Messi";
        Player player2 = new Player();
        player2.playerName = "Ronaldo";
        Player player3 = new Player();
        player3.playerName = "Iniesta";
        Player[] players = {player1, player2, player3};
        Team team1 = new Team();
        team1.playerArray = players;
        team1.teamName = "real madrid";
/*
        System.out.println("Team 1");
        for (Player player : players) {
            System.out.println(player.playerName);
        }*/

        Team team2 = new Team();
        team2.playerArray = new Player[3];

        for (int i=0; i < team2.playerArray.length; i++) {
            team2.playerArray[i] = new Player();
        }
        team2.playerArray[0].playerName = "Denis Vasquez";
        team2.playerArray[1].playerName = "Mario Zotta";
        team2.playerArray[2].playerName = "Rafael Lombardo";
        /*
        System.out.println("Team2: ");
        for (Player player : team2.playerArray) {
            System.out.println(player.playerName);
        }*/

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.team = currGame.homeTeam;
        goal1.theTime = 15;

        Goal[] goals = {goal1};
        currGame.goals = goals;
/*
        System.out.println("Goal scored after " + currGame.goals[0].theTime + " minutes by " + currGame.goals[0].thePlayer.playerName
        + " of " + currGame.goals[0].team.teamName);
*/
        String name = "Doc Holliday";
        String firstName;
        int spaceIdx = name.indexOf(" ");

        firstName = name.substring(0,spaceIdx);
        // System.out.println("firstName: " + firstName);

        // STRINGBUILDER
        StringBuilder sb = new StringBuilder("Doc");
        // sb.append(" Holliday");
        sb.append(name.substring(spaceIdx, name.length()));
        // System.out.println(sb);

        byte byteNum = 2;
        short shortNum = 100;
        int intNum = 23444444;
        long longNum = 2344444444L;
        float floatnum = 23.3F;
        double doublenum = 23.4;
        char charKar = 'U';
        String charAsString = "U";
        final int NUMBER_OF_MONTHS = 12;

        double remainder = 16 % 3;
        remainder += 10;
        remainder *= 2;
        remainder /= 5;
        remainder %= 2;
        // System.out.println("remainder value: " + remainder);

        int id = 6;
        int newId = ++id;
        System.out.println("preincrement - id: " + id + " newId: " + newId);

        int id2 = 6;
        int newId2 = id2++;
        System.out.println("postincrement - id2: " + id2 + " newId2: " + newId2);

        int id3 = 6;
        int newId3 = --id3;
        System.out.println("predecrement - id3: " + id3 + " newId3: " + newId3);

        int id4 = 6;
        int newId4 = id4--;
        System.out.println("postdecrement - id4: " + id4 + " newId4: " + newId4);

        //******************** PROMOTION, TYPE CASTING *****************
        //automatic promotion
        long intToLong = 6; //not 6L
        double intToDouble = 3;

        // integerbe nem fér bele, long tudja csak tárolni 55.555 * 66.666 = 3703629630
        int num1 = 55555;
        int num2 = 66666;
        long num3;
        num3 = num1 * num2;
        // System.out.println(num3); //-591337666

        int num4 = 4;
        int num5 = 5;
        // byte sum1 = num4 * num5; compiler error!!!! és ugyanez short-tal is!!!!
        byte sum1 = (byte)(num4 * num5); //type casting
        System.out.println(sum1);

        int myInt;
        long myLong = 123456789333333L;
        myInt = (int) myLong; // number is chopped!!!!
        System.out.println("chopped long number type casted to int " + myInt);
        myLong = 99L;
        myInt = (int)myLong; //safer casting
        System.out.println("safer long number type casted to int " + myInt);

        byte num6 = 3;
        byte num7 = 4;
        // byte num8 = num6 + num7; COMPILER ERROR!!!!
        // BYTE, CHAR, SHORT values are automatically promoted to int values!!!!
        // if an expression contains a long, the entire expression is promoted to long
        int ageInYears = 32;
        long ageInSeconds = ageInYears * 365 * 24L * 60 * 60 * 60; // kell egy long a műveletbe és akkor az inteket longgá promotálja
        int ageInSecondsInt = ageInYears * 365 * 24 * 60 * 60 * 2000; // túlcsordul ha túl nagy
        System.out.println("ageIn seconds" + ageInSeconds);
        // if an expression contains a FP number, the entire expression is promoted to FP number
        // all literal floating point values are viewed as DOUBLE

        // float notFloat = 3.0; compiler error!!!!! double-nek érzékeli
        float realFloat = 3.0F;
        float anotherRealFloat = (float)27.0;

        // int notDouble = 3 * 4 * 1.0; COMPILER ERROR
        double realDouble = 3 * 4 * 3.0;
        int backToInt = (int) 3.0 * 4;
        //******************** END PROMOTION, TYPE CASTING *****************


        for(Player player : team2.playerArray) {
            if (player.playerName.matches(".*omb.*")) {
                System.out.println(player.playerName);
                // split második része index1-nél a vezetéknév
                System.out.println("Family name: " + player.playerName.split(" ")[1]);
            }
        }

        StringBuilder familyNameFirst = new StringBuilder();
        for(Player player : team2.playerArray) {
            String[] name2 = player.playerName.split(" ");
            familyNameFirst.append(name2[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name2[0]);
            familyNameFirst.append("; ");
            System.out.println(familyNameFirst);
        }

        // a változó tartalma: Vasquez, Denis; Zotta, Mario; Lombardo, Rafael;
        // delete indextől indexig töröl
        familyNameFirst.delete(0,1);
        System.out.println(familyNameFirst);
    }


}
