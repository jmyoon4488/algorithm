package leetcode.week4;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode1396 {
    /**
     * 1396. Design Underground System
     * https://leetcode.com/contest/weekly-contest-182/problems/design-underground-system/
     *
     * Example 1:
     * Input
     * ["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
     * [[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]
     *
     * Output
     * [null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
     *
     * Explanation
     * UndergroundSystem undergroundSystem = new UndergroundSystem();
     * undergroundSystem.checkIn(45, "Leyton", 3);
     * undergroundSystem.checkIn(32, "Paradise", 8);
     * undergroundSystem.checkIn(27, "Leyton", 10);
     * undergroundSystem.checkOut(45, "Waterloo", 15);
     * undergroundSystem.checkOut(27, "Waterloo", 20);
     * undergroundSystem.checkOut(32, "Cambridge", 22);
     * undergroundSystem.getAverageTime("Paradise", "Cambridge");       // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
     * undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
     * undergroundSystem.checkIn(10, "Leyton", 24);
     * undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.00000
     * undergroundSystem.checkOut(10, "Waterloo", 38);
     * undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 12.00000
     *
     *
     * Example 2:
     * Input
     * ["UndergroundSystem","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime"]
     * [[],[10,"Leyton",3],[10,"Paradise",8],["Leyton","Paradise"],[5,"Leyton",10],[5,"Paradise",16],["Leyton","Paradise"],[2,"Leyton",21],[2,"Paradise",30],["Leyton","Paradise"]]
     *
     * Output
     * [null,null,null,5.00000,null,null,5.50000,null,null,6.66667]
     *
     * Explanation
     * UndergroundSystem undergroundSystem = new UndergroundSystem();
     * undergroundSystem.checkIn(10, "Leyton", 3);
     * undergroundSystem.checkOut(10, "Paradise", 8);
     * undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.00000
     * undergroundSystem.checkIn(5, "Leyton", 10);
     * undergroundSystem.checkOut(5, "Paradise", 16);
     * undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.50000
     * undergroundSystem.checkIn(2, "Leyton", 21);
     * undergroundSystem.checkOut(2, "Paradise", 30);
     * undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 6.66667
     *
     * */

    public static void main(String[] args) {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));

        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));

        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));

    }

    static class UndergroundSystem {
        HashMap<Integer, Station> userInfo = new HashMap<>();
        HashMap<String, CalcTime> stationInfo = new HashMap<>();

        public UndergroundSystem() {
            userInfo.clear();
            stationInfo.clear();
        }

        public void checkIn(int id, String stationName, int t) {
            userInfo.put(id, new Station(stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            Station checkInStation = userInfo.get(id);
            String stations = checkInStation.station + "-" + stationName;
            if (stationInfo.containsKey(stations)) {
                CalcTime calcTime = stationInfo.get(stations);
                calcTime.count++;
                calcTime.total += t - checkInStation.time;
            } else {
                stationInfo.put(stations, new CalcTime(t - checkInStation.time, 1));
            }
        }

        public double getAverageTime(String startStation, String endStation) {
            CalcTime calcTime = stationInfo.get(startStation + "-" + endStation);
            return calcTime.total / calcTime.count;
        }

        class Station {
            String station = "";
            double time = 0;
            public Station(String station, double time) {
                this.station = station;
                this.time = time;
            }
        }

        class CalcTime {
            double total = 0;
            int count = 0;
            public CalcTime(double total, int count) {
                this.total = total;
                this.count = count;
            }
        }
    }

}


