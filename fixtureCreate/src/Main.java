import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        System.out.println("'q' veya '0' girene kadar takım eklemeye devam edebilirsiniz.");
        addTeam(teams);
        addBayTeam(teams);
        ArrayList<String> matchList = match(teams);
        printMatch(matchList);
    }

    public static void addTeam(ArrayList<String> arr) { // Takım sayısı almak yerine kullanıcıdan bitti komutu alıyoruz.
        Scanner scanner = new Scanner(System.in);
        String team;
        while (true) {
            team = scanner.nextLine();
            if (team.equals("0") || team.equals("q")) {
                break;
            }
            arr.add(team);
        }
    }

    public static void addBayTeam(ArrayList<String> arr) {
        if (arr.size() % 2 == 1) {
            arr.add("Bay");
        }
    }

    public static void arrayPrint(ArrayList<String> arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> match(ArrayList<String> array) {
        ArrayList<String> matchList = new ArrayList<>();
        Collections.shuffle(array);
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int size = array.size();

        for (int away = size / 2; away < size; away++) {
            for (int home = 0; home < size / 2; home++) {
                if (home + away >= size) {
                    int ha = (home + away) % (size / 2);
                    str.append(array.get(home)).append(" vs ").append(array.get(ha)).append("\n");
                    str2.append(array.get(ha)).append(" vs ").append(array.get(home)).append("\n");
                } else {
                    str.append(array.get(home)).append(" vs ").append(array.get(home + away)).append("\n");
                    str2.append(array.get(home + away)).append(" vs ").append(array.get(home)).append("\n");
                }

            }
            matchList.add(str.toString());
            matchList.add(str2.toString());
            str = new StringBuilder();
            str2 = new StringBuilder();
        }

        return matchList;
    }

    public static void printMatch(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i += 2) {
            System.out.println(array.get(i));
        }
        for (int i = 1; i < array.size(); i += 2) {
            System.out.println(array.get(i));
        }
    }

}