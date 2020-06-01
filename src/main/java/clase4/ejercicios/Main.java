package clase4.ejercicios;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        //String url = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
        //String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        // Cadena de conexión a mysql
        String url = "jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pass = "admin";
        try {
            // Objeto de conexión a la base de datos
            Connection myConnection = DriverManager.getConnection(url, user, pass);

            // Sentencia para poder conectarnos a la base de datos y ejecutar una sentencia sql
            Statement myStmt = myConnection.createStatement();

            // Creamos la sentencia de nuestro query
            String sql = "select * from test.persona";

            // Ejecutamos el query con el ResultSet
            ResultSet rs = myStmt.executeQuery(sql);

            // Se procesa el resultado y se recorre cada uno de los registros que contiene la variable ResultSet
            while (rs.next()) {
                System.out.print("Id persona: " + rs.getInt(1));
                //System.out.println(rs.getString("nombre"));
                System.out.print(" Nombre: " + rs.getString(2));
                System.out.println(" Apellido: " + rs.getString(3));
            }
            // Cerramos cada objeto que hemos utilizado
            rs.close();
            myStmt.close();
            myConnection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
