package hibernate_one2one;

import hibernate_one2one.entity.Detail;
import hibernate_one2one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2_one2one_bin {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
//            Detail detail = new Detail("NY", "675456766", "nikareg@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());
//
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("DONE!");
        }
        finally{
            session.close();
            factory.close();
        }
    }


}