public class FifthHomework {

    public static void main(String[] args) {
        Building houseNumberFirst = new Building(1, 9.0f, 8.0f);
        Building houseNumberSecond = new Building(2, 3.0f, 3.0f);
        
        Park centralPark = new Park("Central", 500.0f, 300.0f);
        
        Street prospektFrimana = new Street("Prospekt Frimana", 1500.0f, 20.0f);
        Street streetHernya = new Street("Street Hernya", 100500, false, 500.0f, 10.0f, new Building[] {houseNumberFirst, houseNumberSecond}, new Park[] {centralPark});
    
        City city17 = new City("City 17",5000.0f, 5000.0f);
        
        city17.setStreets(new Street[] {prospektFrimana,streetHernya});


        Building houseOne = new Building(1, 9.0f, 8.0f);
        Building houseTwo = new Building(2, 3.0f, 3.0f);

        Street streetMain = new Street("Main Street", 1, true, 5000.0f, 50.0f, new Building[] {houseOne, houseTwo}, null);
        Street streetShlyapa = new Street("Street Shlyapa", 500.0f, 10.0f);

        City cityLost = new City("Lost", 10000.f, 10000.f, new Street[]{streetMain, streetShlyapa});
        
    }
}
