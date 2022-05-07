package com.baeldung.jaxws.server.topdown;
@WebService(
    name = "EmployeeServiceTopDown", 
    endpointInterface = "com.baeldung.jaxws.server.topdown.EmployeeServiceTopDown",
    targetNamespace = "http://topdown.server.jaxws.baeldung.com/")
  public class EmployeeServiceTopDownImpl 
    implements EmployeeServiceTopDown {
   
      @Inject 
      private EmployeeRepository employeeRepositoryImpl;
   
      @WebMethod
      public int countEmployees() {
          return employeeRepositoryImpl.count();
      }
  }