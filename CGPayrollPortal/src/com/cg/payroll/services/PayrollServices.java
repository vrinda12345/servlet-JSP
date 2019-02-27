package com.cg.payroll.services;
import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;

public interface PayrollServices {
Associate calculateNetSalary(int associateId)throws AssociateDetailsNotFoundException;
Associate getAssociateDetails(int associateId )throws AssociateDetailsNotFoundException;
double calculateAnnualGrossSalary(int associateId)throws AssociateDetailsNotFoundException;
List <Associate> getAllAssociateDetails( );
int acceptAssociateDetails(Associate associate);
}