package model.services.impl;

import model.dao.OrderDAO;
import model.dao.impl.MySQLFactoryDAO;
import model.entities.ApartmentType;
import model.entities.Order;
import model.entities.User;
import model.services.OrderService;

import java.sql.Date;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private MySQLFactoryDAO factoryDAO;

    public OrderServiceImpl() {
        factoryDAO = new MySQLFactoryDAO();
    }

    @Override
    public void createOrder(User user, Date dateFrom, Date dateTo, ApartmentType apartmentType, int numberOfRooms) {
        OrderDAO orderDAO = factoryDAO.getOrderDAO();
        Order order = new Order.OrderBuilder()
                .id(0)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .apartmentType(apartmentType.name())
                .accepted(0)
                .numberOfRooms(numberOfRooms)
                .client(user)
                .build();
        orderDAO.insert(order);
    }

    @Override
    public List<Order> showUserOrders(User user) {
        OrderDAO orderDAO = factoryDAO.getOrderDAO();
        return orderDAO.findByUser(user);
    }
}