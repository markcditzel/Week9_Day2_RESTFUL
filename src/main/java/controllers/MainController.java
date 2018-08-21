package controllers;

import db.Seeds;

public class MainController {

    public static void main(String[] args) {

        Seeds.seedData(); // populate the db with

        ManagersController managersController = new ManagersController();
        EmployeesController employeeController = new EmployeesController();
        EngineersController engineersController = new EngineersController();
    }
}
