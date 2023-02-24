package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L04Songs {

    static class Song {
        String typeList;
        String name;
        String duration;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.duration = time;
        }

        public String getName() {
            return this.name;
        }

        public String getTypeList() {
            return this.typeList;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());
        List<Song> songsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] arr = input.split("_");
            String currentType = arr[0];
            String currentName = arr[1];
            String currentDuration = arr[2];

            Song currentSong = new Song(currentType, currentName, currentDuration);

            songsList.add(currentSong);
        }

        String command = scan.nextLine();

        if (command.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songsList) {
                String currentTypeList = song.getTypeList();
                if (currentTypeList.equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
