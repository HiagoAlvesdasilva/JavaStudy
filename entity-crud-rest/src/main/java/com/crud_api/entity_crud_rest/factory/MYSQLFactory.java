package com.crud_api.entity_crud_rest.factory;

public class MYSQLFactory implements  ConnectionFactory{
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }
}
