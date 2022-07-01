package WorkingWithAbstractionExecises.cardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");

        for (CardRank cardRanks:CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardRanks.ordinal(),cardRanks.name());
            
        }
    }
}
