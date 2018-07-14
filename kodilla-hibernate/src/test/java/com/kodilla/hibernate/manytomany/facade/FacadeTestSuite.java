package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    Facade facade;

    @Test
    @Transactional
    public void testRetrieveCompanyByPartOfName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(greyMatter);
        //When
        List<Company> companyByPartOfName = facade.retrieveCompanyByPartOfName("Ma");
        //Then
        Assert.assertEquals(3, companyByPartOfName.size());
        //CleanUp
        companyDao.deleteAll();
    }
    @Test
    @Transactional
    public void testRetrieveEmployeesByPartOfName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        //When
        List<Employee> employeesByPartOfName = facade.retrieveEmployeesByPartOfName("it");
        //Then
        Assert.assertEquals(1, employeesByPartOfName.size());
        //CleanUp
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }
}

