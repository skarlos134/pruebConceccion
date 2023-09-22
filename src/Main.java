import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // Configuración de la conexión aquí
        String url = "jdbc:mysql://localhost:3306/consecionario"; // Reemplaza con la URL correcta de tu base de datos
        String usuario = "root"; // Reemplaza con el nombre de usuario correcto
        String contraseña = "Sk@rlos134"; // Reemplaza con la contraseña correcta

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            // Realiza operaciones de base de datos
            System.out.println("Conexión exitosa."); // Puedes agregar un mensaje de confirmación









        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

