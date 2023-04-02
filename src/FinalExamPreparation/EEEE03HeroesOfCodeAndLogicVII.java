package FinalExamPreparation;

import java.util.*;

public class EEEE03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberHeroes = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, List<Integer>> map = new LinkedHashMap<>();

        for (int i = 0; i < numberHeroes; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String heroName = input[0];
            int hp = Integer.parseInt(input[1]); // hit points
            if (hp > 100) {
                hp = 100;
            }
            int mp = Integer.parseInt(input[2]); // mana points
            if (mp > 200) {
                hp = 200;
            }
            //	a hero can have a maximum of 100 HP and 200 MP
            List<Integer> newInfo = new ArrayList<>();
            newInfo.add(0, hp);
            newInfo.add(1, mp);

            map.put(heroName, newInfo);
        }

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] arr = input.split(" - ");
            String command = arr[0];

            if (command.equals("CastSpell")) {
                String heroName = arr[1];
                int mpNeeded = Integer.parseInt(arr[2]);
                String spellName = arr[3];
                if (map.get(heroName).get(1) >= mpNeeded) {
                    int newMp = map.get(heroName).get(1) - mpNeeded;
                    map.get(heroName).set(1, newMp);
                    System.out.println(heroName + " has successfully cast " + spellName + " and now has " + newMp + " MP!");
                } else {
                    System.out.println(heroName + " does not have enough MP to cast " + spellName + "!");
                }
            } else if (command.equals("TakeDamage")) {
                String heroName = arr[1];
                int damage = Integer.parseInt(arr[2]);
                String attacker = arr[3];
                int newHp = map.get(heroName).get(0) - damage;
                map.get(heroName).set(0, newHp);
                if (newHp > 0) {
                    System.out.println(heroName + " was hit for " + damage + " HP by " + attacker + " and now has " + newHp + " HP left!");
                } else {
                    map.remove(heroName);
                    System.out.println(heroName + " has been killed by " + attacker + "!");
                }

            } else if (command.equals("Recharge")) {
                String heroName = arr[1];
                int amount = Integer.parseInt(arr[2]);
                int newMp = map.get(heroName).get(1) + amount;
                if (newMp > 200) {
                    newMp = 200;
                    amount = 200 - map.get(heroName).get(1);
                }
                map.get(heroName).set(1, newMp);
                System.out.println(heroName + " recharged for " + amount + " MP!");

            } else if (command.equals("Heal")) {
                String heroName = arr[1];
                int amount = Integer.parseInt(arr[2]);
                int newHp = map.get(heroName).get(0) + amount;
                if (newHp > 100) {
                    newHp = 100;
                    amount = 100 - map.get(heroName).get(0);
                }
                map.get(heroName).set(0, newHp);
                System.out.println(heroName + " healed for " + amount + " HP!");
            }
            input = scan.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("HP: " + entry.getValue().get(0));
            System.out.println("MP: " + entry.getValue().get(1));

        }
    }
}
