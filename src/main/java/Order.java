import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(getOrderId());
        sb.append(", ");
        sb.append("\"products\": [");
        for (int j = 0; j < getProductsCount(); j++) {
            sb.append(getProduct(j));
        }

        if (getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");

        return sb.toString();
    }
}
