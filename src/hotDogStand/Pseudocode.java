/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotDogStand;

/**
 *
 * @author aungn
 */
public class Pseudocode {
        class Person
        { 
            String name;
            String email;

            String getName(){return "name";}
            String getEmail(){return "email";}
        }

        // An employee that works in a hot dog stand 
        class Employee extends Person
        {
            int employeeID; 
            int SSN;// 
            String shift; 
            int age;// 

            int getEmployeeID(){return 0;}
            String getShift(){return "shift";}
        } 

        class Customer extends Person{ 
            int customerID;
            String favoriteMeal;
            boolean createOrder(HotdogStand hd, OrderDetail[] od){return true;}
            void showOrder(Order o){}
        } 

        class HotDogStand //Information on the stand 
        { 
            String location; 
            Employee[] employees; 
            MenuItem[] menuItem; 
            Table[] tables;

            void addEmployee(Employee ep){}
            void addMenuItem(MenuItem mi){}
            void addTable(Table tb){}
            Employee[] getEmployee(){return employees;}
            MenuItem[] getMenuItems(){return menuItem;}
            Table[] getTables(){return tables;}
        } 

        class MenuItem // 
        { 
            int menuItemID; 
            String menuName; 
            double menuPrice;

            int getMenuItemID(){return 0;}
            String getMenuItemName(){return "MenuName";}
            double getMenuItemPrice(){return 0.0;}
        } 

        class Table 
        { 
            int tableID; 
            int capacity;

            int getTableID(){return 0;}
        }
        
        class OrderDetail
        {
            int orderDetailID;
            MenuItem menuItem;
            int quantity;
            
            void setMenuItem(MenuItem mi){}
            int getOrderDetailID(){return 0;}
            MenuItem getMenuItem(){return menuItem;}
            int getQuantity(){return quantity;}
        }

        class Order
        { 
            int orderID; 
            String orderDate;
            OrderDetail[] orderDetails;
            Employee serverEmployee;
            Table sittingTable; //can be null

            void createOrderDetail(MenuItem mi, int quantity){};
            void setServerEmployee(Employee ep){};
            void setSittingTable(Table tb){};
            int getOrderID(){return 0;}
            OrderDetail[] getOrderDetail(){return orderDetails;}
            Employee getServerEmployee(){return serverEmployee;}
            Table getSittingTable(){return sittingTable;}
            String getOrderDate(){return orderDate;}
        }

    
}
