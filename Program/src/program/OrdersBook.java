import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OrdersBook {
   private List<Order> orders;

   public OrdersBook(List<Order> orders) {
      this.orders = orders;
   }

   public OrdersBook() {
      this.orders = new LinkedList<>();
   }

   public void addOrder(Order order) {
      this.orders.add(order);
   }

   public List<Order> getOrders() {
      return orders;
   }

   public void setOrders(List<Order> orders) {
      this.orders = orders;
   }

   public List<Order> SortOrders() {
      Collections.reverse(orders);
      return orders;
   }

   @Override
   public String toString() {
      return "OrderBook{" + "orders=" + orders + '}';
   }
}