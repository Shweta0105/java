import java.util.*;

public class HeartRates {

        private String firstName, lastName;
        private int month, day, year = 0;

        public HeartRates(String FName, String LName, int month, int day, int year) {

            firstName = FName;
            lastName = LName;
            month = month;
            day = day;
            year = year;
        }

        public void setFirstName(String FName) {
            firstName = FName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String LName) {
            lastName = LName;
        }

        public String getlastName() {
            return firstName;
        }

        public void setBirthDate(int month, int day, int year) {
            month = month;
            day = day;
            year = year;
        }

        public int getBirthDate() {
            return day/month/year;
        }

        public int getAge(){
            return 2015 - year;
        }

        public int MaximumHeartRate() {
            return 220 - getAge();
        }

        public void targetHeartRate(){
            System.out.print("Target Heart Rate Range: "+ MaximumHeartRate() * 0.5 + " to "+ MaximumHeartRate() * 0.85);
        }

}