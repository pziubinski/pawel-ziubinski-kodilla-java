package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchingFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchingCompany(String partOfName) throws SearchingProcessingException {
        List<Company> companyList = companyDao.retrievePartOfLastName(partOfName);

        if (companyList.size() == 0) {
            throw new SearchingProcessingException(SearchingProcessingException.ERR_COMPANY_NOT_FOUND);
        }
        return companyList;
    }

    public List<Employee> searchingEmployee(String partOfName) throws SearchingProcessingException {
        List<Employee> employeeList = employeeDao.retrievePartOfLastName(partOfName);

        if (employeeList.size() == 0) {
            throw new SearchingProcessingException(SearchingProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employeeList;
    }
}
