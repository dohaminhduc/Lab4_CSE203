public class BankFactory {
    public static Bank getBank() {

        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("Invalid bank type");
        }
    }
}
