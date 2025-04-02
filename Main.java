import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] names = {"0180-Consecutive-Numbers", "0197-Rising-Temperature", "0550-Game-Play-Analysis-IV", "0570-Managers-with-at-Least-5-Direct-Reports", "0577-Employee-Bonus", "0584-Find-Customer-Referee", "0595-Big-Countries", "0596-Classes-More-Than-5-Students", "0610-Triangle-Judgement", "0619-Biggest-Single-Number", "0620-Not-Boring-Movies", "1045-Customers-Who-Bought-All-Products", "1068-Product-Sales-Analysis-I", "1070-Product-Sales-Analysis-III", "1075-Project-Employees-I", "1141-User-Activity-for-the-Past-30-Days-I", "1148-Article-Views-I", "1164-Product-Price-at-a-Given-Date", "1174-Immediate-Food-Delivery-II", "1193-Monthly-Transactions-I", "1204-Last-Person-to-Fit-in-the-Bus", "1211-Queries-Quality-and-Percentage", "1251-Average-Selling-Price", "1280-Students-and-Examinations", "1378-Replace-Employee-ID-With-The-Unique-Identifier", "1581-Customer-Who-Visited-but-Did-Not-Make-Any", "1633-Percentage-of-Users-Attended-a-Contest", "1661-Average-Time-of-Process-per-Machine", "1683-Invalid-Tweets", "1729-Find-Followers-Count", "1731-The-Number-of-Employees-Which-Report-to-Each", "1757-Recyclable-and-Low-Fat-Products", "1789-Primary-Department-for-Each-Employee", "1934-Confirmation-Rate", "2356-Number-of-Unique-Subjects-Taught-by-Each-Teacher"
        };

        for (String name : names) {
            Path readmePath = Paths.get(name + "/README.txt");
            Path txtPath = Paths.get(name + "/README.md");
            Files.deleteIfExists(readmePath);
            Files.createFile(txtPath);
        }
    }
}
