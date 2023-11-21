public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.calculate("3 + 4");
        chain.calculate("10 - 5");
        chain.calculate("3 * 4");
        chain.calculate("12 / 4");
        chain.calculate("3 # 4");
        chain.calculate("word word word");
    }
}
