package FinalExamPreparation;

import java.util.*;

public class EE03ThePianist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberPieces = Integer.parseInt(scan.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 0; i < numberPieces; i++) {
            String[] piecesInputArr = scan.nextLine().split("\\|");
            String piece = piecesInputArr[0];
            String composer = piecesInputArr[1];
            String key = piecesInputArr[2];
           //suzdavame spisuk s informatsia
            List<String> piecesInfo = new ArrayList<>();
            piecesInfo.add(composer);
            piecesInfo.add(key);
            piecesMap.put(piece, piecesInfo);
        }

        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            String[] arrInput = input.split("\\|");
            String command = arrInput[0];
            String piece = arrInput[1];

            if (command.equals("Add")) {
                String composer = arrInput[2];
                String key = arrInput[3];
                if (piecesMap.containsKey(piece)) {
                    System.out.println(piece + " is already in the collection!");
                } else {
                    List<String> piecesInfo = new ArrayList<>();
                    piecesInfo.add(composer);
                    piecesInfo.add(key);
                    piecesMap.put(piece, piecesInfo);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }
            } else if (command.equals("Remove")) {
                if (piecesMap.containsKey(piece)) {
                    piecesMap.remove(piece);
                    System.out.println("Successfully removed " + piece + "!");
                } else {
                    System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                }
            } else if (command.equals("ChangeKey")) {
                String newKey = arrInput[2];
                if (piecesMap.containsKey(piece)) {
                    List<String> pieceInfo = piecesMap.get(piece);
                    pieceInfo.set(1, newKey);
                    piecesMap.put(piece, pieceInfo);
                    System.out.println("Changed the key of " + piece + " to " + newKey + "!");
                } else {
                    System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                }
            }
            input = scan.nextLine();
        }

        piecesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " -> Composer: " + entry.getValue().get(0) + ", Key: " + entry.getValue().get(1));
        });
    }
}
