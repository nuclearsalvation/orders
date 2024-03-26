public class App {
    public static void main(String[] args) throws Exception {
        Saving saveToFile = new Saving();
        System.out.println("Введите заказ:");
        Order order = new OrderMake().orderMaker();
        saveToFile.saveToJson(order);
    }
}
