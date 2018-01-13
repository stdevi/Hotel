package model.services.impl;

import model.dao.ApartmentDAO;
import model.dao.impl.MySQLFactoryDAO;
import model.entities.Apartment;
import model.entities.Order;
import model.services.ApartmentService;

import java.util.List;

public class ApartmentServiceImpl implements ApartmentService {
    private MySQLFactoryDAO factoryDAO;

    public ApartmentServiceImpl(){
        factoryDAO = new MySQLFactoryDAO();
    }

    @Override
    public List<Apartment> showAvailableApartments(Order order) {
        ApartmentDAO apartmentDAO = factoryDAO.getApartmentDAO();
        return apartmentDAO.showAvailable(order);
    }
}