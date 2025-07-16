# 🍽️ QR Restaurant Ordering System

This is a modern restaurant ordering platform that allows customers to scan a **QR code** at their table, browse the menu, place orders, and make payments — **all without needing to log in**. It also includes an **admin panel** for restaurant owners to manage menu items, view analytics, and gather customer feedback.

---

## 📌 Project Goals

- ✅ Seamless ordering flow via **QR code**
- ✅ **No login** required for customers
- ✅ **Admin panel** for menu, order, and feedback management
- ✅ Integration with a **third-party payment system** (e.g., Iyzico)
- ✅ Optional **cash payment** flow handled by a waiter
- ✅ Collect **feedback** after payment to enable **analytics**
- ✅ Use gathered data to help restaurant optimize performance

---

## ⚙️ Tech Stack

| Layer      | Technology                |
|------------|---------------------------|
| Backend    | Java, Spring Boot, REST API |
| Frontend   | React (or Vue)            |
| Database   | PostgreSQL                |
| Deployment | Docker + Docker Compose   |
| Auth       | JWT (Admin only)          |
| Payment    | Iyzico API (planned)      |

---

## 🚶 Flow of Events

1. Customer **scans a QR code** at their table.
2. QR code opens a link like:  
   `https://yourdomain.com/menu?tableId=5`
3. User browses the **menu** and adds items to cart.
4. User places an order → it is saved in the DB with the `tableId`.
5. User selects **payment type**:
   - **Credit Card** → redirected to Iyzico flow
   - **Cash** → waiter scans the same QR to see total and collects payment
6. After payment, user is shown a **feedback form**.
7. Feedback data is collected for **analytics**:
   - Most/least ordered dishes
   - Daily revenue
   - Low-rated items

---

## 🧱 System Modules

- `menu` → Categories and menu items
- `order` → Create and track orders
- `payment` → Online & offline payment processing
- `feedback` → Ratings and comments after order
- `admin` → Login, dashboard, analytics

---

## 🔐 Authentication

- Customers do **not** need an account
- Admin panel is protected using **JWT authentication**

---

## 🐳 Docker Setup (Planned)

```bash
# docker-compose.yml
- postgres
- spring boot backend
- optional: pgAdmin or Redis
