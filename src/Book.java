public class Book {
    private final String mName;
    private final Author mAuthor;
    private int mPrice;
    private int mQuantity;
    public Book(String name, Author author, int price, int quantity) {
        mName = name;
        mAuthor = author;
        mPrice = price;
        mQuantity = quantity;
    }
    public String getName() {
        return mName;
    }
    public String getAuthor() {
        return (mAuthor.getName() + " (" + mAuthor.getGender() + ") at " + mAuthor.getEmail());
    }
    public int getPrice() {
        return mPrice;
    }
    public void setPrice(int price) {
        mPrice = price;
    }
    public int getQty() {
        return mQuantity;
    }
    public void setQty(int quantity) {
        mQuantity = quantity;
    }
    @Override
    public String toString() {
        return ("'" + mName + "' by " + getAuthor());
    }
}
