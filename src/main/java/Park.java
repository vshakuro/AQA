package main.java;
public class Park {
    private String name;

    public class Attraction {
        private String attractionName;
        private String attractionWorkingTime;
        private int attractionCost;

        public Attraction(String attractionName, String workingTime, int cost){
            this.attractionName = attractionName;
            this.attractionWorkingTime = workingTime;
            this.attractionCost = cost;
        }

        public void attractionInfo() {
            System.out.println("Название аттракциона - " + attractionName + "\nВремя работы - " + attractionWorkingTime + "\nЦена - " + attractionCost + "\n");
        }
    }

    public static void main(String[] args) {
        Park.Attraction[] attractionArray = new Attraction[2];
        attractionArray[0] = new Park().new Attraction("Супер 8", "08:00 - 23:00", 50);
        attractionArray[1] = new Park().new Attraction("Ромашка", "80:00 - 23:00", 30);
        for (Park.Attraction tempAttraction : attractionArray) {
            tempAttraction.attractionInfo();
        }
    }
}