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

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private SearchingFacade searchingFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void findByPartOfNameFacade() throws SearchingProcessingException {
        //Given
        Employee johnSmithson = new Employee("John", "Smithson");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmithson);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmithson);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmithson.getCompanies().add(softwareMachine);
        johnSmithson.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        employeeDao.save(johnSmithson);
        int johnId = johnSmithson.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaId = lindaKovalsky.getId();

        List<Employee> employeeList = searchingFacade.searchingEmployee("son");
        System.out.println("##########");
        System.out.println(employeeList);

        List<Company> companyList = searchingFacade.searchingCompany("ter");
        System.out.println("##########");
        System.out.println(companyList);
        System.out.println("##########");

        //Then
        Assert.assertEquals(2, employeeList.size());
        Assert.assertEquals(2, companyList.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
            employeeDao.deleteById(johnId);
            employeeDao.deleteById(stephanieId);
            employeeDao.deleteById(lindaId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void findByPartOfName() throws SearchingProcessingException {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        employeeDao.save(johnSmith);
        int johnId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaId = lindaKovalsky.getId();

        List<Employee> employeeList = employeeDao.retrievePartOfLastName("Smith");
        System.out.println("##########");
        System.out.println(employeeList);
        List<Company> companyList = companyDao.retrievePartOfLastName("Software");
        System.out.println("##########");
        System.out.println(companyList);
        System.out.println("##########");

        //Then
        Assert.assertEquals(1, employeeList.size());
        Assert.assertEquals(1, companyList.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
            employeeDao.deleteById(johnId);
            employeeDao.deleteById(stephanieId);
            employeeDao.deleteById(lindaId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
