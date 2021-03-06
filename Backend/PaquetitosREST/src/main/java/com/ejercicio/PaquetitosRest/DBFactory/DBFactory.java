package com.ejercicio.PaquetitosRest.DBFactory;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DBFactory {
    static final String JDBCHOST = "jdbc:mysql://localhost:3307/paquetitos?useSSL=false";
    static final String JDBCUSER = "root";
    static final String JDBCPASSWD = "root";

    public static DataSource getMySQLDataSource() {

	MysqlDataSource mysqlDS = null;

	mysqlDS = new MysqlDataSource();
	mysqlDS.setURL(JDBCHOST);
	mysqlDS.setUser(JDBCUSER);
	mysqlDS.setPassword(JDBCPASSWD);

	return mysqlDS;
    }

}
