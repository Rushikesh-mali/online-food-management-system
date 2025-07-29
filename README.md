# Online Food Management System

This project is a simple backend implementation of an Online Food Management System using Java and Spring Boot.

## 📌 Features
- Interface-driven design using `FoodService`
- Multiple food services: Zomato, Swiggy, Zepto
- Factory pattern used to select service
- REST API using `@RestController` and `@GetMapping`
- Outputs order steps like:
  - pickOrderFromHotel
  - processOrderFromHotel
  - findLocationForDelivery
  - deliverOrder

## 🛠️ Technologies Used
- Java 17
- Spring Boot
- Maven

## ▶️ How to Run
1. Clone the repo:
git clone https://github.com/your-username/online-food-management-system.git

3. Open in your preferred IDE (IntelliJ, Eclipse, etc.)
4. Run the Spring Boot app
5. Use browser or Postman to test:
http://localhost:8080/order/zomato
http://localhost:8080/order/swiggy
http://localhost:8080/order/zepto
## 📄 Example Output :-Picking order from hotel...
Processing order...
Finding delivery location...
Delivering order...
Order Has-Been Delivered by Zepto successfully in 10 Mins......

## 📬 Contact
Made with ❤️ by Rushikesh Mali
