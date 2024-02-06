package hibernate_one2many_bi;

import hibernate_one2many_bi.entity.Department;
import hibernate_one2many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);

            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("DONE!");
        }
        finally{
            session.close();
            factory.close();
        }
    }


}