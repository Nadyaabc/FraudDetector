import main.java.com.detector.model.FraudDetector;
import main.java.com.detector.model.Trader;
import main.java.com.detector.model.Transaction;

public class Main {
    public static void main(String[] args) {
        FraudDetector fraudDetector = new FraudDetector();

        Trader trader1 = new Trader("Иван Иванов", "Москва", "Россия");
        Transaction transaction1 = new Transaction(trader1,  500000);
        System.out.println(transaction1.getTransactionInfo());

        Trader trader2 = new Trader("Pokemon", "Санкт-Петербург", "Россия");
        Transaction transaction2 = new Transaction(trader2,  1500000);
        System.out.println(transaction2.getTransactionInfo());

        System.out.println("Транзакция 1:");
        System.out.println("Это мошенничество? " + fraudDetector.isFraud(transaction1).isFraud());

        System.out.println("\nТранзакция 2:");
        System.out.println("Это мошенничество? " + fraudDetector.isFraud(transaction2).isFraud());

        fraudDetector.addFraudName("Мошенник123");
        fraudDetector.addFraudCity("Лос-Анджелес");

        System.out.println("\nОбновленные имена мошенников: " + fraudDetector.getFraudNames());
        System.out.println("Обновленные города мошенников: " + fraudDetector.getFraudCities());

        fraudDetector.setMaxSum(2000000);
        System.out.println("\nМаксимальная сумма установлена на: " + fraudDetector.getMaxSum());

    }
}